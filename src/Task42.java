import java.util.Arrays;

public class Task42 {

    public static double findGeometricMeanOfEvenElements(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        if (array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім");
        }

        double mid = 1;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                mid *= array[i];
                count++;
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("У масиві немає елементів індекс яких кратний 3");
        }

        return mid/count;
    }

    public static void main(String[] args) {
        System.out.println("=== Завдання 16: середнє арифметичне елементів масиву, індекс яких кратний 3 ===\n");

        int[] test1 = {2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(test1));
        try {
            double result = findGeometricMeanOfEvenElements(test1);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();


        int[] test2 = {2, 4, 8};
        System.out.println(Arrays.toString(test2));
        try {
            double result = findGeometricMeanOfEvenElements(test2);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();


        int[] test3 = {1, 3, 5, 7};
        System.out.println(Arrays.toString(test3));
        try {
            double result = findGeometricMeanOfEvenElements(test3);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();


        int[] test4 = {-4, 3, -2, 5, 6};
        System.out.println(Arrays.toString(test4));
        try {
            double result = findGeometricMeanOfEvenElements(test4);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();


        int[] test5 = {};
        System.out.println(Arrays.toString(test5));
        try {
            double result = findGeometricMeanOfEvenElements(test5);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();

        int[] test6 = null;
        System.out.println(Arrays.toString(test6));
        try {
            double result = findGeometricMeanOfEvenElements(test6);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();


        int[] test7 = {10};
        System.out.println((Arrays.toString(test7)));
        try {
            double result = findGeometricMeanOfEvenElements(test7);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}