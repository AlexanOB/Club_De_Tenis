package LogicaNegocio;

public abstract class ReservaDecorator implements Reserva {
    protected Reserva reservaDecorada;

    public ReservaDecorator(Reserva reserva) {
        this.reservaDecorada = reserva;
    }

    public void mostrarDetalles() {
        reservaDecorada.mostrarDetalles();
    }
}
