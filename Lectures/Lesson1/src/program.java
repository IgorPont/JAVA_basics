/**
 * program
 */

import java.util.Scanner; // библиотечка для запроса данных

public class program {
    static String getType(Object o) {
        return o.getClass().getSimpleName(); // метод получения типа переменной
    }

    public static void main(String[] args) {
//        float f = 123.45f; // int выводил до 16 знаков после запятой
//        System.out.println(f);
//
//        char ch = '1';
//        System.out.println(Character.isDigit(ch)); // проверка на число
//
//        boolean f = true && false;
//        System.out.println(f);
//
//        var i = 123; // неявная типизация
//        System.out.println(i);
//
//        var s = "hello";
//        System.out.println(s);
//        System.out.println(getType(s)); // метод получения типа переменной
//
//        int i = 123_000_000;
//        System.out.println(Integer.MAX_VALUE); // к классу обращаемся через обертку
//
//        String s = "qwerty";
//        char ch = s.charAt(2); // к конкретным символам обращается через базовые библиотечки
//        System.out.println(ch);
//
//        int a = 123;
//        a++; // постфиксный инкримент
//        ++a; // прифексный инкримент
//        System.out.println(++a); // определяет приоритет операции вывода и инкримента (если прифексный - то приоритет выше)
//
//        int a = 5;
//        a = --a - a--; // и такое бывает)
//        System.out.println(a);
//
//        int[] arr = new int[5];
//        arr = new int[]{1, 2, 3, 4, 5}; // одномерные массивы
//        int brr[]; // так тоже можно инициализировать массив
//
//        int[] arr[] = new int[3][5]; // двумерный массив
//        int[][] brr = new int[3][5]; // массив массивов
//
//        int[] arr[] = new int[2][3]; // цикл for
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%d", arr[i][j]);
//            }
//        }
//
//        // запрос данных от пользователя
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Hello, %s!\n", name);
//        iScanner.close();
//
//        Scanner iScanner = new Scanner(System.in);
//        System.out.println("int a: ");
//        int x = iScanner.nextInt();
//        System.out.println("double a: ");
//        double y = iScanner.nextDouble();
//        System.out.printf("%d + %f = %f", x, y, x + y);
//        iScanner.close();
//
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt(); // проверка на валидность данных
//        System.out.println(flag);
//        int i = iScanner.nextInt();
//        System.out.println(i);
//
//        int a = 1, b = 2;
//        int c = a + b;
//        String res = a + " + " + b + " = " + c; // конкатенация строк, лучше не использовать
//        System.out.printf("%s\n",res);
//
//        int a = 1, b = 2;
//        int c = a + b;
//        String res = String.format("%d + %d = %d\n", a, b, c); // форматированный вывод
//        System.out.printf("%d + %d = %d\n", a, b, c);
//        System.out.println(res);
//
//        lib.sayHi(); // использхование методов через отдельный класс
//
//        System.out.println(lib.factor(5)); // рекурсия
//
//        int a = 1;
//        int b = 2;
//        int min = a < b ? a : b; // тернарный оператор
//        System.out.println(min);

        int day = value;
        switch (day) {
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println(2);
                break;
        } // не забыть запросить переменную у пользователя

    }
}

