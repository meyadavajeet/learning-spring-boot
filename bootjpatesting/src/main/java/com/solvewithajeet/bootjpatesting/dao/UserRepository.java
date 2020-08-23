package com.solvewithajeet.bootjpatesting.dao;

import com.solvewithajeet.bootjpatesting.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    //creating custom method and use it in the main development
    public List<User> findByName(String name);

    public  List<User> findByNameAndCity(String name, String city);

    @Query("select u from User u")
    public List<User> getAllUser();

    @Query("select u from User u where u.name =:n and u.city =:c")
    public List<User> getUserByName(@Param("n") String name,@Param("c") String city);

    @Query(value = "select  * from user",nativeQuery = true)
    public List<User> getUser();


}
