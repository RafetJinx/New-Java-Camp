package Homework_3.dataAccess.concretes;

import Homework_3.dataAccess.abstracts.UserDao;
import Homework_3.entities.concretes.User;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Hibernate veritabanına eklendi.");
    }
}
