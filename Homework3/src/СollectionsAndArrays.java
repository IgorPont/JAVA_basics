import java.util.*;

/**
 * 1. Напишите программу, чтобы создать новый список массивов, добавить несколько цветов (строку) и вывести коллекцию
 * на экран.
 * 2. Напишите программу для итерации всех элементов списка цветов и добавления к каждому символа '!'.
 * 3. Напишите программу для вставки элемента в список массивов в первой позиции.
 * 4. Напишите программу для извлечения элемента (по указанному индексу) из заданного списка.
 * 5. Напишите программу для обновления определенного элемента массива по заданному элементу.
 * 6. Напишите программу для удаления третьего элемента из списка массивов.
 * 7. Напишите программу для поиска элемента в списке массивов.
 * 8. Напишите программу для сортировки заданного списка массивов.
 * 9. Напишите программу для копирования одного списка массивов в другой.
 */

public class СollectionsAndArrays {
    public static void main(String[] args) {
        List<String> testList = newListColors();
        System.out.println(testList);
        System.out.println(addCharListItem(testList));
        System.out.println(addItemInList(testList));
        System.out.println(listItemExtraction(testList));
        System.out.println(changeItemList(testList));
        System.out.println(removeThirdItemList(testList));
        System.out.println(findItemList(testList));
        System.out.println(sortingListArrays(testList));
        System.out.println(copyList(testList));

    }

    public static List newListColors() {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Orange");
        return colors;
    }

    public static List addCharListItem(List<String> lst){
        for (int i = 0; i < lst.size(); i++) {
            lst.set(i, lst.get(i) + "!");
        }
        return lst;
    }

    public static List addItemInList(List<String> lst){
        String color = "Yellow";
        lst.add(0, color);
        return lst;
    }

    public static String listItemExtraction(List<String> lst){
        int itemLoc = 3;
        String res = lst.get(itemLoc);
        return res;
    }

    public static List changeItemList(List<String> lst){
        int itemLoc = 1;
        String arg = "Brown";
        lst.set(itemLoc, arg);
        return lst;
    }

    public static List removeThirdItemList(List<String> lst){
        lst.remove(2);
        return lst;
    }

    public static String findItemList(List<String> lst){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter the item you want to find in the list: ");
        String arg = iScanner.next();
        if (lst.contains(arg) == true){
            int index = lst.indexOf(arg);
            return String.format("The specified element is assigned an index %s", index);
        } else return "This element is not on the list";
    }

    public static List sortingListArrays(List<String> lst){
        Collections.sort(lst);
        return lst;
    }

    public static List copyList(List<String> lst){
        List<String> copyLst = List.copyOf(lst);
        return copyLst;
    }






}
