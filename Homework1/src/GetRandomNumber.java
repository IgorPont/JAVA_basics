import java.util.Random;
import java.util.Scanner;

public class GetRandomNumber {
//    public static int checkIntNumber(String str) { // проверка на валидность ввода
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

    public static int[] IntRange() {
        int[] array = new int[2];
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter the minimum value of a random integer: ");
        array[0] = iScanner.nextInt();
        System.out.printf("Enter the maximum value of a random integer: ");
        array[1] = iScanner.nextInt();
        return array;
    }

    public static int RandomNum(int[] arr) {
        Random num = new Random();
        return num.nextInt((arr[1] - arr[0]) + 1) + arr[0];
    }
}
