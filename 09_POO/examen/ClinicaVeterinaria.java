
import clases.Clinica;
import clases.Gato;
import clases.Mascota;
import clases.Perro;

/**
 * Clínica Veterinaria AniVet
 * Examen 21/02/2024
 * 
 * @author Sergio Sánchez
 */

public class ClinicaVeterinaria {

    // Constantes del menú
    private static final int SALIR = 0;
    private static final int AGREGAR_MASCOTA = 1;
    private static final int LISTAR_MASCOTAS = 2;
    private static final int BUSCAR_MASCOTA = 3;
    private static final int PASEAR_MASCOTA = 4;
    private static final int VACUNAR_MASCOTA = 5;
    private static final int ESTADISTICAS = 6;

    // Constantes de mascotas
    private static final int ES_PERRO = 0;
    private static final int ES_GATO = 1;

    private static Clinica clinica;

    public static void main(String[] args) {

        // Creamos e inicializamos por defecto la opción
        int opcion = SALIR;
        // Inicializamos la agenda
        clinica = new Clinica();

        do {

            try {
                // Mostramos el menú de la aplicación
                menu();
                // Leemos la opción
                opcion = Integer.parseInt(System.console().readLine());
                // Comprobamos la opción introducida
                switch (opcion) {
                    case SALIR:
                        break;
                    case AGREGAR_MASCOTA:
                        agregarMascota();
                        break;
                    case LISTAR_MASCOTAS:
                        listarMascotas();
                        break;
                    case BUSCAR_MASCOTA:
                        buscarMascotaChip();
                        break;
                    case PASEAR_MASCOTA:
                        pasearMascota();
                        break;
                    case VACUNAR_MASCOTA:
                        vacunarMascota();
                        break;
                    case ESTADISTICAS:
                        estadisticas();
                        break;
                    default:
                        System.out.println("La opción elegida no existe.\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe introducir un valor numérico.\n");
            }
        } while (opcion != SALIR);

        // Fin de la aplicación
        System.out.println("\n¡Hasta pronto!");
    }

    /**
     * Menú de la aplicación
     */
    private static void menu() {

        System.out.println("\nCLÍNICA VETERINARIA ANIVET\n==========================");
        System.out.println("0. Salir.");
        System.out.println("1. Agregar mascota.");
        System.out.println("2. Listar mascotas.");
        System.out.println("3. Buscar mascota por chip.");
        System.out.println("4. Pasear mascota.");
        System.out.println("5. Vacunar mascota.");
        System.out.println("6. Estadística de mascotas.");

        System.out.print("Opción? ");
    }

    /**
     * Añade una mascota nueva a la clínica.
     */
    private static void agregarMascota() {

        int tipo;
        int edad;

        String chip;
        String nombre;
        String raza;
        String pelaje;

        Perro perro;
        Gato gato;

        if (clinica.esLlena()) {
            System.out.println("Imposible agregar una nueva mascota. No quedan plazas libres.");
        } else {

            // Preguntamos qué tipo de mascota se va a añadir
            System.out.print("¿Qué tipo de mascota vas a añadir? (0 - perro, 1 - gato): ");
            tipo = Integer.parseInt(System.console().readLine());

            if ((tipo != ES_PERRO) && (tipo != ES_GATO)) {
                System.out.println("No es un tipo de mascota válido.\n");
            } else {

                // solicitamos datos comunes
                System.out.print("Nº de chip: ");
                chip = System.console().readLine();

                System.out.print("Nombre: ");
                nombre = System.console().readLine();

                System.out.print("Edad: ");
                edad = Integer.parseInt(System.console().readLine());

                // Solicitamos datos específicos para cada mascota
                switch (tipo) {

                    case ES_PERRO:
                        System.out.print("Raza: ");
                        raza = System.console().readLine();

                        // Creamos la mascota
                        perro = new Perro(chip, nombre);
                        perro.setEdad(edad);
                        perro.setRaza(raza);

                        // Guardamos la mascota
                        clinica.agregar(perro);

                        break;

                    case ES_GATO:

                        System.out.print("Pelaje    : ");
                        pelaje = System.console().readLine();

                        // Creamos la mascota
                        gato = new Gato(chip, nombre);
                        gato.setEdad(edad);
                        gato.setPelaje(pelaje);

                        // Guardamos la mascota
                        clinica.agregar(gato);

                        break;
                }
            }
        }
    }

    /**
     * Solicita el número de chip, busca y devuelve la mascota.
     * 
     * @return
     */
    private static Mascota buscar() {

        String chip;

        System.out.print("Nº de chip a buscar: ");
        chip = System.console().readLine();

        return clinica.buscarChip(chip);
    }

    /**
     * Busca la mascota por número de chip.
     */
    private static void buscarMascotaChip() {

        Mascota mascota;

        // Solicitamos chip y buscamos mascota
        mascota = buscar();

        // Mostramos información sobre la mascota
        if (mascota == null) {
            System.out.println("La mascota no pertenece a la clínica.");
        } else {

            System.out.printf("Nº de chip: %s\n", mascota.getChip());
            System.out.printf("Nombre: %s\n", mascota.getNombre());
            System.out.printf("Edad: %d\n", mascota.getEdad());

            if (mascota instanceof Gato) {
                System.out.printf("Pelaje: %s\n", ((Gato) mascota).getPelaje());
            } else {
                System.out.printf("Raza: %s\n", ((Perro) mascota).getRaza());
            }
        }
    }

    /**
     * Busca la mascota por número de chip y, si se encuentra en el listado
     * de la clínica, se pasea. Cuando una mascota se pasea ladra o maulla.
     */
    private static void pasearMascota() {

        Mascota mascota;

        // Solicitamos chip y buscamos mascota
        mascota = buscar();

        // Mostramos información sobre la mascota
        if (mascota == null) {
            System.out.println("La mascota no pertenece a la clínica.");
        } else {
            mascota.pasear();
        }
    }

    /**
     * Busca la mascota por número de chip y, si se encuentra en el
     * listado de la clínica, se pasea. Cuando una mascota se pasea
     * gruñe o bufa.
     */
    private static void vacunarMascota() {

        Mascota mascota;

        // Solicitamos chip y buscamos mascota
        mascota = buscar();

        // Vacunamos a la mascota
        if (mascota == null) {
            System.out.println("La mascota no pertenece a la clínica.");
        } else {
            mascota.vacunar();
        }
    }

    /**
     * Muestra un listado de mascotas.
     */
    private static void listarMascotas() {
        if (clinica.esVacia()) {
            System.out.println("Aún no se ha registrado ninguna mascota en la clínica.");
        } else {
            clinica.listar();
        }
    }

    /**
     * Muestra las estadísticas de las mascotas.
     */
    private static void estadisticas() {
        System.out.printf("\n=======================\n");
        System.out.printf("Estadística de mascotas\n");
        System.out.printf("\n=======================\n");
        System.out.printf("Total de perros: %6d\n", clinica.totalPerros());
        System.out.printf("Total de gatos : %6d\n", clinica.totalGatos());
        System.out.printf("Total mascotas : %6d\n", clinica.totalMascotas());
        System.out.printf("=======================\n\n");
    }

}
