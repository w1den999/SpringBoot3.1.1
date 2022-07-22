package SpringBoot311.service;

import SpringBoot311.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User show(long id);
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(User updatedUser, long id);

}
