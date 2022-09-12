import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * 1. Объявить и инициализировать словарь hashMap<String, String>
 * 2. Добавить в словарь 10 пар "Ключ - Значение". Автор и название книги например.
 * 3. Пройти по словарю и добавить к значениям символ "!"
 * 4. Добавить нового автора и название книги если соответствующего ключа не было.
 * 5. Если ключ, указанный в запросе, имеется, вырезать из соответствующего ключа значения первое слово.
 * 6. *Пройти по словарю другим, не таким как в пункте 3, методом и вывести пары ключ значение в консоль.
 * 7. ** Пройти по словарю другим, не таким как в пункте 3 и 6, методом. Добавить к значениям строку "(просмотрен)"
 * и вывести в консоль.
 */

public class MapsBasics {
    public static void main(String[] args) {
        HashMap<String, String> library = new HashMap<>();
        library.put("Михаил Булгаков", "Мастер и Маргарита");
        library.put("Николай Гоголь", "Мертвые души");
        library.put("Александр Дюма", "Граф Монте-Кристо");
        library.put("Эрих Мария Ремарк", "Три товарища");
        library.put("Федор Достоевский", "Преступление и наказание");
        library.put("Лев Толстой", "Война и мир");
        library.put("Александр Пушкин", "Евгений Онегин");
        library.put("Антон Чехов", "Палата № 6");
        library.put("Иван Тургенев", "Рудин");
        library.put("Александр Грибоедов", "Горе от ума");

        System.out.println(library);

        for (Map.Entry<String, String> i : library.entrySet()) {
            i.setValue(i.getValue() + "!");
        }

        System.out.println(library);

        if (!library.containsKey("Антуана де Сент-Экзюпери"))
            library.put("Антуана де Сент-Экзюпери", "Маленький принц");

        System.out.println(library);

        String temp = "";
        for (Map.Entry<String, String> entry : library.entrySet()) {
            if (entry.getKey().contains("Михаил Булгаков")) {
                String v = entry.getValue();
                for (int i = 0; i < v.length(); i++) {
                    if (v.charAt(i) != ' ')
                        temp += v.charAt(i);
                    else break;
                }
                library.put(entry.getKey(), v.replace(temp, ""));
            }
        }
        System.out.println(library);

        Iterator<Map.Entry<String, String>> entries = library.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            library.put(entry.getKey(), entry.getValue() + "!");
        }
        System.out.println(library);

        for (String key : library.keySet()) {
            library.put(key, library.get(key) + "!");
        }
        System.out.println(library);
    }
}
