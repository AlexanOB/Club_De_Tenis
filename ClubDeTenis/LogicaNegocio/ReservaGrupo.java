package LogicaNegocio;


public class ReservaGrupo implements Reserva {
    private int idCancha;

    public ReservaGrupo(int idCancha) {
        this.idCancha = idCancha;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Reserva grupal para la Cancha " + idCancha);
    }
}