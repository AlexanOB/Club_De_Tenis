package AccesoDatos;

import java.util.List;

public class GerReservas {
    private List<CanchaObservable> canchas;

    public GerReservas(List<CanchaObservable> canchas) {
        this.canchas = canchas;
    }

    public void reservarCancha(int idCancha) {
        for (CanchaObservable cancha : canchas) {
            if (cancha.getId() == idCancha && cancha.isDisponible()) {
                cancha.reservar();
                System.out.println("La cancha " + idCancha + " ha sido reservada.");
                return;
            }
        }
        System.out.println("La cancha " + idCancha + " no está disponible.");
    }

    public void liberarCancha(int idCancha) {
        for (CanchaObservable cancha : canchas) {
            if (cancha.getId() == idCancha && !cancha.isDisponible()) {
                cancha.liberar();
                System.out.println("La cancha " + idCancha + " ha sido liberada.");
                return;
            }
        }
        System.out.println("La cancha " + idCancha + " no ha sido reservada.");
    }
}
