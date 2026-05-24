package ru.otus.java.basic.animals;

public abstract class Animal {
    String name;
    float runningSpeed;
    float swimmingSpeed;
    float stamina;

    public String getName() {
        return name;
    }

    public float getRunningSpeed() {
        return runningSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public float getStamina() {
        return stamina;
    }
    public Animal(String name, float runningSpeed, float swimmingSpeed, int stamina) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
    }

    public abstract void info();

    public abstract float run(int distance);
    public abstract float swim(int distance);

    public abstract float wasteStamina(int distance, int staminaCosts);

    public abstract float spendTime(int distance, float stamina, String action);
}
