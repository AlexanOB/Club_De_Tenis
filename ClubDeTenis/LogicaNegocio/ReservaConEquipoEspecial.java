package LogicaNegocio;

public class ReservaConEquipoEspecial extends ReservaDecorator {
    public ReservaConEquipoEspecial(Reserva reserva) {
        super(reserva);
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Incluye alquiler de equipo especial.");
    }
}
