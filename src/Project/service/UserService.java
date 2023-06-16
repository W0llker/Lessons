package Project.service;

import Project.class_ob.Users;
import Project.exception.ExceptionUsers;

public interface UserService {
    Users createUsers(String login, String password, String name, String surName) throws ExceptionUsers;

    Users cheakUsers(String login, String password) throws ExceptionUsers;
}
