package ru.otus.java.basic.animals;

public class Animal {
    String name;
    float runningSpeed;
    float swimmingSpeed;
    int stamina;

    public Animal(String name, float runningSpeed, float swimmingSpeed, int stamina) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
    }

    public void printInfo() {
        System.out.println("Имя: "+ name);
        System.out.println("Скорость бега: " + runningSpeed);
        System.out.println("Скорость плавания: " + swimmingSpeed);
        System.out.println("Выносливость: " + stamina);
    }

    public float run(int distance) {
        int tempStamina = stamina - distance;

        if (tempStamina <= 0) {
            System.out.println("Время: -1");
            return -1;
        }

        stamina = tempStamina;

        System.out.println(name + " пробежал");
        return distance - runningSpeed;
    }

}
