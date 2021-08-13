package ru.geekbrains.homework_2;

public class Main {

    public static void main(String[] args) {
        //Задание 1.
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else a[i] = 0;
        }
        //Задание 2.
        int sum = 0;
        int[] b = new int[8];
        for (int i = 0; i < b.length; i++) {
            b[i] = sum;
            sum += 3;
        }
        //Задание 3.
        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < c.length; i++) {
            if (c[i] < 6) c[i] *= 2;
        }
        //Задание 4.
        int[][] d = new int[5][5];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if (i == j) d[i][j] = 1;
            }
        }
        for (int i = 0; i < d.length; i++) {
            for (int j = d[i].length - 1; j >= 0; j--) {
                if (i == d[i].length - j - 1) d[i][j] = 1;
            }
        }
//        for (int i = 0; i < d.length; i++) {
//            for (int j = 0; j < d[i].length; j++) {
//                System.out.println(d[i][j]);
//            }
//        }
        //Задание 5.
        int[] e = {6, 5, 1, 2, 11, 4, 5, 2, 4, 11, 9, 1, 2, 0};
        int e_min = e[0];
        int e_max = e[0];
        for (int temp : e) {
            if (e_min >= temp) e_min = temp;
            if (e_max <= temp) e_max = temp;
        }
        for (int i = 0; i < e.length; i++) {
            if (e[i] == e_min)
                System.out.println("Минимальный элемент e[" + i + "]=" + e_min);
        }
        for (int i = 0; i < e.length; i++) {
            if (e[i] == e_max)
                System.out.println("Максимальный элемент e[" + i + "]=" + e_max);
        }

        //Задание 6.
        int[] f = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(f));

        //Задание 7.
        int[] s = {3, 5, 6, 1};
        shiftVariable(s, 2);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    static boolean checkBalance(int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += a[j];
            }
            for (int k = i; k < a.length; k++) {
                sumRight += a[k];
            }
            if (sumLeft == sumRight) return true;
        }
        return false;
    }

    static void shiftVariable(int[] a, int n) {
        int shift = n % a.length;
        if (shift>0){
            //пока не придумал)
        }else if(shift<0){
            //пока не придумал)
        }
    }

}
