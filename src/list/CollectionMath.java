package list;

import java.util.Collection;
import java.util.List;

/**
 * Created by Adrian on 2017-03-04.
 */
public class CollectionMath {

    public static int sum(Collection<Integer> numbers){
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
