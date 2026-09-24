// A classe Screen cria a tela e registra os observadores no telefone.
public class Screen {
    public Screen(PhoneModel model) {
        // Observador 1: Tem a responsabilidade de mostrar apenas o último dígito inserido.
        model.addObserver(phone -> {
            int last = phone.getDigits().get(phone.getDigits().size() - 1);
            System.out.println(last);
        });

        // Observador 2: Tem a responsabilidade diferente de mostrar o número completo que está sendo discado.
        model.addObserver(phone -> {
            System.out.println("Agora discando " + phone.getNumber() + "...");
        });
    }
}
