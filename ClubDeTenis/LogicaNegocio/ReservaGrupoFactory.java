package LogicaNegocio;

public class ReservaGrupoFactory implements ReservaFactory {
    @Override
    public Reserva crearReserva(int idCancha) {
        return new ReservaGrupo(idCancha);
    }
}