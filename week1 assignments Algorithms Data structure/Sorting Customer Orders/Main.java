import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Alice", 250.0),
            new Order("2", "Bob", 150.0),
            new Order("3", "Charlie", 300.0),
            new Order("4", "David", 100.0),
            new Order("5", "Eve", 200.0)
        };

        System.out.println("Original Orders:");
        displayOrders(orders);

        // Bubble Sort
        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("\nOrders after Bubble Sort:");
        displayOrders(bubbleSortedOrders);

        // Quick Sort
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        displayOrders(quickSortedOrders);
    }

    public static void displayOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

class Order {
    private String orderId;
    private String customerName;
    private double totalPrice;

    public Order(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

class BubbleSort {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    // Swap orders[j] and orders[j + 1]
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, array is sorted
            if (!swapped) break;
        }
    }
}

class QuickSort {
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = low - 1; // Index of smaller element
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                // Swap orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        // Swap orders[i+1] and orders[high] (or pivot)
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }
}

//Bubble Sort:
//Description: A simple comparison-based sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
//Time Complexity:
//Best Case: O(n) (when the array is already sorted)
//Average Case: O(n^2)
//Worst Case: O(n^2)
//Space Complexity: O(1) (in-place sorting)
//Insertion Sort:
//Description: Builds the final sorted array one item at a time, picking the next item and placing it in the correct position among the already sorted items.
//Time Complexity:
//Best Case: O(n) (when the array is already sorted)
//Average Case: O(n^2)
//Worst Case: O(n^2)
//Space Complexity: O(1) (in-place sorting)
//Quick Sort:
//Description: A divide-and-conquer algorithm that picks a pivot element, partitions the array into elements less than and greater than the pivot, and recursively sorts the partitions.
//Time Complexity:
//Best Case: O(n log n)
//Average Case: O(n log n)
//Worst Case: O(n^2) (when the pivot is the smallest or largest element)
//Space Complexity: O(log n) (for the recursive stack)
//Merge Sort:
//Description: A divide-and-conquer algorithm that divides the array into halves, recursively sorts them, and then merges the sorted halves.
//Time Complexity: O(n log n) for all cases
//Space Complexity: O(n) (requires additional space for merging)
//Time Complexity Comparison:
//Bubble Sort:
//Best Case: O(n) (when the array is already sorted)
//Average Case: O(n^2)
//Worst Case: O(n^2)
//Quick Sort:
//Best Case: O(n log n)
//Average Case: O(n log n)
//Worst Case: O(n^2) (when the pivot is the smallest or largest element)
//Why Quick Sort is Generally Preferred Over Bubble Sort:
//Efficiency: Quick Sort is significantly faster than Bubble Sort for large datasets because of its average and best-case time complexity of O(n log n).
//Scalability: Quick Sort can handle large datasets efficiently, whereas Bubble Sort becomes impractical due to its O(n^2) time complexity.
//Practical Performance: Despite its worst-case scenario, Quick Sort can be optimized with techniques such as random pivot selection or hybrid approaches (like combining with Insertion Sort for small subarrays).