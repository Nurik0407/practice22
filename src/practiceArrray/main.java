package practiceArrray;

import java.util.*;

public class main {
    public static void main(String[] args) {
        /**        Практическое задание для Java 8

         1. Напишите программу на Java, чтобы создать новый список массивов,
         добавить несколько городов, вывести их в консоль.**/

        ArrayList<String> country = new ArrayList<>(Arrays.asList(
                "Bishkek", "Almata", "Talas", "Batken", "Naryn", "Osh"
        ));
        System.out.println(country);


        /**

         2. Напишите программу Java для вставки элемента в список массивов в первую позицию.
         **/

        country.add(0, "Moscow");
        System.out.println(country);


        /**

         3. Напишите программу Java для извлечения элемента (по указанному индексу) из заданного списка массивов.**/

        country.remove(0);
        System.out.println(country);


        /** 4. Напишите программу Java для обновления определенного элемента массива заданным элементом.**/


        country.set(5, "Moskow");
        System.out.println(country);


        /** 5. Напишите программу на Java для удаления третьего элемента из списка массивов.**/

        country.remove(2);
        System.out.println(country);

        /** 6. Напишите программу Java для поиска элемента в списке массивов.**/

        System.out.println(country.contains("Almata"));

        /**  7. Напишите программу на Java для сортировки заданного списка массивов.**/

        Collections.sort(country);
        System.out.println(country);

        /**   8. Напишите программу на Java для копирования одного списка массивов в другой.**/

        ArrayList<String> country2 = new ArrayList<>();
        country2.addAll(country);
        System.out.println(country2);

        /** 9. Напишите программу на Java для перемешивания элементов в списке массивов.**/

//        Collections.shuffle(country);
//        System.out.println(country);


        /**  10. Напишите программу на Java, чтобы поменять местами элементы в списке массивов.**/
        System.out.println(country);
        Collections.swap(country, 0, 1);
        System.out.println(country);


        /**   11. Напишите программу Java для извлечения части массива**/

        List<String> list = country.subList(2,5);
        System.out.println(list);


    }
}
