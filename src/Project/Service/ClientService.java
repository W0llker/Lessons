package Project.Service;

import Project.Class.Accounts;

public interface ClientService {
    Accounts addAccounts(long accountNumber, String currency, long userId);
}
