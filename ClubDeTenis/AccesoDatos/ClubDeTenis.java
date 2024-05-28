package AccesoDatos;

import java.util.ArrayList;
import java.util.List;

public class ClubDeTenis {
    private List<CanchaObservable> canchas;
    private GerReservas gerReservas;

    public ClubDeTenis(int numCanchas) {
        canchas = new ArrayList<>();
        for (int i = 1; i <= numCanchas; i++) {
            CanchaObservable cancha = new CanchaObservable(i);
            canchas.add(cancha);
        }
        gerReservas = new GerReservas(canchas);
    }

    public void agregarCancha(Observador observador, int idCancha) {
        for (CanchaObservable cancha : canchas) {
            if (cancha.getId() == idCancha) {
                cancha.addObserver(observador);
                return;
            }
        }
        System.out.println("La cancha " + idCancha + " no existe.");
    }

    public void mostrarCanchasDisponibles() {
        System.out.println("Canchas disponibles:");
        for (CanchaObservable cancha : canchas) {
            if (cancha.isDisponible()) {
                System.out.println("Cancha " + cancha.getId());
            }
        }
    }

    public void reservarCancha(int idCancha) {
        gerReservas.reservarCancha(idCancha);
    }

    public void liberarCancha(int idCancha) {
        gerReservas.liberarCancha(idCancha);
    }
}
