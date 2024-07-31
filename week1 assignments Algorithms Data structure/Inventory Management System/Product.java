public class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
//Importance of Data Structures and Algorithms:
//Data structures and algorithms are crucial in handling large inventories for several reasons:

//Efficiency: Efficient data structures and algorithms ensure quick access, insertion, and deletion of inventory items, which is essential for real-time inventory management.
//Optimization: They help optimize storage space and improve overall performance by reducing time complexities of operations.
//Suitable Data Structures:
//For an inventory management system, suitable data structures include:

//ArrayList: Ideal for scenarios where direct access to elements (products) by index is required and the order of items matters.
//HashMap: Suitable for scenarios where fast lookups (based on product ID or name) are important, as it provides average O(1) time complexity for lookups, inserts, and deletes.
//Choosing a Data Structure:
//Used a HashMap (or Dictionary in Python) for storing products, assuming productId as the key for efficient lookups.
//Time Complexity Analysis:
//Add Operation: Adding a product (add_product) to a HashMap typically has an average time complexity of O(1).
//Update Operation: Updating a product (update_product) also has an average time complexity of O(1) in a HashMap, assuming the product exists.
//Delete Operation: Deleting a product (delete_product) from a HashMap also has an average time complexity of O(1), assuming the product exists.
//Optimization Strategies:
//To optimize these operations further:

//Handling Collisions: If using HashMap, handle collisions efficiently (via chaining or open addressing) to maintain O(1) time complexity.
//Batch Operations: For bulk updates or deletions, consider implementing batch operations to minimize overhead.
//Additional Considerations:
//Concurrency: If your system requires concurrent access, ensure thread safety through synchronization mechanisms.
//Memory Management: Efficient memory management is crucial, especially for large inventories. Consider memory profiling and optimization techniques.