package com.solvewithajeet.smallwebapp.dao;

import com.solvewithajeet.smallwebapp.Registration;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Registration, Long> {

}
