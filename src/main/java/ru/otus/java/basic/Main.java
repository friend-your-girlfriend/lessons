package ru.otus.java.basic;

import ru.otus.java.basic.animals.Animal;
import ru.otus.java.basic.animals.Cat;
import ru.otus.java.basic.animals.Dog;
import ru.otus.java.basic.animals.Horse;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Виски", 4, 0, 110),
                new Dog("Тайсон", 3, 2, 80),
                new Horse("Капля", 4, 2, 150)};

        printAnimalsInfo(animals);
        runAnimals(animals, 100);
        printAnimalsInfo(animals);
        swimAnimals(animals, 100);
        printAnimalsInfo(animals);
    }

    public static void printAnimalsInfo(Animal[] animals) {
        System.out.println("Информация о животных");

        for (int i = 0; i < animals.length; i++) {
            animals[i].info();
            System.out.println("---------------------");
        }
    }

    public static void runAnimals(Animal[] animals, int distance) {
        System.out.println("Животные начали забег: ");
        for (int i = 0; i < animals.length; i++) {
            float runTime = animals[i].run(distance);
            if (runTime == -1) {
                System.out.println(animals[i].getName() + " устал(а) или не умеет бегать");
            } else {
                System.out.println(animals[i].getName() + " пробежал(а) " + distance + "м за " + runTime + "с");
            }
        }
    }

    public static void swimAnimals(Animal[] animals, int distance) {
        System.out.println("Животные начали заплыв: ");
        for (int i = 0; i < animals.length; i++) {
            float swimTime = animals[i].swim(distance);
            if (swimTime == -1) {
                System.out.println(animals[i].getName() + " устал(а) или не умеет плавать");
            } else {
                System.out.println(animals[i].getName() + " проплыл(а) " + distance + "м за " + swimTime + "с");
            }
        }
    }
}
