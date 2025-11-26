package latihan5_dip.good;

import latihan5_dip.good.CardValidator;


public class MockCardValidator implements CardValidator {
    @Override
    public boolean validate(String cardNumber) {
        System.out.println("[MockCardValidator] Pretending card is always valid");
        return true;
    }
}
