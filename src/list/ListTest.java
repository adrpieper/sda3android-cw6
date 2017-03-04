package list;

import java.util.ArrayList;
import java.util.List;

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

    }
}
