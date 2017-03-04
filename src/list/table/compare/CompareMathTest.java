package list.table.compare;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Adrian on 2017-03-04.
 */
public class CompareMathTest {

    public static void main(String[] args) {
        int[] tab = {1,2,4,2,5,12,3,2};
        List<Integer> list = Arrays.asList(4,2,2,1,5,29,3,8);
        System.out.println(CompareMath.compare(list, tab));
    }
}
