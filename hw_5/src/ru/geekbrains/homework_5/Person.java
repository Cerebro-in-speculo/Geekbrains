package ru.geekbrains.homework_5;

public class Person {

    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void getAllInfo() {
        System.out.printf("%s, %s, %s, %s, %d, %d%n", fullName, position, email, telephone, salary, age);
    }

    public int getAge(){
        return age;
    }
}
