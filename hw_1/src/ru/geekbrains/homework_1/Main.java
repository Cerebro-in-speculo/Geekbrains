package ru.geekbrains.homework_1;

public class Main {
    //Задание 1
    public static void main(String[] args) {
        //Задание 2
        char var1 = 'R';
        byte var2 = 125;
        short var3 = 2345;
        int var4 = 56454434;
        long var5 = 465342323;
        double var6 = 3.8767567;
        float var7 = 23f;
        boolean var8 = true;
        String var9 = "Hi!!!";

        highAge(2020);
    }

    //Задание 3
    static float methodExpression(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //Задание 4
    static boolean methodBoolean(int val) {
        return val >= 10 && val <= 20;
    }

    //Задание 5
    static void methodPlusMinusVoid(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    //Задание 6
    static boolean methodPlusMinusBoolean(int a) {
        return a < 0;
    }

    //Задание 7
    static void methodName(String name) {
        System.out.println("Привет, указанное " + name + " имя!");
    }

    //Задание 8
    static void highAge(int age) {
        if ((age % 400 == 0) || (age % 4 == 0) && (age % 100 != 0)) {
            System.out.println("Год " + age + " високосный");
        } else {
            System.out.println("Год " + age + " невисокосный");
        }
    }
}