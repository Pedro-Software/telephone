
public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        // Cria os objetos do sistema e conecta as dependências
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        KeyPad keyPad = new KeyPad(model);

        // Executa o programa simulando a digitação dos números
        keyPad.simulateKeyPresses(NUM_DIGITS);
    }
}
