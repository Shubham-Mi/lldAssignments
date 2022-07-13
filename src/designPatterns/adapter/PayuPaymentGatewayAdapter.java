package designPatterns.adapter;

import designPatterns.adapter.payu.PayUGateway;
import designPatterns.adapter.payu.PayUPaymentStatus;

public class PayuPaymentGatewayAdapter implements PaymentGateway{
    private PayUGateway payUGateway = new PayUGateway();

    @Override
    public Long payViaCreditCard(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        Long creditCard = Long.parseLong(cardNumber);
        Long cvvLong = (long) cvv;
        Long expiryMonthLong = (long) expiryMonth;
        Long expiryYearLong = (long) expiryYear;

        String transactionId = payUGateway.makeCCPayment(creditCard, cvvLong, expiryMonthLong, expiryYearLong);
        return Long.parseLong(transactionId);
    }

    @Override
    public PaymentStatus getStatus(Long transactionId) {
        PayUPaymentStatus payUPaymentStatus = payUGateway.checkPaymentStatus(String.valueOf(transactionId));

        switch (payUPaymentStatus) {
            case SUCCESS -> {
                return PaymentStatus.SUCCESS;
            }
            case PENDING -> {
                return PaymentStatus.PENDING;
            }
        }
        return PaymentStatus.FAILURE;
    }
}
