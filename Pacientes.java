import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Pacientes {
    File archivo;

    private void crearArchivoDeTexto() {
        archivo = new File("archivo.txt");
    }

    private void eliminarArchivoDeTexto() {
        if (archivo.delete()) {
            System.out.println("Archivo elminado con éxito");
        } else {
            System.out.println("Error al eliminar el archivo");

        }
    }
    private void Escribirenarchivo() {
        try {
            Scanner entrada = new Scanner(System.in);

            int opcion;
            String codigo;
            String ocupacion;
            String enfermedad;
            String hora;
            String dia;
            String mes;
            System.out.println("\n\t\tBIENVENIDO AL REGISTRO DE CITAS");
            System.out.println("\n\t1. Añadir Cita ");
            System.out.println("\t2. Eliminar Cita ");
            System.out.println("\t3. Buscar Cita ");
            System.out.println("\t5. Mostrar Citas");
            System.out.println("\tIngrese opcion");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1: {
                    FileWriter escritura = new FileWriter(archivo,true);
                    System.out.println("\n\t\t\tAñadir Cita");
                    escritura.write("\n\t\t\tLista de Citas");

                    System.out.print("\t- Codigo: ");
                    codigo = entrada.nextLine();
                    System.out.print("\t- Ocupación: ");
                    ocupacion = entrada.nextLine();
                    System.out.print("\t- Enfermedad: ");
                    enfermedad = entrada.nextLine();
                    System.out.print("\t- Hora: ");
                    hora = entrada.nextLine();
                    System.out.print("\t- Día: ");
                    dia = entrada.nextLine();
                    System.out.print("\t- Mes: ");
                    mes = entrada.nextLine();

                    escritura.write("\n\tcodigo:" + codigo);
                    escritura.write("\n\tocupacion:" + ocupacion);
                    escritura.write("\n\tenfermedad:" + enfermedad);
                    escritura.write("\n\thora:" + hora);
                    escritura.write("\n\tdía:" + dia);
                    escritura.write("\n\tmes:" + mes);
                    escritura.close();

                }
                break;
                case 5: {
                    FileReader archivo;
                    BufferedReader lector;
                    try {
                        archivo = new FileReader("archivo.txt");
                        if (archivo.ready()) {
                            lector = new BufferedReader(archivo);
                            String cadena;
                            while ((cadena = lector.readLine()) != null) {
                                System.out.println(cadena);
                            }
                        } else {
                            System.out.println("No se puede leer");
                        }
                    } catch (Exception e) {
                        System.out.println("Error" + e.getMessage());
                    }
                }break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcion);
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        Pacientes archivoTexto = new Pacientes();
        archivoTexto.crearArchivoDeTexto();
        archivoTexto.Escribirenarchivo();

    }
}
