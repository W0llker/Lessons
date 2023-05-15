package Project.Controller;

import Project.Class.Users;
import Project.Service.UserService;
import Project.Service.impl.UserServiceImpl;

import java.util.Scanner;

public class UserController {
    private final UserService userService = new UserServiceImpl();

    public Users registration(Scanner scanner) {
        System.out.println("Введите логин");
        String login = scanner.next();
        System.out.println("Введите пароль");
        String password = scanner.next();
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Введите фамилию");
        String surName = scanner.next();
        return userService.createUsers(login, password, name, surName);
    }

    public Users autotenification(Scanner scanner) {
        System.out.println("Введите логин");
        String login = scanner.next();
        System.out.println("Введите пароль");
        String password = scanner.next();
        return userService.cheakUsers(login, password);
    }
}
