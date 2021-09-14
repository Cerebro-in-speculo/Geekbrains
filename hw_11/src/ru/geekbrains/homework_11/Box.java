package ru.geekbrains.homework_11;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public Box(T fruits) {
        box.add(fruits);
    }

    public float getWeight() {
        float weight =0.0f;
        for(T w : box){
            weight+=w.getWeight();
        }
        return weight;
    }

    public boolean compare(T fruit) {
        return this.getWeight() == fruit.getWeight();
    }

    public void toFruit(Box <T>fruit){
        fruit.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int count){
        for(int i=0;i<count;i++){
            box.add(fruit);
        }
    }
}
