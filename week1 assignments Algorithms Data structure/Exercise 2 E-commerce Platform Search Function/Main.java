import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("1", "Laptop", "Electronics"),
            new Product("2", "Shirt", "Clothing"),
            new Product("3", "Coffee Maker", "Home Appliances"),
            new Product("4", "Desk", "Furniture"),
            new Product("5", "Pen", "Stationery")
        };

        String searchName = "Laptop";

        // Linear Search
        Product linearResult = LinearSearch.linearSearch(products, searchName);
        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult : "Product not found"));

        // Binary Search
        Product binaryResult = BinarySearch.binarySearch(products, searchName);
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult : "Product not found"));
    }
}

class Product {
    private String productId;
    private String productName;
    private String category;

    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

class LinearSearch {
    public static Product linearSearch(Product[] products, String searchName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(searchName)) {
                return product;
            }
        }
        return null;
    }
}

class BinarySearch {
    public static Product binarySearch(Product[] products, String searchName) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareToIgnoreCase(searchName);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
//Big O Notation:
//Big O notation is a mathematical notation used to describe the upper bound of an algorithm's runtime or space requirements in terms of the input size. It provides a way to classify algorithms according to how their running time or space requirements grow as the input size grows.
//
//O(1): Constant time - the algorithm takes the same amount of time regardless of the input size.
//O(log n): Logarithmic time - the algorithm's time complexity grows logarithmically as the input size increases.
//O(n): Linear time - the algorithm's time complexity grows linearly with the input size.
//O(n log n): Linearithmic time - the algorithm's time complexity grows in proportion to n log n.
//O(n^2): Quadratic time - the algorithm's time complexity grows quadratically with the input size.
//O(2^n): Exponential time - the algorithm's time complexity doubles with each addition to the input size.
//Best, Average, and Worst-Case Scenarios for Search Operations:
//Best Case: The minimum time required for the algorithm to complete. For a search operation, this typically occurs when the desired element is at the beginning of the data structure.
//Average Case: The expected time required for the algorithm to complete, considering all possible inputs.
//Worst Case: The maximum time required for the algorithm to complete. For a search operation, this typically occurs when the desired element is at the end of the data structure or not present at all.
//Time Complexity Comparison:
//Linear Search:

//Best Case: O(1) - The element is at the beginning of the array.
//Average Case: O(n) - The element is somewhere in the middle.
//Worst Case: O(n) - The element is at the end or not present.
//Binary Search:

//Best Case: O(1) - The element is at the middle.
//Average Case: O(log n) - The element is somewhere in the array.
//Worst Case: O(log n) - The element is at the end or not present.
//Suitability for E-commerce Platform:
//Linear Search:

//Suitable for small datasets or unsorted arrays.
//Simple to implement but inefficient for large datasets due to O(n) time complexity.
//Binary Search:

//Suitable for large datasets as it is much faster with O(log n) time complexity.
//Requires the array to be sorted, which can add overhead if the dataset is frequently updated.

//Conclusion:
//For an e-commerce platform where search performance is crucial and datasets are typically large, the binary search algorithm is more suitable due to its logarithmic time complexity. However, maintaining a sorted array is essential for binary search, so additional mechanisms for keeping the array sorted are necessary.