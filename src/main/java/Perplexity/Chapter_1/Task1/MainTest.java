package Perplexity.Chapter_1.Task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) {
        Person vasya = new Person();
        vasya.setAge(28);
        vasya.setName("Vasiliy");

        Person vladimir = new Person();
        vladimir.setAge(15);
        vladimir.setName("vladimir");

        Person natalia = new Person();
        natalia.setAge(34);
        natalia.setName("natalia");

        Person natalia2 = new Person();
        natalia2.setAge(34);
        natalia2.setName("natalia");

        System.out.println(natalia2.equals(natalia));
        System.out.println(natalia.equals(vasya));
        System.out.println(natalia.equals(vladimir));
        System.out.println(vasya.equals(vladimir));

        System.out.println("natalia2 hashcode()  ---> "+ natalia2.hashCode());
        System.out.println("natalia hashcode()  ---> "+ natalia.hashCode());
        System.out.println("vladimir hashcode()  ---> "+ vladimir.hashCode());
        System.out.println("vasya hashcode()  ---> "+ vasya.hashCode());

        Employee genadiy = new Employee();
        genadiy.setName("Genadiy");
        genadiy.setAge(25);
        genadiy.setEmployeeId(5);

        System.out.println("Genadiy equals(natalia)  ---> "+ genadiy.equals(natalia));
        System.out.println("Genadiy equals(vasya)  ---> "+ genadiy.equals(vasya));
        System.out.println("Genadiy equals(vladimir)  ---> "+ genadiy.equals(vladimir));

        System.out.println("Genadiy hashcode()  ---> "+ genadiy.hashCode());


        //Важно использовать суппер, так мы сократим количество кода, так как за основу возьмём суппер-класс,

        Map<Book, Integer> map = new HashMap<>();
        map.put(new Book("Tom Soyer", "Frederyk"), 456);
        map.put(new Book("Tim Cucue", "Ajax"), 232);
        map.put(new Book("Liere", "Meadow"), 1025);
        map.put(new Book("Tim Cucue", "Ajax"), 232);
        map.put(new Book("Recovery", "Doile"), 489);
        map.put(new Book("Manule", "Axiom"), 14);


        //Связка foreach / entrySet - для прохода мап
        for (Map.Entry<Book, Integer> entry: map.entrySet()) {
            Book key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key.getTitle() + " by " + key.getAuthor() + " : " + value);
        }

        //Даёт возможность удалять элементы из коллекции при обходе
        Iterator<Map.Entry<Book, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Book, Integer> entry = iterator.next();
            Book key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key.getTitle() + " by " + key.getAuthor() + " : " + value);
        }

        //Итерация по ключам с последующим получением значений
        for (Book key: map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key.getTitle() + " by " + key.getAuthor() + " : " + value);
        }
    }
}
