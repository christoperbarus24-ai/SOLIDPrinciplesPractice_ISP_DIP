package latihan5_dip.good;

import latihan5_dip.good.FraudDetector;


public class MockFraudDetector implements FraudDetector {
    @Override
    public boolean checkFraud(String cardNumber, double amount) {
        System.out.println("[MockFraudDetector] Pretending no fraud detected");
        return false;
    }
}