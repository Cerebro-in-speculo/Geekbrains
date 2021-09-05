package ru.geekbrains.homework_9;

public class Main {

    public static void main(String[] args) {
        String[][] data = {
                {"1", "1", "1", "1"},
                {"1", "кк", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
        };
        try {
            System.out.println(myData(data));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            throw new MyArrayDataException("Матрица содержит недопустимые символы",e);
        }
    }

    public static int myData(String[][] temp) throws MyArraySizeException {
        if (temp.length != 4 || temp[0].length != 4)
            throw new MyArraySizeException("Размерность матрица не 4X4");
        else {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    sum += Integer.parseInt(temp[i][j]);
                }
            }
            return sum;
        }
    }
}


