public class AdapterPatternTest {
    public static void main(String[] args) {
        // PayPal payment processing
        PayPal payPal = new PayPal();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPal);
        payPalProcessor.processPayment(100.0);

        // Stripe payment processing
        Stripe stripe = new Stripe();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(200.0);

        // Square payment processing
        Square square = new Square();
        PaymentProcessor squareProcessor = new SquareAdapter(square);
        squareProcessor.processPayment(300.0);
    }
}

