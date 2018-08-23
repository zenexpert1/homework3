package HomeWork3;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> Cars = new ArrayList<>();
        Cars.add("BMW");
        Cars.add("Audi");
        Cars.add("Audi");
        Cars.add("Audi");
        Cars.add("Chery");
        Cars.add("Kia");
        Cars.add("Lexus");
        Cars.add("BMW");
        Cars.add("BAW");
        Cars.add("Chery");
        Cars.add("Bavaria");
        Cars.add("BAIC");
        Cars.add("Bentley");
        Cars.add("Bentley");
        Cars.add("Bogdan");
        Cars.add("Bogdan");
        Cars.add("Bogdan");
        Cars.add("Bogdan");
        Cars.add("Bogdan");
        Cars.add("Bogdan");
        Cars.add("Bogdan");
        Cars.add("Bogdan");
        Cars.add("Bogdan");
        Cars.add("Bogdan");
        Cars.add("Bogdan");
        Cars.add("Bogdan");
        Cars.add("Bogdan");

        Map<String, Integer> CarsCounts = new HashMap<>();
        for (String s : Cars) {
            if (CarsCounts.containsKey(s))
                CarsCounts.put(s, 1 + CarsCounts.get(s));
            else
                CarsCounts.put(s, 1);
        }

        Cars.clear();
        Cars.addAll(CarsCounts.keySet());

        System.out.println(Cars);

        System.out.println();
        System.out.println("Повторы");
        for (Map.Entry<String, Integer> Car : CarsCounts.entrySet())
            System.out.printf("Слово %s повторяется \t %2d раз\n", Car.getKey(), Car.getValue());


        System.out.println();

        TelephoneDirectory dir = new TelephoneDirectory();
        String surname = "Королёв";
        dir.Add(surname, 915136450, 915535040);

        System.out.println("Поищем телефоны для фамилии " + surname);
        dir.Get(surname).forEach((number)-> System.out.println(number));
        System.out.println();

        surname = "Виноградов";
        dir.Add(surname, 915135640);
        dir.Add(surname, 915143530,915546200,815157500);


        System.out.println("Поищем телефоны для фамилии " + surname);

        dir.Get(surname).forEach((number)-> System.out.println(number));
    }
}
