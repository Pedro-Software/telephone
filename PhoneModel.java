import java.util.ArrayList;
import java.util.List;

public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();

    // Essa lista guarda os observadores que querem receber notificações do telefone.
    private List<PhoneObserver> observers = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        // Depois de adicionar o novo dígito, todos os observadores cadastrados são avisados.
        notifyObservers();
    }

    public List<Integer> getDigits() { return digits; }

    public String getNumber() {
        String number = "";
        for (Integer digit : digits) number += digit;
        return number;
    }

    // Permite que novos observadores se cadastrem para receber avisos.
    public void addObserver(PhoneObserver observer) {
        observers.add(observer);
    }

    // O telefone apenas avisa os observadores que algo mudou.
    // Ele não sabe quem eles são e nem o que vão fazer com essa informação.
    private void notifyObservers() {
        for (PhoneObserver observer : observers) {
            observer.update(this);
        }
    }
}
