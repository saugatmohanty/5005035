import java.util.HashMap;

public class InventoryManagementSystem {
    private HashMap<String, Product> products;

    public InventoryManagementSystem() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, Product updatedProduct) {
        if (products.containsKey(productId)) {
            products.put(productId, updatedProduct);
        } else {
            System.out.println("Product with ID " + productId + " does not exist.");
        }
    }

    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
        } else {
            System.out.println("Product with ID " + productId + " does not exist.");
        }
    }

    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Product product1 = new Product("1", "Product A", 10, 99.99);
        Product product2 = new Product("2", "Product B", 20, 199.99);

        ims.addProduct(product1);
        ims.addProduct(product2);

        System.out.println("Inventory after adding products:");
        ims.displayProducts();

        Product updatedProduct = new Product("1", "Updated Product A", 15, 89.99);
        ims.updateProduct("1", updatedProduct);

        System.out.println("Inventory after updating product 1:");
        ims.displayProducts();

        ims.deleteProduct("2");

        System.out.println("Inventory after deleting product 2:");
        ims.displayProducts();
    }
}
