package Project.controller;

import Project.class_ob.Users;
import Project.exception.ExceptionUsers;
import Project.service.UserService;
import Project.service.impl.UserServiceImpl;
import Project.validator.UsersValidator;
import Project.repository.RepositoryUser;

import java.util.Scanner;

public class UserController {
    private final UserService userService;
    private final UsersValidator usersValidator;

    public UserController(RepositoryUser repositoryUser) {
        userService = new UserServiceImpl(repositoryUser);
        usersValidator = new UsersValidator();
    }

    public Users registration(Scanner scanner) throws ExceptionUsers {
        System.out.println("Введите логин");
        String login = scanner.next();
        usersValidator.checkLogin(login);
        System.out.println("Введите пароль");
        String password = scanner.next();
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Введите фамилию");
        String surName = scanner.next();
        return userService.createUsers(login, password, name, surName);
    }

    public Users autotenification(Scanner scanner) throws ExceptionUsers {
        System.out.println("Введите логин");
        String login = scanner.next();
        System.out.println("Введите пароль");
        String password = scanner.next();
        return userService.cheakUsers(login, password);
    }
}
