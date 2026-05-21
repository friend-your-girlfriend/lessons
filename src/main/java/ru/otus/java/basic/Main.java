package ru.otus.java.basic;

public class Main {

    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван", "Иванович",40, "ivanov@mail.com"),
                new User("Петров", "Петр", "Петрович",65, "petrov@mail.com"),
                new User("Екатер", "Екатерина", "Екатериновна",40, "ekater@mail.com"),
                new User("Владис", "Владислав", "Владиславович",18, "vladis@mail.com"),
                new User("Олег", "Олег", "Олегович",78, "oleg@mail.com"),
                new User("Тестер", "Тест", "Тестерович",39, "tester@mail.com"),
                new User("Клава", "Клавдия",40, "klava@mail.com"),
                new User("Батрудинов", "Тимур", "Тимурович",11, "batrudion@mail.com"),
                new User("Эльдарадо", "Ильдар",41, "eldarado@mail.com"),
                new User("Последнев", "Посл", "Последневич",12, "lastlast@mail.com")
        };

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() > 40) {
                users[i].printInfo();
            }
        }

        Box first = new Box(3,4,5, "Green");
        first.printInfo();

        first.setColor("Red");
        first.open();
        first.inputItem("Cat");
        first.close();
        first.printInfo();
        first.inputItem("Dog");
        first.open();
        first.inputItem("Dog");
        first.takeItem();
        first.inputItem("Dog");
        first.printInfo();
    }
}
