package ru.otus.java.basic.animals;

import ru.otus.java.basic.Plate;

public class Cat extends Animal {
    int appetite;
    boolean satiety;

    public Cat(String name, float runningSpeed, float swimmingSpeed, int stamina, int appetite) {
        super(name, runningSpeed, swimmingSpeed, stamina);

        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (!satiety) {
            satiety = plate.decreaseFood(appetite);
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Имя: "+ name);
        System.out.print("Сытость: ");
        if (satiety) {
            System.out.println("сыт");
        } else {
            System.out.println("голоден");
        }
//        System.out.println("Скорость бега: " + runningSpeed);
//        System.out.println("Скорость плавания: " + swimmingSpeed);
//        System.out.println("Выносливость: " + stamina);
    }
}
