package ru.otus.java.basic;

public class CrossCountryVehicle implements Transport{
    private float fuel;
    final float CONSUMPTION = 0.1f;

    public CrossCountryVehicle(float fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean transportation(float distance, TerrainType type) {
        fuel -= distance * CONSUMPTION;

        if (fuel < 0) {
            fuel = 0;
            System.out.println("У транспорта закончился бензин.");
            return false;
        }

        return true;
    }
}
