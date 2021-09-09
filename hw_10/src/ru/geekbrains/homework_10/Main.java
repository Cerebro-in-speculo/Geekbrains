package ru.geekbrains.homework_10;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] words = {"морковь", "морковь", "морковь", "капуста", "кортофель", "редис", "лук", "огурец", "помидор",
                "морковь", "капуста", "кортофель", "редис", "лук", "огурец", "помидор", "морковь"
                , "капуста", "кортофель", "редис", "лук", "огурец", "помидор"};

        countData(words);//Задание 1.

        PhoneDirectory myDirectory = new PhoneDirectory();//Задание 2.
        myDirectory.add("Roman", "+79857794777");
        myDirectory.add("Roman", "+79857794987");
        myDirectory.add("Marina", "+79855874987");
        myDirectory.add("Marina", "+71115874987");
        myDirectory.add("Marina", "+71115822287");
        myDirectory.get("Marina");
        myDirectory.get("Ivan");
        myDirectory.get("Roman");
        myDirectory.infoAll();
    }

    public static void countData(String[] data) {
        Map<String, Integer> wordScore = new HashMap<>(data.length);

        for (int i = 0; i < data.length; i++) {
            if (wordScore.containsKey(data[i])) {
                int temp = wordScore.get(data[i]);
                wordScore.put(data[i], temp + 1);
            } else {
                wordScore.put(data[i], 1);
            }
        }
        System.out.println(wordScore);
    }

}
