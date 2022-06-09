package com.company;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
/** City деген класс тузунуз. (code, name, ...)
 Эгерде code так сан болсо TreeSetke салыныз.
 Аларды чонунан кичинесине караган тартипте чыгарыныз. */
        Random random = new Random();
        Set<City> set = new HashSet<>();
        set.add(new City(random.nextInt(10), " Бишкек!"));
        set.add(new City(random.nextInt(20), " Нарын!"));
        set.add(new City(random.nextInt(30), " Гонг-Конг!"));
        set.add(new City(random.nextInt(40), " Москва!"));
        set.add(new City(random.nextInt(50), " Баку!"));
        set.add(new City(random.nextInt(60), " Гаваи!"));
        set.add(new City(random.nextInt(70), " Тайланд!"));
        set.add(new City(random.nextInt(80), " Нюйорк!"));

        Set<City> treeSet = new TreeSet<>(set);
        Set<City> treeSetTak = new TreeSet<>(set);

        for (City city : treeSet) {
            if (city.getCode() % 2 != 0) {
                treeSet.add(city);
                System.out.println(city);
            }
        }
        System.out.println("* * * * * * * * * * *");
        for (City city : treeSetTak) {
            if (city.getCode() % 2 != 1) {
                treeSetTak.add(city);
                System.out.println(city);
            }
        }


    }
}