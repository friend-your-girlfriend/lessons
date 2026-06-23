package ru.otus.java.basic;

public class Main {
    public static void main(String[] args) {

        Human[] humans = {
                new Human("Влад", 100),
                new Human("Костя", 20),
                new Human("Катя", 70)
        };

        Transport[] transports = {
                new Car(70),
                new Bike(),
                new CrossCountryVehicle(30),
                new Horse(60)
        };

        humans[0].getOn(transports[0]);
        humans[1].getOut(transports[1]);
        humans[2].getOn(transports[2]);
        humans[2].getOn(transports[3]);

        for (Human human: humans) {
            human.rideTo(100, TerrainType.DENSE_FOREST);
            human.rideTo(150, TerrainType.PLAIN);
            human.rideTo(60, TerrainType.SWAMP);
        }
    }
}
