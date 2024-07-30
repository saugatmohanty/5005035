public class FinancialForecastingTool {
    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: if periods is 0, return the present value
        if (periods == 0) {
            return presentValue;
        }
        // Recursive case: calculate the future value for the remaining periods
        return (1 + growthRate) * calculateFutureValue(presentValue, growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Example present value
        double growthRate = 0.05; // Example growth rate (5%)
        int periods = 10; // Example number of periods (years)

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("The future value after " + periods + " years is: " + futureValue);
    }
}
