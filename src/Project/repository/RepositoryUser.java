package Project.repository;

import Project.Class.Users;
import Project.Exception.ExceptionUsers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepositoryUser {
    private final static File file = new File("src/Project/users.txt");

    public static void saveUsers(Users users) {
        List<Users> list = getList();
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file))) {
            users.setId(list.size());
            list.add(users);
            stream.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Users> getList() {
        List<Users> list = new ArrayList<>();
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file))) {
            list = (List<Users>) stream.readObject();
        } catch (Exception e) {
        }
        return list;
    }

    public static Users loadUsers(String login, String password) {
        List<Users> list = getList();
        for (Users users : list) {
            if (users.getLogin().equals(login) && users.getPassword().equals(password)) {
                return users;
            } else if (users.getLogin().equals(login) && !users.getPassword().equals(password)) {
                throw new ExceptionUsers("Пароль не подходит");
            }
        }
        throw new ExceptionUsers("Пользователь не найден");
    }

    public void update() {

    }
}
