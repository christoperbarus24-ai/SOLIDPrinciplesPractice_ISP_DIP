package latihan5_dip.good;

import latihan5_dip.good.TransactionLogger;


public class MockTransactionLogger implements TransactionLogger {
    @Override
    public void log(String transactionId, double amount, String status) {
        System.out.println("[MockTransactionLogger] Logging skipped (mock)");
    }
}