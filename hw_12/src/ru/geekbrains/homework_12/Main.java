package ru.geekbrains.homework_12;

public class Main {

    public static void main(String[] args) {
        CreateData.doData1();
        CreateData.doData2();
    }


    static class CreateData {
        static final int SIZE = 10000000;
        static final int HALF = SIZE / 2;

        public static void doData1() {
            float[] arr = new float[SIZE];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1;
            }

            long a = System.currentTimeMillis();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println(System.currentTimeMillis() - a);
        }

        public static void doData2() {
            float[] arr = new float[SIZE];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1;
            }
            float[] arr1 = new float[HALF];
            float[] arr2 = new float[HALF];

            long a = System.currentTimeMillis();
            System.arraycopy(arr, 0, arr1, 0, HALF - 1);
            System.arraycopy(arr, HALF - 1, arr2, 0, HALF - 1);

            Thread t1 = new Thread(() -> {
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            });
            Thread t2 = new Thread(() -> {
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            });
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.arraycopy(arr1, 0, arr, 0, HALF - 1);
            System.arraycopy(arr2, 0, arr, HALF - 1, HALF - 1);
            System.out.println(System.currentTimeMillis() - a);
        }
    }
}
