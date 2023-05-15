package Project.Service.impl;

import Project.Class.Accounts;
import Project.Class.Users;
import Project.Controller.ClientController;
import Project.Service.ClientService;

import java.util.Scanner;

public class ClientServiceImpl implements ClientService {


    @Override
    public Accounts addAccounts(long accountNumber, String currency, long userId) {
        Accounts accounts = new Accounts(accountNumber, currency, userId);
        System.out.println(accounts);
        return accounts;
    }
}
