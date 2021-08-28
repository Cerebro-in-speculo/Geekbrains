package ru.geekbrains.homework_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;// Задача 3

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate p) {
        if (p.getFood() < appetite) {
            //Задача 4. - пустое поле.

            /*
            Задача 2.
            p.decreaseFood(p.getFood());
            */
        } else {
            if (!satiety) {//Если добавили еды в тарелку и кот не смог поесть ранее, он начинает есть!
                p.decreaseFood(appetite);
                satiety = true;
            }
        }
    }
}
