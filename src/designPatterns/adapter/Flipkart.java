package designPatterns.adapter;

public class Flipkart {
    private PaymentGateway paymentGateway;

    public Flipkart(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePaymentViaCreditCard(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        Long transactionId = this.paymentGateway.payViaCreditCard(cardNumber, cvv, expiryMonth, expiryYear);

        while (!this.paymentGateway.getStatus(transactionId).equals(PaymentStatus.SUCCESS)) {
            System.out.println("Waiting");
        }
        System.out.println("Payment Successful");
    }
}
