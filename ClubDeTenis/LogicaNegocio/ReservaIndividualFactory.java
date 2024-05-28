package LogicaNegocio;

public class ReservaIndividualFactory implements ReservaFactory {
    @Override
    public Reserva crearReserva(int idCancha) {
        return new ReservaIndividual(idCancha);
    }
}