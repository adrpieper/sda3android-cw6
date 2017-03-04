package store;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 2017-03-04.
 */
public class Store {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void showProduct(Category category) {

        for (Product product : products) {
            System.out.println(product.getName());
        }

    }
}
