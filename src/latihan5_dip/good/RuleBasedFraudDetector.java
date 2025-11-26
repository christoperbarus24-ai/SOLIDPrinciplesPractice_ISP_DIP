package latihan5_dip.good;

// Concrete implementation of FraudDetector
public class RuleBasedFraudDetector implements FraudDetector {

    // TODO: Uncomment dan implementasikan
    /*
    @Override
    public boolean checkFraud(String cardNumber, double amount) {
        System.out.println("[RuleBasedFraudDetector] Checking fraud with rules for amount: " + amount);

        // Rule 1: Flag if amount > 1,000,000
        if (amount > 1000000.0) {
            System.out.println("[RuleBasedFraudDetector] FRAUD DETECTED - Amount too high! ✗");
            return true;
        }

        // Rule 2: Could add more rules here
        // - Multiple transactions in short time
        // - Transactions from different countries
        // - etc.

        System.out.println("[RuleBasedFraudDetector] No fraud detected ✓");
        return false;
    }
    */
    @Override
    public boolean checkFraud(String cardNumber, double amount) {
        System.out.println("[RuleBasedFraudDetector] Checking fraud with rules for amount: " + amount);

        // Rule 1: Flag if amount > 1,000,000
        if (amount > 1000000.0) {
            System.out.println("[RuleBasedFraudDetector] FRAUD DETECTED - Amount too high! ✗");
            return true;
        }

        // Rule 2: Could add more rules here
        // - Multiple transactions in short time
        // - Transactions from different countries
        // - etc.

        System.out.println("[RuleBasedFraudDetector] No fraud detected ✓");
        return false;
    }
}
