package LogicaNegocio;

public class ReservaIndividual implements Reserva {
    private int idCancha;

    public ReservaIndividual(int idCancha) {
        this.idCancha = idCancha;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Reserva individual para la Cancha " + idCancha);
    }
}
