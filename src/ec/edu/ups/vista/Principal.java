package ec.edu.ups.vista;

import ec.edu.ups.clases.Aventura;
import ec.edu.ups.clases.Deporte;
import ec.edu.ups.controladores.ControladorAventura;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        

        int opcionMenuPrincipal = 0;
        int opcionMenuAventura = 0;
        int opcionMenuDeporte = 0;
        int opcionMenuBingo = 0;
        int opcionMenuPoker = 0;

        ControladorAventura controlAventura = new ControladorAventura();
        Scanner aven = new Scanner(System.in);
        do {
            System.out.println("***MENU PRINCIPAL***");
            System.out.println("1.- CRUD AVENTURA");
            System.out.println("2.- CRUD DEPORTE");
            System.out.println("3.- CRUD BINGO");
            System.out.println("4.- CRUD POKER");
            System.out.println("5.- SALIR");
            System.out.println("SELECCIONE UNA OPCION");

            opcionMenuPrincipal = aven.nextInt();

            switch (opcionMenuPrincipal) {
                case 1:
                    do {
                        System.out.println("**MENU AVENTURA**");
                        System.out.println("1.- Create");
                        System.out.println("2.- Read");
                        System.out.println("3.- Update");
                        System.out.println("4.- Delete");
                        System.out.println("5.- Regresar Menu Principal");
                        System.out.println("SELECCIONE UNA OPCION");

                        opcionMenuAventura = aven.nextInt();

                        switch (opcionMenuAventura) {
                            case 1:
                                //create
                                //pide todos los datos por teclado
                                //instancia un objeto
                                
                                //llama al metodo create del controlador
                                System.out.println("Ingrese Nombre Juego: ");
                                String nombre = aven.next();
                                System.out.println("Ingrese Categoria: ");
                                String categoria = aven.next();
                                System.out.println("Numero de Jugadores: ");
                                int numjuga = aven.nextInt();
                                System.out.println("Modo Online");
                                boolean modoOnline = aven.nextBoolean();
                                System.out.println("Digital: ");
                                boolean digital = aven.nextBoolean();
                                System.out.println("Plataforms: ");
                                String plataforma = aven.next();
                                System.out.println("Graficos: ");
                                String grafico = aven.next();
                                System.out.println("Mision: ");
                                String mision = aven.next();
                                System.out.println("Objetivos: ");
                                String objetivo = aven.next();
                                System.out.println("Logro: ");
                                String logro = aven.next();
                                System.out.println("Mapa: ");
                                String mapa = aven.next();
                                Aventura aventura = new Aventura(mision, objetivo, logro, mapa, modoOnline, digital, plataforma, grafico, 0, nombre, categoria, numjuga);
                                controlAventura.create(aventura);
                                break;

                            case 2:
                                //read
                                System.out.println("\t\tLeer Aventura");
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo de la Aventura");
                                //llama al metodo read del controlador
                                int codigo = aven.nextInt();
                                System.out.println(controlAventura.read(codigo)); 
                                //visualizo los datos del objeto
                                System.out.println(codigo);
                                break;

                            case 3:
                                //update
                                System.out.println("Actualizar Aventura");
                                //pide todos los datos por teclado
                                Scanner avent = new Scanner(System.in);
                                //instancia un objeto
                                System.out.println("Ingrese Codigo: ");
                                int codig = avent.nextInt();
                                System.out.println("Ingrese Nombre Juego: ");
                                String nombr = avent.next();
                                System.out.println("Ingrese Categoria: ");
                                String categori = avent.next();
                                System.out.println("Numero de Jugadores: ");
                                int numjug = avent.nextInt();
                                System.out.println("Modo Online");
                                boolean modoOnlin = avent.nextBoolean();
                                System.out.println("Digital: ");
                                boolean digita = avent.nextBoolean();
                                System.out.println("Plataforms: ");
                                String plataform = avent.next();
                                System.out.println("Graficos: ");
                                String grafic = avent.next();
                                System.out.println("Mision: ");
                                String misio = avent.next();
                                System.out.println("Objetivos: ");
                                String objetiv = avent.next();
                                System.out.println("Logro: ");
                                String logr = avent.next();
                                System.out.println("Mapa: ");
                                String map = avent.next();
                                //llama al metodo update del controlador
                                Aventura aventuraactualizada = new Aventura(misio, objetiv, logr, map, modoOnlin, digita, plataform, grafic, codig, nombr, categori, numjug);
                                controlAventura.update(aventuraactualizada);
                                break;

                            case 4:
                                //delete
                                System.out.println("Eliminar Aventura");
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo que desea eliminar");
                                //llama al metodo delete del controlador
                                codigo = aven.nextInt();
                                controlAventura.delete(controlAventura.read(codigo));
                                break;

                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;

                        }
                    } while (opcionMenuAventura != 5);
                    break;

                case 2:
                    do {

                    } while (opcionMenuDeporte != 5);
                    break;

                case 3:
                    do {

                    } while (opcionMenuBingo != 5);
                    break;

                case 4:
                    do {

                    } while (opcionMenuPoker != 5);
                    break;

                case 5:

                    break;

            }

        } while (opcionMenuPrincipal != 5);

    }

}
