package ru.geekbrains.homework_11;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] name = {"Roman", "Marina"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        changeData(name, 0, 1);
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        String[] data = {"Roman", "Marina", "Dany"};
        System.out.println(data);
        ArrayList dataArray = toArrayList(data);
        System.out.println(dataArray);

        ArrayList<Apple> apple = new ArrayList<>();
        apple.add(new Apple());
        ArrayList<Orange> orange = new ArrayList<>();
        orange.add(new Orange());

    }

    //Задание 1.
    public static void changeData(Object[] data, int n, int k) {
        Object temp = data[n];
        data[n] = data[k];
        data[k] = temp;
    }

    //Задание 2.
    public static ArrayList<Object> toArrayList(Object[] data) {
        ArrayList<Object> temp = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            temp.add(data[i]);
        }
        return temp;
    }

}
