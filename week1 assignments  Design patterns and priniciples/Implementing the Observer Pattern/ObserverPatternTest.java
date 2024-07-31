public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create stock market
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        // Register observers
        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        // Change stock price and notify observers
        System.out.println("Setting stock price to 100.0");
        stockMarket.setPrice(100.0);

        // Deregister webApp and update price
        stockMarket.deregister(webApp);
        System.out.println("\nSetting stock price to 200.0");
        stockMarket.setPrice(200.0);
    }
}
