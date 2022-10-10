package Homework_3.business.concretes;

import Homework_3.business.abstracts.UserService;
import Homework_3.entities.concretes.User;

public class IndividualUserManager implements UserService {
    @Override
    public void add(User user) {
        System.out.println(user.getId() + " id'sine sahip user eklendi.");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getId() + " id'sine sahip user silindi.");
    }
}
