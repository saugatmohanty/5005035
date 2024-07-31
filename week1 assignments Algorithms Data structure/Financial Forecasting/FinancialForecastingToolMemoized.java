import java.util.HashMap;
import java.util.Map;

public class FinancialForecastingToolMemoized {
    private static Map<Integer, Double> memo = new HashMap<>();

    // Recursive method to calculate future value with memoization
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: if periods is 0, return the present value
        if (periods == 0) {
            return presentValue;
        }
        // Check if the result is already in the memo
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }
        // Recursive case: calculate the future value for the remaining periods
        double futureValue = (1 + growthRate) * calculateFutureValue(presentValue, growthRate, periods - 1);
        // Store the result in the memo
        memo.put(periods, futureValue);
        return futureValue;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Example present value
        double growthRate = 0.05; // Example growth rate (5%)
        int periods = 10; // Example number of periods (years)

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("The future value after " + periods + " years is: " + futureValue);
    }
}

//Theory Questions and answers

//Step 1: Understand Recursive Algorithms
//Recursion:

//Concept: Recursion is a programming technique where a function calls itself to solve smaller instances of the same problem. Each recursive call processes a smaller part of the problem until a base case is reached.
//Advantages: Simplifies code for problems that can be broken down into smaller, repetitive sub-problems (e.g., factorials, Fibonacci series, tree traversals).
//Disadvantages: Can lead to excessive memory usage and computation time if not managed properly, especially if the recursion depth is too high.
//Step 2: Setup
//Future Value Calculation Method:

//We will create a method to predict future values based on past growth rates using recursion.
//Step 3: Implementation
//Recursive Algorithm to Predict Future Values:

//Let's assume we want to predict the future value based on a constant growth rate. The future value 
//Let's assume we want to predict the future value based on a constant growth rate. The future value FV aftern years can be calculated using the formula:
//FV=PV×(1+r)n
//Where:


//PV is the present value.

//r is the growth rate.

//n is the number of periods (years).
//In a recursive approach, we can break it down as:
//FV(n)=PV×(1+r)×FV(n−1)
//With the base case being:FV(0)=PV
//Time Complexity:

//Recursive Algorithm Time Complexity:
//Each call to calculateFutureValue results in another call to itself with 1
//periods−1.
//This continues until 

//periods reaches 0.
//The time complexity is 

//O(n), where 

//n is the number of periods. This is because there is one recursive call per period.
//Optimizing the Recursive Solution:

//Memoization:
//Memoization is a technique used to store the results of expensive function calls and reuse them when the same inputs occur again, thereby avoiding redundant computations.
//We can create a cache (e.g., a map or an array) to store the results of each recursive call.
