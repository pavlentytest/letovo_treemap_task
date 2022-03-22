package ru.samsung.itschool.mdev;

import java.util.ArrayList;

public class Address {
    private int number;
    private String street;
    private String locality;
    private String postcode;
    private String state;
}

class Person {
    private String name;
    private Address[] homes;
    private String email;
    private String phone;
}
class Book {
    private String title;
    private String author;
    private String isbn;
}
class Student extends Person {
    private Book[] books;
}
class Teacher extends Person {
    private Book book;
}
class Room {
    private Teacher teacher;
    private ArrayList<Student> students;
}
