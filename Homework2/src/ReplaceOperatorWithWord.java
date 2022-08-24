/**
 * 4. Дано два числа, например 3 и 56, необходимо составить следующие строки:
 * 3 + 56 = 59
 * 3 – 56 = -53
 * 3 * 56 = 168.
 * Используем метод StringBuilder.append().
 * 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
 * 6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */

import java.util.Scanner;

public class ReplaceOperatorWithWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println(getStringNumber(a, b));
        System.out.println(insertAndDeleteCharAt(getStringNumber(a, b)));
        System.out.println(replaceChar(getStringNumber(a, b)));
    }

    public static StringBuilder getStringNumber(int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append(String.format("%d + %d = %d\n", a, b, a + b));
        result.append(String.format("%d - %d = %d\n", a, b, a - b));
        result.append(String.format("%d * %d = %d\n", a, b, a * b));
        return result;
    }

    public static StringBuilder insertAndDeleteCharAt(StringBuilder args) {
        int pos;
        while ((pos = args.indexOf("=")) != -1) {
            args.deleteCharAt(pos);
            args.insert(pos, "равно");
        }
        return args;
    }

    public static StringBuilder replaceChar(StringBuilder args) {
        int pos;
        while ((pos = args.indexOf("=")) != -1) {
            args.replace(pos, pos + 1, "равно");
        }
        return args;
    }
}
