package latihan5_dip.good;

// Concrete implementation of CardValidator
public class LuhnCardValidator implements CardValidator {

    // TODO: Uncomment dan implementasikan
    /*
    @Override
    public boolean validate(String cardNumber) {
        System.out.println("[LuhnCardValidator] Validating card using Luhn algorithm: " + cardNumber);

        // Remove dashes
        String cleanCard = cardNumber.replace("-", "");

        // Simple validation
        if (cleanCard == null || cleanCard.length() != 16) {
            System.out.println("[LuhnCardValidator] Card is invalid ✗");
            return false;
        }

        // In real implementation, would use actual Luhn algorithm
        System.out.println("[LuhnCardValidator] Card is valid ✓");
        return true;
    }
    */
    @Override
    public boolean validate(String cardNumber) {
        System.out.println("[LuhnCardValidator] Validating card using Luhn algorithm: " + cardNumber);

        // Remove dashes
        String cleanCard = cardNumber.replace("-", "");

        // Simple validation
        if (cleanCard == null || cleanCard.length() != 16) {
            System.out.println("[LuhnCardValidator] Card is invalid ✗");
            return false;
        }

        // In real implementation, would use actual Luhn algorithm
        System.out.println("[LuhnCardValidator] Card is valid ✓");
        return true;
    }
}
