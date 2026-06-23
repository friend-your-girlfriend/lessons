package ru.otus.java.basic;

public class Human {
    private String name;
    private Transport currentTransport;
    private float energy;

    final float CONSUMPTION = 0.2f;

    public Human(String name, float energy) {
        this.name = name;
        this.energy = energy;
    }

    public void getOn(Transport transport) {
        if (currentTransport != null) {
            System.out.println(name + " уже в/на транспорте, слезьте с текущего и попробуйте еще раз.");
            return;
        }
        System.out.println(name + " сел(а) на транспорт");
        currentTransport = transport;
    }

    public void getOut(Transport transport) {
        if (currentTransport == null) {
            System.out.println(name + " уже не в/на транспорте.");
            return;
        }

        System.out.println(name + " слез(ла)/вышел(-ла) из транспорта.");
        currentTransport = null;
    }

    public void rideTo(float distance, TerrainType type) {
        if (currentTransport == null) {
            System.out.println(name + " попытался(-лась) пройти " + type + " пешком");

            if (goTo(distance, type)) {
                System.out.println("Успешно!");
            } else {
                System.out.println("Неуспешно!");
            }

            return;
        }
        System.out.println(name + " попытался(-лась) пройти " + type + " на транспорте");
        if(currentTransport.transportation(distance, type)) {
            System.out.println("Успешно!");
        } else {
            System.out.println("Неуспешно!");
        }

        if (currentTransport instanceof Bike) {
            energy -= distance * ((Bike) currentTransport).getConsumption();

            if (energy < 0) {
                energy = 0;
                System.out.println("У " + name + " закончилась энергия");
            }
        }
    }

    private boolean goTo(float distance, TerrainType type) {
        if (type == TerrainType.SWAMP) {
            return false;
        }

        energy -= distance * CONSUMPTION;

        if (energy < 0) {
            energy = 0;
            System.out.println("У " + name + " закончилась энергия.");
            return false;
        }

        return true;
}
}
