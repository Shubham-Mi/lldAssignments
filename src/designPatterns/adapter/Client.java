package designPatterns.adapter;

public class Client {
    public static void main(String[] args) {

        System.out.println("Payment using Razorpay Adapter");
        Flipkart account1 = new Flipkart(new RazorpayPaymentGatewayAdapter());
        account1.makePaymentViaCreditCard("1234567890", 123, 12, 24);

        System.out.println("payment using PayU Adapter");
        Flipkart account2 = new Flipkart(new PayuPaymentGatewayAdapter());
        account2.makePaymentViaCreditCard("1234567890", 123, 12, 24);
    }
}
