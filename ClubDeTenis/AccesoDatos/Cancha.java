package AccesoDatos;

import LogicaNegocio.Reserva;
public class Cancha implements Reserva {
    private int id;
    private boolean disponible;

    public Cancha(int id) {
        this.id = id;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void reservar() {
        disponible = false;
    }

    public void liberar() {
        disponible = true;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cancha #" + id + " - Disponible: " + disponible);
    }
}
