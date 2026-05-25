package ru.otus.java.basic;

public class Main {
private static final int CURRENT_YEAR = 2026;
    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван", "Иванович",1981, "ivanov@mail.com"),
                new User("Петров", "Петр", "Петрович",1982, "petrov@mail.com"),
                new User("Екатер", "Екатерина", "Екатериновна",1983, "ekater@mail.com"),
                new User("Владис", "Владислав", "Владиславович",1984, "vladis@mail.com"),
                new User("Олег", "Олег", "Олегович",1985, "oleg@mail.com"),
                new User("Тестер", "Тест", "Тестерович",1986, "tester@mail.com"),
                new User("Клава", "Клавдия",1987, "klava@mail.com"),
                new User("Батрудинов", "Тимур", "Тимурович",1988, "batrudion@mail.com"),
                new User("Эльдарадо", "Ильдар",1990, "eldarado@mail.com"),
                new User("Последнев", "Посл", "Последневич",2001, "lastlast@mail.com")
        };

        for (int i = 0; i < users.length; i++) {
            if (CURRENT_YEAR - users[i].getBirthYear() > 40) {
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
