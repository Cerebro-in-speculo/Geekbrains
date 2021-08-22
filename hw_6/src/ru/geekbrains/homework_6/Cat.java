package ru.geekbrains.homework_6;

public class Cat extends Animal {

    public static int COUNT_CAT = 0;
    public Cat() {COUNT_CAT++;}

    @Override
    public void running(int obstacleLength) {
        if (obstacleLength > 200) {
            System.out.println("Кот пробежал 200 м. из " + obstacleLength + " м.");
        } else {
            System.out.println("Кот пробежал " + obstacleLength + " м.");
        }
    }

    @Override
    public void floating(int obstacleLength) {
        System.out.println("Кот не умеет плавать!");
    }
}
