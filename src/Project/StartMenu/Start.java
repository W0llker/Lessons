package Project.StartMenu;

import Project.Class.Role;
import Project.Class.Users;
import Project.Controller.AdminController;
import Project.Controller.ClientController;
import Project.Controller.UserController;

import java.util.Scanner;

public class Start {
    public static void menu() {
        String work = "";
        ClientController clientController = new ClientController();
        AdminController adminController = new AdminController();
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        while (!work.equals("stop")) {
            System.out.println("1 - Регистрация пользователя\n" +
                    "2 - Войти в личный кабинет");
            work = scanner.next();
            if(work.equals("1")) {
                Users users = userController.registration(scanner);
                System.out.println(users);
            }else if(work.equals("2")){
                Users users = userController.autotenification(scanner);
                lestgoMenu(users,clientController,adminController,scanner);
            }
        }
    }
    public static void lestgoMenu(Users users,ClientController clientController, AdminController adminController,Scanner scanner) {
        if(users.getRole().equals(Role.ADMIN)) {
            adminController.adminMenu(scanner, users);
        } else if(users.getRole().equals(Role.CLIENT)) {
            clientController.clientMenu(scanner, users);
        }
    }

}
