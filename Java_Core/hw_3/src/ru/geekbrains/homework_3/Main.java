package ru.geekbrains.homework_3;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        gameRandomNumber(); //Задание 1.
        //gameRandomString(); //Задание 2.
    }

    static void gameRandomNumber() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Введите диапазон случайного числа от 0 до n, где n = ");
            int n = sc.nextInt();
            Random rand = new Random();
            int random_number = rand.nextInt(n + 1);

            System.out.print("Введите количество попыток в игре - round: ");
            int round = sc.nextInt();
            System.out.println();

            System.out.printf("\nПРАВИЛА ИГРЫ:\nЗА %d ПОПЫТКИ(ТОК) НЕОБХОДИМО УГАДАТЬ " +
                    "СЛУЧАЙНОЕ ЧИСЛО ОТ 0 ДО %d\n", round, n);
            System.out.println("ИГРА НАЧАЛАСЬ!!!");

            for (int i = 0; i < round; i++) {
                System.out.print("Введите число: ");
                int player_number = sc.nextInt();
                if (player_number == random_number) {
                    System.out.printf("Вы угадали!!! загаданное число - %d\n", random_number);
                    break;
                } else if (i == round - 1) {
                    System.out.printf("Вы проиграли!!! загаданное число - %d", random_number);
                    break;
                } else if (player_number < random_number) System.out.println("Число меньше чем загаданное");
                else if (player_number > random_number) System.out.println("Число больше чем загаданное");
            }
        } while (quitGame());
        System.out.println("ИГРА ОКОНЧЕНА!!!");
        sc.close();
    }

    static boolean quitGame() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nПовторить игру еще раз? 1 - да, 0 - нет: ");
        int q = sc.nextInt();
        return q > 0;
    }

    static void gameRandomString() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String random_word = words[rand.nextInt(words.length)];
        System.out.println(random_word);
        System.out.println("\nПРАВИЛА ИГРЫ:\nУГАДАЙТЕ ЗАГАДАННОЕ КОМПЬЮТЕРОМ СЛОВО.\nИГРА НАЧАЛАСЬ!!!");
        do {
            System.out.print("\nВведите слово: ");
            String word_player = sc.next().toLowerCase(Locale.ROOT);
            if (word_player.equals(random_word)) {
                System.out.println("Поздравляем Вас!!! Вы угадали слово " + random_word);
                break;
            } else {
                int min_length = (word_player.length() >= random_word.length()) ? random_word.length() : word_player.length();
                for (int i = 0; i < min_length; i++) {
                    if (random_word.charAt(i) == word_player.charAt(i)) {
                        System.out.print(word_player.charAt(i));
                    } else System.out.print("#");
                }
                for (int i = 0; i < 15 - min_length; i++) {
                    System.out.print("#");
                }
                System.out.println("\nПопробуйте ввести снова.");
            }
        } while (true);
        System.out.println("\nИГРА ОКОНЧЕНА!!!");
        sc.close();
    }
}
