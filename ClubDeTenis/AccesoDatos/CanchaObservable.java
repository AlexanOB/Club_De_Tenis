package AccesoDatos;

import java.util.ArrayList;
import java.util.List;

public class CanchaObservable extends Cancha {
    private List<Observador> observadores = new ArrayList<>();

    public CanchaObservable(int id) {
        super(id);
    }

    public void addObserver(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void reservar() {
        super.reservar();
        notificarObservadores();
    }

    @Override
    public void liberar() {
        super.liberar();
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(this);
        }
    }
}
