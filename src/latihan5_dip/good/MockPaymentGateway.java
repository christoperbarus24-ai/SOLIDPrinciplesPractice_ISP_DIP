package latihan5_dip.good;

import latihan5_dip.good.PaymentGateway;


public class MockPaymentGateway implements PaymentGateway {
    @Override
    public String charge(String cardNumber, double amount) {
        System.out.println("[MockPaymentGateway] Pretending payment always successful");
        return "MOCK-TXN-00001";
    }
}