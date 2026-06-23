package ru.otus.java.basic;

public class Car implements Transport{
    private float fuel;
    final float CONSUMPTION = 0.06f;
    public Car(float fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean transportation(float distance, TerrainType type) {
        if (type == TerrainType.DENSE_FOREST || type == TerrainType.SWAMP) {
            return false;
        }

        fuel -= distance * CONSUMPTION;

        if (fuel < 0) {
            fuel = 0;
            System.out.println("У транспорта закончился бензин.");
            return false;
        }

        return true;
    }
}
