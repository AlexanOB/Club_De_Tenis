package AccesoDatos;


public class Usuario implements Observador {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(Cancha cancha) {
        System.out.println("Hola " + nombre + ", la Cancha " + cancha.getId() + 
                           " está " + (cancha.isDisponible() ? "disponible." : "reservada."));
    }
}