package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Adrian on 2017-03-04.
 */
public class ListTest {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("Pierwszy element");
        System.out.println(numbers.get(0));
        System.out.println("Rozmiar");
        System.out.println(numbers.size());

        System.out.println(ListMath.sum(numbers));
        System.out.println(ListMath.max(numbers));

    }
}
