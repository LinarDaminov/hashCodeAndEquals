package Product;

import java.util.Objects;
public class Product {
    private final String productName;
    private final double price;
    private final double weight;
    private boolean checked;

    public Product(String productName, double price, double weight){
        if (productName != null) {
            this.productName = productName;
        } else {
            throw new RuntimeException("Не полностью введена информация");
        }
        if (price != 0) {
            this.price = price;
        } else {
            throw new RuntimeException("Не полностью введена информация");
        }
        if (weight != 0) {
            this.weight = weight;
        } else {
            throw new RuntimeException("Не полностью введена информация");
        }
        this.checked = false;

    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public double getWeight() {
        return weight;
    }


    public void setChecked() {
        this.checked = true;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }

    @Override
    public String toString() {
        return "Продукт: " + productName + ", цена " + price + ", вес: " + weight + " продукт куплен: " + checked;


    }
}
