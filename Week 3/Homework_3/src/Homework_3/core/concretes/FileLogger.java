package Homework_3.core.concretes;

import Homework_3.core.abstracts.Logger;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Dosya'ya loglandı: " + message);
    }
}
