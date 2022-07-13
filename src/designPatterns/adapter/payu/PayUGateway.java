package designPatterns.adapter.payu;

public class PayUGateway {
    private static int count = 0;
    public String makeCCPayment(Long creditCard,
                                  Long cvv,
                                  Long expiryMonth,
                                  Long expiryYear) {
        System.out.println("Payment Done by Payu");
        return "123";
    }

    public PayUPaymentStatus checkPaymentStatus(String id) {
        count++;
        if (count % 10 == 0)
            return PayUPaymentStatus.SUCCESS;
        return PayUPaymentStatus.FAILURE;
    }
}
