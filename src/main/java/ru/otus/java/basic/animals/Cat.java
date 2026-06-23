package ru.otus.java.basic.animals;

public class Cat extends Animal {
    private final int RUN_STAMINA_COST = 1;

    public Cat(String name, float runningSpeed, float swimmingSpeed, int stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);
    }

    @Override
    public void info() {
        System.out.println("Имя: "+ name);
        System.out.println("Скорость бега: " + runningSpeed);
        System.out.println("Скорость плавания: " + swimmingSpeed);
        System.out.println("Выносливость: " + stamina);
    }

    @Override
    public float run(int distance) {
        float tempStamina = stamina - wasteStamina(distance, RUN_STAMINA_COST);
        return spendTime(distance, tempStamina, "run");
    }

    @Override
    public float swim(int distance) {
        return -1;
    }

    @Override
    public float wasteStamina(int distance, int staminaCosts) {
         return (float)(distance * staminaCosts);
    }

    @Override
    public float spendTime(int distance, float stamina, String action) {
        if (stamina < 0) {
            this.stamina = 0;
            return -1;
        }
        this.stamina = stamina;
        if (action.equals("run")) {
            return distance / runningSpeed;
        } else {
            return -1;
        }
    }
}
