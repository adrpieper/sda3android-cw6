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

    public static int max(List<Integer> numbers){
        int result = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (result < number) {
                result = number;
            }
        }
        return result;
    }
}
