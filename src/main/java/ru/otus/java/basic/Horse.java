package ru.otus.java.basic;

public class Horse implements Transport{
    private float energy;
    final float CONSUMPTION = 0.12f;

    public Horse(float energy) {
        this.energy = energy;
    }

    @Override
    public boolean transportation(float distance, TerrainType type) {
        if (type == TerrainType.SWAMP) {
            return false;
        }

        energy -= distance * CONSUMPTION;

        if (energy < 0) {
            energy = 0;

            System.out.println("У лошади закончилась энергия.");
            return false;
        }

        return true;
    }
}
