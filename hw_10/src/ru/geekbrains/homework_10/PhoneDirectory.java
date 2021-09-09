package ru.geekbrains.homework_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private Map<String, List<String>> directory = new HashMap<>();

    public void add(String surname, String number) {
        if (directory.containsKey(surname)) {
            directory.get(surname).add(number);
        } else {
            List<String> temp = new ArrayList<>();
            temp.add(number);
            directory.put(surname, temp);
        }
    }

    public void get(String surname) {
        if (directory.containsKey(surname)) {
            System.out.println(directory.get(surname));
        } else {
            System.out.println("Нет такой фамилии в справочнике");
        }
    }

    public void infoAll() {
        for (Map.Entry<String, List<String>> entry : directory.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
