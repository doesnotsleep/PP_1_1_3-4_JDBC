package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userDao = new UserServiceImpl();

        userDao.createUsersTable();

        userDao.saveUser("Name1", "LastName1", (byte) 10);
        userDao.saveUser("Name2", "LastName2", (byte) 20);
        userDao.saveUser("Name3", "LastName3", (byte) 30);
        userDao.saveUser("Name4", "LastName4", (byte) 40);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
