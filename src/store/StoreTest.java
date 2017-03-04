package store;

/**
 * Created by Adrian on 2017-03-04.
 */
public class StoreTest {

    public static void main(String[] args) {
        Store store = new Store();
        store.add(new Product("Masło",2,Category.FOOD));
        store.add(new Product("Kurtka",200,Category.CLOTHES));
        store.showProduct(Category.FOOD);
    }
}
