package ru.otus.java.basic;

public class User {
    private String lastname;
    private String firstname;
    private String surname;
    private int birthYear;
    private String email;
    private static final int CURRENT_YEAR = 2026;

    public User(String lastname, String firstname, String surname, int birthYear, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.birthYear = getBirthYear(birthYear);
    }

    public User(String lastname, String firstname, int birthYear, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.birthYear = getBirthYear(birthYear);
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void printInfo() {
        if (surname == null) {
            System.out.println("ФИО: " + lastname + " " + firstname);
        } else {
            System.out.println("ФИО: " + lastname + " " + firstname + " " + surname);
        }

        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: " + email);
        System.out.println("----------");
    }

    private int getBirthYear(int birthYear) {
        if (CURRENT_YEAR - birthYear >= 0) {
            return birthYear;
        }

        return CURRENT_YEAR;
    }
}
