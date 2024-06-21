package ru.netology.homeWork;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger;
    private int num = 1;

    private Logger() {
    }

    public void log(String msg) {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentTime = new Date();
        System.out.println("[" + formater.format(currentTime) + " " + num++ + "]" + " " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
