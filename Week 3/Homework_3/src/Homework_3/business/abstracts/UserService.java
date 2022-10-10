package Homework_3.business.abstracts;

import Homework_3.entities.concretes.User;

public interface UserService {
    void add(User user);

    void delete(User user);
}
