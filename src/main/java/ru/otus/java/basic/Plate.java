package ru.otus.java.basic;

public class Plate {
    int maxAmountFood;
    int currentAmountFood;

    public Plate(int maxAmountFood) {
        this.maxAmountFood = maxAmountFood;
        this.currentAmountFood = maxAmountFood;
    }

    public void addFood(int food) {
        if (currentAmountFood == maxAmountFood) {
            return;
        }
        if (currentAmountFood + food > maxAmountFood) {
            return;
        }

        currentAmountFood += food;
    }

    public boolean decreaseFood(int food) {
        if (currentAmountFood - food <= 0) {
            return false;
        }

        currentAmountFood -= food;
        return true;
    }
}


