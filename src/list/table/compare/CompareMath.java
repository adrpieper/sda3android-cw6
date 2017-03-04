package list.table.compare;

import java.util.List;

/**
 * Created by Adrian on 2017-03-04.
 */
public class CompareMath {

    public static int compare(List<Integer> list, int[] array){
        int result = 0;
        for(int i = 0 ; i < array.length ; i++) {
            if (list.get(i) == array[i]) {
                result++;
            }
        }
        return result;
    }
}
