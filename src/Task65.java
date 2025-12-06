import java.util.Arrays;

public class Task65 {


    public static int[] transformArray(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        if (array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім");
        }
        int index = 0;
        int[] result = new int[array.length];
            for (int i = array.length-1; i >= 0; i--) {
                result[index] = array[i];
                index++;
            }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("=== Завдання 65: Сформувати новий масив, елементи якого це елементи старого масиву у зворотному порядку ===\n");

        int[] test1 = {10, 20, 5, 15};
        System.out.println(Arrays.toString(test1));
        try {
            int[] result = transformArray(test1);
            System.out.print("Результат: " +  Arrays.toString(result));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();

        int[] test2 = {5, 0, 10, 3};
        System.out.println(Arrays.toString(test2));
        try {
            int[] result = transformArray(test2);
            System.out.print("Результат: "  +  Arrays.toString(result));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();

        int[] test3 = {-6, 12, -3, 9};
        System.out.println(Arrays.toString(test3));
        try {
            int[] result = transformArray(test3);
            System.out.print("Результат: " +  Arrays.toString(result));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();

        int[] test4 = {7, 7, 7, 7};
        System.out.println(Arrays.toString(test4));
        try {
            int[] result = transformArray(test4);
            System.out.print("Результат: " +  Arrays.toString(result));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();

        int[] test5 = {0, 0, 0};
        System.out.println(Arrays.toString(test5));
        try {
            int[] result = transformArray(test5);
            System.out.print("Результат: " + Arrays.toString(result));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();

        int[] test6 = {4};
        System.out.println(Arrays.toString(test6));
        try {
            int[] result = transformArray(test6);
            System.out.print("Результат: " + Arrays.toString(result));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();

        int[] test7 = {0};
        System.out.println(Arrays.toString(test7));
        try {
            int[] result = transformArray(test7);
            System.out.print("Результат: " + Arrays.toString(result));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();

        int[] test8 = {};
        System.out.println(Arrays.toString(test8));
        try {
            int[] result = transformArray(test8);
            System.out.print("Результат: " + Arrays.toString(result));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();

        int[] test9 = null;
        System.out.println(Arrays.toString(test9));
        try {
            int[] result = transformArray(test9);
            System.out.print("Результат: " + Arrays.toString(result));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
        System.out.println();

        int[] test10 = {-5, 0, 10, -3};
        System.out.println(Arrays.toString(test10));
        try {
            int[] result = transformArray(test10);
            System.out.print("Результат: " +  Arrays.toString(result));
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}