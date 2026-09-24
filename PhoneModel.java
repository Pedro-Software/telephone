import java.util.ArrayList;
import java.util.List;

public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private List<PhoneObserver> observers = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyObservers();
    }

    public List<Integer> getDigits() { return digits; }

    public String getNumber() {
        String number = "";
        for (Integer digit : digits) number += digit;
        return number;
    }

    public void addObserver(PhoneObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (PhoneObserver observer : observers) {
            observer.update(this);
        }
    }
}
