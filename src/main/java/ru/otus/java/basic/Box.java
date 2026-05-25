package ru.otus.java.basic;

public class Box {
    private int length;
    private int height;
    private int width;
    private String color;
    private String item;
    boolean isOpen;

    public Box(int length, int height, int width, String color) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.color = color;
        this.item = "empty";
        this.isOpen = false;
    }

    public void open() {
        isOpen = true;
        System.out.println("Коробку открыли");
    }

    public void close() {
        isOpen = false;
        System.out.println("Коробку закрыли");
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Изменили цвет на " + color);
    }

    public void printInfo() {
        System.out.println("-------------");
        System.out.println("Размер: " + length + "x" + width + "x" + height);
        System.out.println("Цвет: " + color);

        if (isOpen) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }

        if (item.equals("empty")) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("В коробке предмет: " + item);
        }

        System.out.println("-------------");
    }

    public void inputItem(String item) {
        if (!isOpen) {
            System.out.println("Невозможно положить предмет, коробка закрыта");
            return;
        }
        if (!this.item.equals("empty")) {
            System.out.println("Невозможно положить предмет, коробка не пустая");
            return;
        }

        this.item = item;
        System.out.println("Положили в коробку: " + item);
    }

    public void takeItem() {
        if (!isOpen) {
            System.out.println("Невозможно достать предмет, коробка закрыта");
        }
        if (item.equals("empty")) {
            System.out.println("Невозможно достать предмет, коробка пуста");
        }

        System.out.println("Достали из коробки: " + item);

        this.item = "empty";
    }
}
