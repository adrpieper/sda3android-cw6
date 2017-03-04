package store;

import static store.Category.*;

/**
 * Created by Adrian on 2017-03-04.
 */
public class StoreTest {

    public static void main(String[] args) {
        Store store = new Store();
        store.add(new Product("Masło",2, FOOD));
        store.add(new Product("Kurtka",200, CLOTHES));
        store.showProduct(FOOD);
    }
}
