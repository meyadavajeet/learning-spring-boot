package com.solvewithajeet.bootjpatesting;

import com.solvewithajeet.bootjpatesting.dao.UserRepository;
import com.solvewithajeet.bootjpatesting.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class BootjpatestingApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootjpatestingApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);


//        save single user in the db
//        User user = new User();
//        user.setName("Ajeet Yadav");
//        user.setCity("Ranchi");
//        user.setStatus("I am a java programmer");
//
//        User user1 = userRepository.save(user);
//        System.out.println(user1);

//        //      end of save single user in the db

//         save multiple user in db
//        User user1 = new User();
//        user1.setName("Ajeet Yadav");
//        user1.setCity("Ranchi");
//        user1.setStatus("I am a java programmer");
//
//        User user2 = new User();
//        user2.setName("Rohit Yadav");
//        user2.setCity("Madhoput");
//        user2.setStatus("He is a accountant");

////        make list to save multiple user
//        List<User> userList = List.of(user1,user2); //java 9 and above function
//        //save multiple object
//        Iterable<User> result = userRepository.saveAll(userList);
//
//        //print saved user in console using foreach and lamda expression
//        result.forEach(user -> {
//            System.out.println(user);
//        });
//        System.out.println("done");

//        end of save multiple user

//        //update user of id 2
//        Optional<User> optionalUser = userRepository.findById(2);
//        User user = optionalUser.get();
//        user.setName("Rohita Kumari");
//        User result = userRepository.save(user);
//        System.out.println(result +"done");

//   //end of update by id(2)

        //how to ge all data findAll()
//        first method
//        findById(id) - return Optional containing your data
//        Iterable<User> itr = userRepository.findAll();
////            old method to print all object of table user
//        Iterator<User> iterator = itr.iterator();
//        while (iterator.hasNext()) {
//            User user = iterator.next();
//            System.out.println(user);
//        }
        //second method using consumer
//        Iterable<User> itr = userRepository.findAll();
//        itr.forEach(new Consumer<User>() {
//            @Override
//            public void accept(User user) {
//                System.out.println(user);
//            }
//        });

        //using third method using lamda expression above java8
//        Iterable<User> itr = userRepository.findAll();
//        itr.forEach(user -> {
//            System.out.println(user);
//        });

// delete by id
//        userRepository.deleteById(2);
//        System.out.println("deleted");

        //delete all data of a table
//        Iterable<User> allUser = userRepository.findAll();
//        allUser.forEach(user -> {
//            System.out.println(user);
//        });
//        userRepository.deleteAll(allUser);
//        System.out.println("All user deleted Successfully");

        //calling custom method
//       Iterable<User> itr =  userRepository.findByName("ajeet");
//       itr.forEach(user -> System.out.println(user));
//
//       Iterable<User> itr2 = userRepository.findByNameAndCity("ajeet","ranchi");
//       itr2.forEach(user -> System.out.println(user));
//
//        custom query
        List<User> allUser = userRepository.getAllUser();
        allUser.forEach(e->{
            System.out.println(e);
        });
        System.out.println("_____________________________________");

        List<User> userByName = userRepository.getUserByName("ajeet","ranchi");
        userByName.forEach(user -> {
            System.out.println(user);
        });

        System.out.println("-----------------------------------------");

        //native query
        userRepository.getUser().forEach(e-> System.out.println(e));

    }

}
