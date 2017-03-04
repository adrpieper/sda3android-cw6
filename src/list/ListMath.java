package list;

import java.util.List;

/**
 * Created by Adrian on 2017-03-04.
 */
public class ListMath {

    public static int sum(List<Integer> numbers){
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
