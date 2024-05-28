package Presentacion;

import AccesoDatos.ClubDeTenis;
import AccesoDatos.Usuario;
import LogicaNegocio.Reserva;
import LogicaNegocio.ReservaFactory;
import LogicaNegocio.ReservaIndividualFactory;
import LogicaNegocio.ReservaGrupoFactory;
import LogicaNegocio.ReservaConCatering;
import LogicaNegocio.ReservaConEquipoEspecial;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClubDeTenis club = new ClubDeTenis(5); 
        
        Usuario user1 = new Usuario("Juan");
        Usuario user2 = new Usuario("Maria");
        Usuario user3 = new Usuario("Ana");
        Usuario user4 = new Usuario("Miguel");
        Usuario user5 = new Usuario("Pedro");
        Usuario user6 = new Usuario("Miriam");

        club.agregarCancha(user1, 1);
        club.agregarCancha(user2, 2);
        club.agregarCancha(user3, 3);
        club.agregarCancha(user4, 4);
        club.agregarCancha(user5, 5);

        ReservaFactory reservaIndividualFactory = new ReservaIndividualFactory();
        ReservaFactory reservaGrupoFactory = new ReservaGrupoFactory();

        while (true) {
            System.out.println("        Club de Tenis   ");
            System.out.println("1. Mostrar canchas disponibles");
            System.out.println("2. Reservar cancha");
            System.out.println("3. Liberar cancha");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    club.mostrarCanchasDisponibles();
                    break;
                case 2:
                    System.out.println("Ingrese el ID de la cancha a reservar:");
                    int idReservar = scanner.nextInt();
                    System.out.println("Seleccione tipo de reserva: 1. Individual 2. Grupal");
                    System.out.println(" 1. Individual ");
                    System.out.println(" 2. Grupal");
                    int tipoReserva = scanner.nextInt();
                    Reserva reserva;
                    if (tipoReserva == 1) {
                        reserva = reservaIndividualFactory.crearReserva(idReservar);
                    } else {
                        reserva = reservaGrupoFactory.crearReserva(idReservar);
                    }

                    System.out.println("Desea agregar servicios adicionales? ");
                    System.out.println("1. Ninguno ");
                    System.out.println("2. Catering ");
                    System.out.println("3. Equipo Especial ");
                    System.out.println("4. Ambos");

                    int tipoServicio = scanner.nextInt();
                    if (tipoServicio == 2) {
                        reserva = new ReservaConCatering(reserva);
                    } else if (tipoServicio == 3) {
                        reserva = new ReservaConEquipoEspecial(reserva);
                    } else if (tipoServicio == 4) {
                        reserva = new ReservaConCatering(new ReservaConEquipoEspecial(reserva));
                    }

                    reserva.mostrarDetalles();
                    club.reservarCancha(idReservar);
                    break;
                case 3:
                    System.out.println("Ingrese el ID de la cancha a liberar:");
                    int idLiberar = scanner.nextInt();
                    club.liberarCancha(idLiberar);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
