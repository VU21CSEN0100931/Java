import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProductQuantity(int productId, int quantity) {
        for (Product product : products) {
            if (product.getId() == productId) {
                product.setQuantity(quantity);
                break;
            }
        }
    }

    public void displayInventory() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
