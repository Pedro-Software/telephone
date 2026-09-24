import java.util.ArrayList;
import java.util.List;

public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
    }

    public List<Integer> getDigits() { return digits; }

    public String getNumber() {
        String number = "";
        for (Integer digit : digits) number += digit;
        return number;
    }
}
