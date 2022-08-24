/**
 * Дано два числа, например 3 и 56, необходимо составить следующие строки:
 * 3 + 56 = 59
 * 3 – 56 = -53
 * 3 * 56 = 168.
 * Используем метод StringBuilder.append().
 */

import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class MakeLinesOfNumbers {
    static String getMathExpressions(int a, int b, char signOp, IntBinaryOperator binaryOperator) {
        return String.format("%d %c %d = %d;\n", a, signOp, b, binaryOperator.applyAsInt(a, b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        StringBuilder builder = new StringBuilder();
        builder.append(getMathExpressions(a, b, '+', (x, y) -> x + y))
                .append(getMathExpressions(a, b, '-', (x, y) -> x - y))
                .append(getMathExpressions(a, b, '*', (x, y) -> x * y));
        System.out.println("Result:\n" + builder.toString());
    }

}
