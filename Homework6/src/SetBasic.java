import java.util.*;

/**
 * 1. Объявить и инициализировать множества HashSet hs, LinkedHashSet lhs и TreeSet ts
 * 2. Добавить в множества по 10 случайных целочисленных ключей.
 * 3. Пройти по множеству hs и, при условии наличия соответствующего ключа в множестве lhs, удалить ключ из hs
 * 4. Пройти по множеству lhs и, при условии отсутствия соответствующего ключа в множестве ts, добавит ключ в ts
 * 5. Объявить и инициализировать множество TreeSet ts1 с компаратором Integer
 * (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0). Заполнить ts1 15 случайными числами и вывести на печать.
 * 6. *Объявить и инициализировать множество TreeMap tm с компаратором Integer
 * (-1 при значении  %2==0 ;0 при ==;1 при значении %2!=0). Заполнить tm 15 случайными числами и вывести на печать.
 */
public class SetBasic {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 1; i <= 10; i++) {
            hs.add(new Random().nextInt(100));
            lhs.add(new Random().nextInt(100));
            ts.add(new Random().nextInt(100));
        }

        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);

        for (Integer i : hs) {
            if (lhs.contains(i))
                hs.remove(i);
        }

        System.out.println(hs);

        for (Integer i : lhs) {
            if (!ts.contains(i))
                ts.add(i);
        }

        System.out.println(ts);

        TreeSet<Integer> ts1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == o2) return 0;
                if (o2 % 2 == 0) return -1;
                else return 1;
            }
        });

        for (int i = 1; i <= 15; i++) {
            ts1.add(new Random().nextInt(100));
        }

        System.out.println(ts1);

        TreeMap<Integer, Integer> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == o2) return 0;
                if (o2 % 2 == 0) return -1;
                else return 1;
            }
        });

        for (int i = 1; i <= 15; i++) {
            tm.put(new Random().nextInt(100), new Random().nextInt(101, 200));
        }

        System.out.println(tm);
    }
}
