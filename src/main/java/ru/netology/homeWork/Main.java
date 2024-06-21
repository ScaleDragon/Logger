package ru.netology.homeWork;

import java.util.*;

import static ru.netology.homeWork.RandomList.randomList;

public class Main {

    public static void main(String[] args) {
        int listSize;
        int upperLimit;
        int filterThreshold;
        ArrayList randomList;

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Введите входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            while (true) {
                System.out.print("Введите размер списка: ");
                listSize = scanner.nextInt();
                if (listSize > 2) {
                    System.out.print("Введите верхнюю границу для значений: ");
                    upperLimit = scanner.nextInt();

                    logger.log("Создаём и наполняем список");
                    randomList = randomList(listSize, upperLimit);
                    System.out.println("Вот случайный список: " + randomList);

                    logger.log("Просим пользователя ввести входные данные для фильтрации");
                    System.out.print("Введите порог для фильтра: ");
                    filterThreshold = scanner.nextInt();
                    Filter filter = new Filter(filterThreshold);
                    System.out.println("Запускаем фильтрацию");
                    randomList = (ArrayList) filter.filterOut(randomList);
                    Collections.sort(randomList);
                    logger.log("Выводим результат на экран");
                    System.out.println("Отфильтрованный/отсортированный список: " + randomList);
                    logger.log("Завершаем программу");
                    break;
                } else {
                    logger.log("Размер списка должен быть больше 2");
                    continue;
                }
            }
        } catch (Exception e) {
            throw new InputMismatchException("Нужно ввести числовое значение \"int\", а введено " + scanner);
        }
    }
}
