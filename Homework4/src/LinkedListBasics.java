import java.util.LinkedList;

/**
 * 1. Объявить и инициализировать связанный список в 10000 элементов случайным числом от -1024 до 1024
 * 2. Пройти по списку и удалить все отрицательные элементы
 * 3. Скопировать в переменные и удалить из списка первый и второй элементы, сложить переменные, результат сохранить
 * в начало списка.
 * 4. Реализовать пункт №3 для всего списка.
 * 5. Измерить время исполнения пунктов №2 и №3.
 * 6. *Реализовать пункты с первого по пятый но с ArrayList. Сравнить время исполнения.
 * 7. **Оптимизировать реализацию заданий так, чтобы время выполнения LinkedList и ArrayList были наименьшим.
 */

public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<Integer> randomItems = new LinkedList<>();
        int min = -1024;
        int max = 1024;
        int size = 10000;
        for (int i = 0; i < size; i++) {
            randomItems.add(i, ((int) (Math.random() * ((max - min) + 1)) + min));
        }

        System.out.println(randomItems);

        long startTime = System.nanoTime();
        randomItems.removeIf(value -> value < 0);
        long endTime = System.nanoTime();

        System.out.println(randomItems);

        long startT = System.nanoTime();
        int first = randomItems.get(0);
        int second = randomItems.get(1);
        randomItems.removeFirst();
        randomItems.removeFirst();
        int res = first + second;
        randomItems.addFirst(res);
        long endT = System.nanoTime();

        System.out.println(randomItems);

        System.out.println(additionFirstTwoNumbers(randomItems));

        long duration = (endTime - startTime);
        System.out.println("Time of the <removeIf> method execution: " + duration + " nanosecond");

        long dur = (endT - startT);
        System.out.println("Time of execution of the first number addition method: " + dur + " nanosecond");

    }

    public static LinkedList additionFirstTwoNumbers(LinkedList<Integer> lst) {
        if (lst.size() == 1) return lst;
        else {
            int first = lst.get(0);
            int second = lst.get(1);
            lst.removeFirst();
            lst.removeFirst();
            int res = first + second;
            lst.addFirst(res);
            return additionFirstTwoNumbers(lst);
        }
    }
}