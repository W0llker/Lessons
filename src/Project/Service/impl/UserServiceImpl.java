package Project.Service.impl;

import Project.Class.Role;
import Project.Class.Users;
import Project.Service.UserService;
import Project.Validator.UsersValidator;
import Project.repository.RepositoryUser;

public class UserServiceImpl implements UserService {
    @Override
    public Users createUsers(String login, String password, String name, String surName) {
        UsersValidator.cheakLogin(login);
        Users users = new Users(login, password, name, surName);
        users.setRole(Role.CLIENT);
        users.setId(1);
        RepositoryUser.saveUsers(users);
        return users;
    }

    public Users cheakUsers(String login, String password) {
        return RepositoryUser.loadUsers(login, password);
    }
}
