package ro.ase.cts.chainOfResponsability.clase;

public class NotificatorSMS extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String text) {
        if(client.getNrTelefon() != null) {
            System.out.println("Trimitere SMS catre " + client.getNume() + "; text: " + text);
        } else {
            if(super.getNotificator() != null) {
                super.getNotificator().trimiteNotificare(client, text);
            } else {
                System.out.println("Notificarea se trmiite catre manager pentru clientul " + client.getNume());
            }
        }
    }
}
