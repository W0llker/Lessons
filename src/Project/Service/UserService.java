package Project.Service;

import Project.Class.Users;

public interface UserService {
    Users createUsers(String login, String password, String name, String surName);

    Users cheakUsers(String login, String password);
}
