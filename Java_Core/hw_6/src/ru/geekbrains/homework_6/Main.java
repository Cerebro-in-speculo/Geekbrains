package ru.geekbrains.homework_6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Dog dog = new Dog();
        Dog dog1 = new Dog();

        cat.running(700);
        cat.floating(50);
        dog.running(200);
        dog.floating(50);
        cat1.running(100);
        dog1.floating(5);
        //System.out.println(dog.toString());

        System.out.println("\nВсего животных ->" + Animal.COUNT_ANIMAL + "\nкотов -> " +
                Cat.COUNT_CAT + "\nсобак-> " + Dog.COUNT_DOG);
    }
}
