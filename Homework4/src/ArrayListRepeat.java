import java.util.ArrayList;

public class ArrayListRepeat {
    public static void main(String[] args) {
        ArrayList<Integer> randomItems = new ArrayList<>();
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
        randomItems.remove(0);
        randomItems.remove(0);
        int res = first + second;
        randomItems.add(0, res);
        long endT = System.nanoTime();

        System.out.println(randomItems);

        System.out.println(additionFirstTwoNumbers(randomItems));

        long duration = (endTime - startTime);
        System.out.println("Time of the <removeIf> method execution: " + duration + " nanosecond");

        long dur = (endT - startT);
        System.out.println("Time of execution of the first number addition method: " + dur + " nanosecond");

    }

    public static ArrayList additionFirstTwoNumbers(ArrayList<Integer> lst) {
        if (lst.size() == 1) return lst;
        else {
            int first = lst.get(0);
            int second = lst.get(1);
            lst.remove(0);
            lst.remove(0);
            int res = first + second;
            lst.add(0, res);
            return additionFirstTwoNumbers(lst);
        }
    }
}
