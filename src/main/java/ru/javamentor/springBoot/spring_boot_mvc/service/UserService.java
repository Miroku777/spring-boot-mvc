package ru.javamentor.springBoot.spring_boot_mvc.service;

import ru.javamentor.springBoot.spring_boot_mvc.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(long id);

    List<User> showAllUsers();

    void createNewUser(User user);

    void updateUser(User user);

    void removeUserById(long id);
}
