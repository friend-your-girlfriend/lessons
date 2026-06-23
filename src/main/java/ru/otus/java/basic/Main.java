package ru.otus.java.basic;

import ru.otus.java.basic.animals.Cat;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Виски", 2, 2, 100,5),
                new Cat("Барсик", 2, 2, 100,3),
                new Cat("Соня", 2, 2, 100,3),
                new Cat("Маруся", 2, 2, 100,6),
        };

        Plate[] plates = {
                new Plate(10),
                new Plate(3),
                new Plate(4)
        };

        for (int i = 0; i < plates.length; i++) {
            for (int j = 0; j < cats.length; j++) {
                if (plates[i].getCurrentAmountFood() == 0) {
                    break;
                }

                cats[j].eat(plates[i]);
            }
        }

        for (Cat cat: cats) {
            cat.printInfo();
        }
    }
}
