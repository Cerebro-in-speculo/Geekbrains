package ru.geekbrains.homework_6;

public class Dog extends Animal {

    public static int COUNT_DOG=0;
    public Dog(){
        COUNT_DOG++;
    }

    @Override
    public void running(int obstacleLength) {
        if (obstacleLength > 500) {
            System.out.println("Собака пробежала 500 м. из " + obstacleLength + " м.");
        } else {
            System.out.println("Собака пробежала " + obstacleLength + " м.");
        }
    }
    @Override
    public void floating(int obstacleLength) {
        if (obstacleLength > 10) {
            System.out.println("Собака проплыла 10 м. из " + obstacleLength + " м.");
        } else {
            System.out.println("Собака проплыла " + obstacleLength + " м.");
        }
    }
}
