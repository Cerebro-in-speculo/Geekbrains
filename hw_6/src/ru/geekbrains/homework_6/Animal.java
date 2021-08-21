package ru.geekbrains.homework_6;

public abstract class Animal {
    public static int COUNT_ANIMAL=0;
    public Animal(){
        COUNT_ANIMAL++;
    }

    public abstract void running(int obstacleLength);
    public abstract void floating(int obstacleLength);
}
