public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Display images
        System.out.println("First call to display image1:");
        image1.display(); // Loads from remote server
        System.out.println("\nSecond call to display image1:");
        image1.display(); // Uses cached image

        System.out.println("\nFirst call to display image2:");
        image2.display(); // Loads from remote server
        System.out.println("\nSecond call to display image2:");
        image2.display(); // Uses cached image
    }
}

