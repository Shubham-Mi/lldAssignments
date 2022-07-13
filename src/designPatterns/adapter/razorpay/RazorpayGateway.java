package designPatterns.adapter.razorpay;

public class RazorpayGateway {
    private static int count = 0;
    public String payByCreditCard(String creditCard,
                           String cvv,
                           String expiry) {
        System.out.println("Payment Done by Razorpay");
        return "123";
    }

    public boolean checkPaymentStatus(String id) {
        count++;

        if (count % 10 == 0)
            return true;
        return false;
    }
}
