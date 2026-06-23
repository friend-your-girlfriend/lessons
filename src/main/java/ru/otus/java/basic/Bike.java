package ru.otus.java.basic;

public class Bike implements Transport{
    private float consumption = 0.14f;
    @Override
    public boolean transportation(float distance, TerrainType type) {
        if (type == TerrainType.SWAMP) {
            return false;
        }

        return true;
    }

    public float getConsumption() {
        return consumption;
    }
}
