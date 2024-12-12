package view;

import DB.ConectionDatabase;
import  model.modelUsuarios;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        modelUsuarios = new modelUsuarios();
        Usuario usuario = null;

        // Menú de registro o inicio de sesión

        System.out.println("----- Bienvenido a BanCode -----");
        System.out.println("//////////////////////////////////");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Iniciar sesión");
        System.out.print("Seleccione una opción: ");

        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer de entrada

        if (opcion == 1){
            // Registro de usuario
            System.out.print("Ingrese su nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese su correo: ");
            String correo = sc.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contraseña = sc.nextLine();
            System.out.print("Ingrese su rol (cliente/administrador): ");
            String rol = sc.nextLine();

            usuario = new Usuario(0, nombre, contraseña, correo, rol);
            if (usuaioController.registrarUsuario(usuario)){
                System.out.println("Usuario Registrado Correctamente");
            }else {
                System.out.println("Error al registrar");
            }
        } else if (opcion == 2){

            // Inicio de sesión
            System.out.print("Ingrese su correo: ");
            String correo = sc.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contraseña = sc.nextLine();

            usuario = usuaioController.iniciarSesion(correo,contraseña);

            if (usuario != null){
                System.out.println("Inicio de sesión exitoso!, Bienvenido, " + usuario.getNombre());
            }else {
                System.out.println("Correo o Contraseña incorrectos");
                return; // Salir si el inicio de sesión falla
            }
        }
        // Mostrar el menú dependiendo del rol del usuario
        if (usuario != null && usuario.getRol().equalsIgnoreCase("Cliente")){
            mostrarMenuCliente();
        } else if (usuario != null && usuario.getRol().equalsIgnoreCase("Administrador")){
            mostrarMenuAdministrador();
        }
    }

    // Menú de cliente
    public static void mostrarMenuCliente(){
        System.out.println("\n" + "Menú Cliente:");
        System.out.println("1. Ver créditos disponibles");
        System.out.println("2. Solicitar crédito");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");

        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                CreditoView.mostrarCreditosDisponibles();
                break;
            case 2:
                SolicitudCreditoView.solicitarCredito();
            case 3:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    // Menú de administrador

    public static void mostrarMenuAdministrador(){
        System.out.println("\nMenú Administrador:");
        System.out.println("1. Ver registros de usuarios");
        System.out.println("2. Ver solicitudes de crédito");
        System.out.println("3. Crear opción de crédito");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");

        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                //ver registros de usuarios
            case 2:
                //Ver solicitudes de credito
            case 3:
                //crear opcion de credito
            case 4:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
