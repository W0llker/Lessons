package Project.Validator;

import Project.Class.Users;
import Project.Exception.ExceptionUsers;
import Project.repository.RepositoryUser;

import java.util.List;

public class UsersValidator {
    public static void cheakLogin(String login) throws ExceptionUsers {
        List<Users> list = RepositoryUser.getList();
        for (Users users : list) {
            if(users.getLogin().equals(login)) {
                throw new ExceptionUsers("Данный логин уже есть " + login);
            }
        }
    }
}
