import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Задача №1

    /**
     * Объявите три массива:
     * 1) Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3
     * — с помощью ключевого слова new.
     * 2) Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
     * Массив сразу заполните значениями.
     * 3) Произвольный массив. Тип и количество данных определите сами.
     * Самостоятельно выберите способ создания массива: с помощью
     * ключевого слова или сразу заполненный элементами.
     */
    public static void task1() {
        System.out.println("Задача №1 - решение в коде");
        int[] first = new int[]{1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        long[] third = {1000000000, 2000000000, 300000000};
        System.out.println(" ");
    }

    // Задача №2

    /**
     * Распечатайте на отдельной строчке элементы каждого массива
     * по порядку через запятую. В конце строки запятую ставить не надо.
     */
    public static void task2() {
        System.out.println("Задача №2");
        System.out.println("Массив №1");
        int[] first = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(first));

        System.out.println("Массив №2");
        double[] second = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(second));

        System.out.println("Массив №3");
        long[] third = {1000000000, 2000000000, 300000000};
        System.out.println(Arrays.toString(third));
        System.out.println(" ");
    }

    // Задача №3

    /**
     * Распечатайте на отдельной строчке элементы каждого массива
     * в обратном порядке через запятую. В конце строки запятую ставить не надо.
     */
    public static void task3() {
        System.out.println("Задача №3");

        int[] first = {1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        long[] third = {1000000000, 2000000000, 300000000};

        System.out.println("Массив №1");
        for (int index = first.length - 1; index >= 0; index--) {
            System.out.print(first[index]);
            if (index != 0) {
                System.out.print(", ");
            }
        }
            System.out.println();

        System.out.println("Массив №2");
        for (int index = second.length - 1; index >= 0; index--) {
            System.out.print(second[index]);
            if (index != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.println("Массив №3");
        for (int index = third.length -1; index >= 0; index--) {
            System.out.print(third[index]);
            if (index != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }

    // Задача №4

    /**
     * Пройдитесь по первому целочисленному массиву и все нечетные числа
     * в нем сделайте четными (нужно прибавить 1).
     * Важно: код должен работать с любым целочисленным массивом, поэтому
     * для решения задания используйте циклы.
     * Распечатайте результат преобразования в консоль.
     */

    public static void task4() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задача №4");
        int[] first = {1, 2, 3};
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                first[i] += 1;
            }
        }
        System.out.println(Arrays.toString(first));
    }
}


