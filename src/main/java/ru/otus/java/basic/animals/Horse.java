package ru.otus.java.basic.animals;

public class Horse extends Animal{
    private final int RUN_STAMINA_COST = 1;
    private final int SWIM_STAMINA_COST = 4;

    public Horse(String name, float runningSpeed, float swimmingSpeed, int stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);
    }

    @Override
    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + runningSpeed);
        System.out.println("Скорость плавания: " + swimmingSpeed);
        System.out.println("Выносливость: " + stamina);
    }

    @Override
    public float run(int distance) {
        float tempStamina = stamina - wasteStamina(distance, RUN_STAMINA_COST);
        return spendTime(distance, tempStamina, "run");
    }

    public float swim(int distance) {
        float tempStamina = stamina - wasteStamina(distance, SWIM_STAMINA_COST);
        return spendTime(distance, tempStamina, "swim");
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
        } else if (action.equals("swim")) {
            return distance / swimmingSpeed;
        } else {
            return -1;
        }
    }
}
