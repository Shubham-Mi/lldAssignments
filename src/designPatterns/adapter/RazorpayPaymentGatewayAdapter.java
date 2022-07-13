package designPatterns.adapter;

import designPatterns.adapter.razorpay.RazorpayGateway;

public class RazorpayPaymentGatewayAdapter implements PaymentGateway{
    private RazorpayGateway razorpayGateway = new RazorpayGateway();

    @Override
    public Long payViaCreditCard(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(cvv);
        String expiryDate = String.valueOf(expiryMonth) + "/" + String.valueOf(expiryYear);
        String transactionId = razorpayGateway.payByCreditCard(cardNumber, cvvString, expiryDate);
        return Long.parseLong(transactionId);
    }

    @Override
    public PaymentStatus getStatus(Long transactionId) {
        boolean status = razorpayGateway.checkPaymentStatus(String.valueOf(transactionId));

        if (status)
            return PaymentStatus.SUCCESS;
        return PaymentStatus.FAILURE;
    }
}
