package ro.ase.cts.observer.clase;

public class Manager extends ManagerSalaDeSport {
    public void anuntaMeci(String tipSport) {
        super.notificaObservatori("Va avea loc un meci de " + tipSport);
    }
}
