package Project.Controller;

import Project.Class.Users;
import Project.Service.AdminService;
import Project.Service.impl.AdminServiceImpl;

import java.util.Scanner;

public class AdminController {
    private final AdminService lmp;

    public AdminController() {
        this.lmp = new AdminServiceImpl();
    }

    public void adminMenu(Scanner scanner, Users users) {
        System.out.println("Добро пожаловать " + users.getName() + " " + users.getSurName());
        System.out.println("Выберите действие:\n" +
                "1 - Просмотр всех клиентов\n" +
                "2 - Просмотр операций по клиенту\n" +
                "3 - Удаление клиента\n" +
                "4 - Смена пароля\n" +
                "5 - Смена логина\n" +
                "6 - Создание счета\n" +
                "7 - Просмотр счета с коммисиями\n" +
                "8 - Просмотр счета с неоплаченными коммисиями\n" +
                "9 - Перевод коммисий на счет\n" +
                "10 - Получить сумму коммисий не переведенных\n" +
                "11 - Регистрация пользователя\n" +
                "12 - Просмотр клиента по логину\n" +
                "13 - Просмотр всех счетов\n" +
                "14 - Просмотр всех операций\n" +
                "15 - Выход");
        String numberAction = scanner.next();
        switch (numberAction) {
            case "1":
                lmp.getAllClient();
                break;
        }
        adminMenu(scanner, users);
    }
}
