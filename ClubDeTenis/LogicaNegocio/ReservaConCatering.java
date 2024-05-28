package LogicaNegocio;

public class ReservaConCatering extends ReservaDecorator {
    public ReservaConCatering(Reserva reserva) {
        super(reserva);
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Incluye servicio de catering.");
    }
}