package ru.otus.java.basic;

public class User {
    private String lastname;
    private String firstname;
    private String surname;
    private int age;
    private String email;

    public User(String lastname, String firstname, String surname, int age, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;

        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public User(String lastname, String firstname, int age, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;

        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        if (surname == null) {
            System.out.println("ФИО: " + lastname + " " + firstname);
        } else {
            System.out.println("ФИО: " + lastname + " " + firstname + " " + surname);
        }

        System.out.println("Год рождения: " + age);
        System.out.println("e-mail: " + email);
        System.out.println("----------");
    }

}
