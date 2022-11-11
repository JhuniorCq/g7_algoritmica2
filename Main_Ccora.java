import java.io.*;
import java.util.Scanner;
public class Main_Ccora
{

    public static void main(String[] args) throws IOException
    {
        Main_Ccora archivoTexto = new Main_Ccora();

        File archivo;

        archivo = new File ("Lista de Pacientes.txt");

        Scanner entrada = new Scanner(System.in);

        int numeroPacientes;
        int opcion;
        String nombre;
        String apellidos;
        String sexo;
        String DNI;
        String ocupacion;
        String enfermedad;
        String codigo;

        System.out.print("\n\t- Ingrese la Cantidad de Pacientes: ");
        numeroPacientes = entrada.nextInt();

        RegistroPacientes paciente[] = new RegistroPacientes[numeroPacientes];

        do
        {
            System.out.println("\n\t\tBIENVENIDO AL REGISTRO DE PACIENTES");
            System.out.println("\n\t1. Añadir Paciente ");
            System.out.println("\t2. Eliminar Paciente ");
            System.out.println("\t3. Buscar Paciente ");
            System.out.println("\t4. Listar Paciente");
            System.out.println("\t5. Mostrar Datos de Pacientes");
            System.out.println("\t0. Salir");
            System.out.print("\n\t- Elija una Opción: ");
            opcion = entrada.nextInt();

            entrada.nextLine();

            switch (opcion)
            {
                case 0:
                {
                    System.out.println("\n\t\tMUCHAS GRACIAS, ADIÓS");
                }
                break;
                case 1:
                {
                    FileWriter escritura = new FileWriter(archivo, true);

                    System.out.println("\n\t\t\tAÑADIR PACIENTE");

                    for (int i = 0; i < numeroPacientes; i++) {
                        System.out.println("\n\t\tPACIENTE #" + (i + 1));
                        System.out.print("\n\t- Nombre(s): ");
                        nombre = entrada.nextLine();
                        System.out.print("\t- Apellidos: ");
                        apellidos = entrada.nextLine();
                        System.out.print("\t- Sexo: ");
                        sexo = entrada.nextLine();
                        System.out.print("\t- DNI: ");
                        DNI = entrada.nextLine();
                        System.out.print("\t- Ocupación: ");
                        ocupacion = entrada.nextLine();
                        System.out.print("\t- Enfermedad: ");
                        enfermedad = entrada.nextLine();
                        System.out.print("\t- Código: ");
                        codigo = entrada.nextLine();

                        escritura.write("\n\n\t" + nombre);
                        escritura.write("\n\t" + apellidos);
                        escritura.write("\n\t" + sexo);
                        escritura.write("\n\t" + DNI);
                        escritura.write("\n\t" + ocupacion);
                        escritura.write("\n\t" + enfermedad);
                        escritura.write("\n\t" + codigo);

                        paciente[i] = new RegistroPacientes(nombre, apellidos, sexo, DNI, ocupacion, enfermedad, codigo);

                    }
                    escritura.close();
                }
                break;
                case 5:
                {
                    System.out.println("\n\t\t\tDATOS DE TODOS LOS PACIENTES");
                    String contenido;

                    FileReader lector = new FileReader(archivo);

                    BufferedReader lectura = new BufferedReader(lector);

                    contenido = lectura.readLine();

                    while(contenido != null)
                    {
                        System.out.println(contenido);
                        contenido = lectura.readLine();
                    }
                }
                break;
            }
        } while(opcion != 0);
    }

}
