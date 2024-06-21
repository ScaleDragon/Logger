package ru.netology.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(Integer treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        list.stream().filter(count -> {
            if (count >= treshold) {
                logger.log("Элемент " + "\"" + count + "\"" + " проходит");
                result.add(count);
            } else {
                logger.log("Элемент " + "\"" + count + "\"" + " не проходит");
            }
            return false;
        }).toList();
        logger.log("Прошло фильтр " + result.size() + " элемента(-ов) из " + list.size());
        return result;
    }

}


