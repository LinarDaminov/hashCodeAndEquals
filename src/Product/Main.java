package Product;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Product banana = new Product("Бананы", 55.6, 0.5);
        Product apple = new Product("Яблоки", 99.9, 1.5);
        Product pineapple = new Product("Ананасы", 258.66, 2.4);


        Set<Product> product = new HashSet<>();
        product.add(banana);
        product.add(apple);
        product.add(pineapple);
        System.out.println(product);





    }
}
