/**
 * Выбросить случайное целое число и сохранить в i
 * Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
 * Найти все кратные n числа большие i и сохранить в массив m1
 * Найти все некратные n числа меньшие i и сохранить в массив m2
 * Сохранить оба массива в файлы с именами m1 и m2 соответственно.
 * <p>
 * Пункты реализовать в методе main (выполнено)
 * *Пункты реализовать в разных методах (выполнено)
 * **Реализовать один из пунктов рекурсией (выполнено)
 */


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HighBitNumber {
    public static void main(String[] args) {
        int i = getRandomNumber(getIntRange());
        System.out.printf("Random integer: %d\n", i);
        int n = bit1(i).length();
        System.out.printf("Number of the high bit of the number: %d\n", n);
        int[] m1 = multiplesNumGreater(n, i);
        System.out.println("An array greater than <i> multiples of <n>: ");
        printIntArray(m1);
        int[] m2 = multiplesNumLess(n, i);
        System.out.println("Non-integer <n> numbers smaller than <i>: ");
        printIntArray(m2);
        writeArrTxt("m1.txt", m1);
        writeArrTxt("m2.txt", m2);


    }

//    static int checkIntNumber(String str) { // проверка на валидность ввода
//        try {
//            Integer.parseInt(str);
//        } catch (NumberFormatException e) {
//            Scanner iScanner = new Scanner(System.in);
//            System.out.printf("Error!!! Enter a number: ");
//            str = iScanner.next();
//            checkIntNumber(str); //здесь ошибка?
//        }
//        return Integer.parseInt(str);
//    }

    static int[] getIntRange() {
        int[] array = new int[2];
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter the minimum value of a random integer: ");
        array[0] = iScanner.nextInt();
        System.out.printf("Enter the maximum value of a random integer: ");
        array[1] = iScanner.nextInt();
        return array;
    }

    static int getRandomNumber(int[] arr) {
        Random num = new Random();
        return num.nextInt((arr[1] - arr[0]) + 1) + arr[0];
    }

    static String bit1(int num) { // двоичное представление целого числа рекурсией
        if (num > 1) {
            return bit1(num / 2) + num % 2;
        } else {
            return 1 + "";
        }

//        int b = 1 << 30; // побитовый метод для натуральных чисел
//        while (num < b) b >>= 1;
//        return b;
    }

    static int[] multiplesNumGreater(int split, int div) {  // максимальный диапазон == максимальное значение short
        int lenArr = 0;
        for (int i = div + 1; i <= 32767; i++) {
            if ((i % split) == 0)
                lenArr++;
        }
        int[] array = new int[lenArr];
        int index = 0;
        for (int i = div + 1; i <= 32767; i++) {
            if ((i % split) == 0) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }

    static int[] multiplesNumLess(int split, int div) {  // минимальный диапазон == минимальное значение short
        int lenArr = 0;
        for (int i = div - 1; i >= -32768; i--) {
            if ((i % split) != 0)
                lenArr++;
        }
        int[] array = new int[lenArr];
        int index = 0;
        for (int i = div - 1; i >= -32768; i--) {
            if ((i % split) != 0) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }

    static void writeArrTxt(String fileName, int[] arr) {
        String text = Arrays.toString(arr);
        try (FileWriter fw = new FileWriter(fileName, false)) {
            fw.write(text);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
