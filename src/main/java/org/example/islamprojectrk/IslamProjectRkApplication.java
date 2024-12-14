package org.example.islamprojectrk;

import org.example.islamprojectrk.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IslamProjectRkApplication implements CommandLineRunner {

    private final UserService userService;

    public IslamProjectRkApplication(UserService u){this.userService = u;}

    public static void main(String[] args) {
        SpringApplication.run(IslamProjectRkApplication.class, args);
    }

    @Override
    public void run(String... args) {
        if(userService.findAll().isEmpty()){
            userService.createUser("Title One", "user1@example.com", "src/main/resources/static/images/cappadocia.jpg");
            userService.createUser("Title Two", "user2@example.com", "src/main/resources/static/images/riodejaneiro.jpg");
            userService.createUser("Title Three", "user3@example.com", "src/main/resources/static/images/riodejaneiro.jpg");
        }
    }
}
