package Homework_3.core.concretes;

import Homework_3.core.abstracts.Logger;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Database'e loglandı: " + message);
    }
}
