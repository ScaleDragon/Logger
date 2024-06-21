package ru.netology.homeWork;

import java.util.ArrayList;
import java.util.Random;

public class RandomList {

    public static ArrayList<Integer> randomList(int size, int treshold) {
        ArrayList randomList = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(treshold));
        }
        return randomList;
    }

}
