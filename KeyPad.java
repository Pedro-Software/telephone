import java.util.Random;

// Simula a entrada de dados do teclado físico de um telefone.
// Aqui apenas geramos números simulados para testar o sistema.
public class KeyPad {
    private final PhoneModel model;

    public KeyPad(PhoneModel model) {
        this.model = model;
    }

    public void simulateKeyPresses(int numKeyPresses) {
        final int MAX_DIGIT = 10;
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) {
            int newDigit = rnd.nextInt(MAX_DIGIT);
            System.out.println("Pressionando: " + newDigit);
            model.addDigit(newDigit);
        }
    }

}
