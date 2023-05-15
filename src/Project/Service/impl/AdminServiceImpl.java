package Project.Service.impl;

import Project.Class.Users;
import Project.Service.AdminService;
import Project.repository.RepositoryUser;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Override
    public void getAllClient() {
        System.out.println(RepositoryUser.getList());
    }
}
