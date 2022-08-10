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

public class HighBitNumber {
    public static void main(String[] args) {
        int i = GetRandomNumber.RandomNum(GetRandomNumber.IntRange());
        System.out.printf("Random integer: %d\n", i);
        int n = bit1(i).length();
        System.out.printf("Number of the high bit of the number: %d\n", n);
        int[] m1 = MultiplesNumber.NumGreater(n, i);
        System.out.println("An array greater than <i> multiples of <n>: ");
        WriteAndPrintArray.printIntArray(m1);
        int[] m2 = MultiplesNumber.NumLess(n, i);
        System.out.println("Non-integer <n> numbers smaller than <i>: ");
        WriteAndPrintArray.printIntArray(m2);
        WriteAndPrintArray.writeArrTxt("m1.txt", m1);
        WriteAndPrintArray.writeArrTxt("m2.txt", m2);
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
}
