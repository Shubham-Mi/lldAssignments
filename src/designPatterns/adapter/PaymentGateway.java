package designPatterns.adapter;

public interface PaymentGateway {
    Long payViaCreditCard(String cardNumber, int cvv, int expiryMonth, int expiryYear);

    PaymentStatus getStatus(Long transactionId);
}
