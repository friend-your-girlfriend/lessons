package ru.otus.java.basic.animals;

public class Horse extends Animal{
    public Horse(String name, float runningSpeed, float swimmingSpeed, int stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);

    }

    public float swim(int distance) {
        int tempStamina = stamina - (distance * 2);

        if (tempStamina <= 0) {
            System.out.println(name + " устал");
            return -1;
        }
        stamina = tempStamina;
        return distance - swimmingSpeed;
    }
}
