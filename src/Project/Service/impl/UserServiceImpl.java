package Project.Service.impl;

import Project.Class.Role;
import Project.Class.Users;
import Project.Exception.ExceptionUsers;
import Project.Service.UserService;
import Project.Validator.UsersValidator;
import Project.repository.RepositoryUser;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final RepositoryUser repositoryUser;
    public UserServiceImpl(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
    }

    @Override
    public Users createUsers(String login, String password, String name, String surName) {
        Users users = new Users(login, password, name, surName);
        users.setRole(Role.CLIENT);
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
