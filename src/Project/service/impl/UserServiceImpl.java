package Project.service.impl;

import Project.class_ob.Role;
import Project.class_ob.Users;
import Project.exception.ExceptionUsers;
import Project.service.UserService;
import Project.repository.RepositoryUser;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final RepositoryUser repositoryUser;

    public UserServiceImpl(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
    }

    @Override
    public Users createUsers(String login, String password, String name, String surName) {
        List<Users> list = repositoryUser.deserialization();
        Users users = new Users(login, password, name, surName);
        if (list.size() == 0) users.setRole(Role.ADMIN);
        else users.setRole(Role.CLIENT);
        repositoryUser.serialization(users);
        return users;
    }

    public Users cheakUsers(String login, String password) throws ExceptionUsers {
        List<Users> usersList = repositoryUser.deserialization();
        for (Users users : usersList) {
            if (users.getLogin().equals(login) && users.getPassword().equals(password)) {
                return users;
            } else if (users.getLogin().equals(login) && !users.getPassword().equals(password)) {
                throw new ExceptionUsers("Пароль не подходит");
            }
        }
        throw new ExceptionUsers("Пользователь не найден");
    }
}
