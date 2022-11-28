package Product;

public class ProductAlreadyExistException extends Exception {
    public ProductAlreadyExistException() {
        super("Продукт уже куплен");
    }
}
