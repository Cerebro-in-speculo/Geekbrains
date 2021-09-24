package ru.geekbrains.homework_7;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 150),
                new Cat("Pushok", 50),
                new Cat("Rizhiy", 100),
                new Cat("Myrzik", 200),
                new Cat("Vaska", 500),
        };
        Plate plate = new Plate(300);

        eatAllCats(cats, plate);// Задача 5
        plate.setFood(200);// Задача 6
        System.out.println();
        eatAllCats(cats,plate);
    }

    public static void eatAllCats(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.printf("Кот %s %s%n", cats[i].getName(), cats[i].getSatiety() ? "сыт" : "голоден");
        }
    }
}
