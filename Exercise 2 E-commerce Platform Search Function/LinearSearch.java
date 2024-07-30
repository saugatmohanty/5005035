public class LinearSearch {
    public static Product linearSearch(Product[] products, String searchName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(searchName)) {
                return product;
            }
        }
        return null;
    }
}
