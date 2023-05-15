package Project.Controller;

import Project.Class.Users;
import Project.Service.ClientService;
import Project.Service.impl.ClientServiceImpl;

import java.util.Scanner;

public class ClientController {
    private final ClientService clientService = new ClientServiceImpl();

    public void clientMenu(Scanner scanner, Users users) {
        System.out.println("Добро пожаловать " + users.getName() + " " + users.getSurName());
        System.out.println("Выберите действие:\n" +
                "1 - Обмен валюты\n" +
                "2 - Перевод средств на другой счет\n" +
                "3 - Просмотр текущих счетов\n" +
                "4 - Просмотр текущих курсов\n" +
                "5 - Создание счета\n" +
                "6 - Внесение денег на счет\n" +
                "7 - Удаление счета\n" +
                "8 - Смена пароля\n" +
                "9 - Смена логина\n" +
                "10 - Посчитать общую сумму на счетах в BYN\n" +
                "11 - Вывести все операции по счету за промежуток времени\n" +
                "12 - Выход");
        String numberAction = scanner.next();
        switch (numberAction) {
            case "5":
                System.out.println("Введите номер счета");
                long accountNumber = scanner.nextLong();
                System.out.println("Введите валюту счета");
                String currency = scanner.next();
                clientService.addAccounts(accountNumber, currency, users.getId());
                break;
            case "12":
                System.exit(1);
        }
        clientMenu(scanner, users);
    }
}
