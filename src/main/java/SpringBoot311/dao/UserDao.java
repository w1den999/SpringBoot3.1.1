package SpringBoot311.dao;

import SpringBoot311.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User show(long id);
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user, long id);
}