// Essa interface define quem pode ser avisado pelo telefone quando um novo dígito for inserido.
public interface PhoneObserver {
    void update(PhoneModel phone);
}
