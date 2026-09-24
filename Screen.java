public class Screen {
    public Screen(PhoneModel model) {
        model.addObserver(phone -> {
            int last = phone.getDigits().get(phone.getDigits().size() - 1);
            System.out.println(last);
        });

        model.addObserver(phone -> {
            System.out.println("Agora discando " + phone.getNumber() + "...");
        });
    }
}
