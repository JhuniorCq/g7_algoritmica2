import java.io.*;
import java.util.Scanner;
public class Main
{


    public static void main(String[] args) throws IOException
    {
        Main archivoTexto = new Main();
        int numeroPacientes;

        int numeroTerapeutas;
        int opcion;
        String nombre;
        String apellidos;
        String sexo;
        String DNI;
        String ocupacion;
        String enfermedad;
        String codigo;
        String especialidad;
        int horarioentrada, horariosalida;

        File archivo;
        File archivo2;
        int modulo;

        archivo = new File ("Lista de Pacientes.txt");
        archivo2 = new File ("Lista de Terapeutas.txt");

        Scanner entrada = new Scanner(System.in);

        do
        {
            System.out.println("\n\t\tBIENVENIDO AL SISTEMA DEL CENTRO DE REFLEXOLOGÍA");
            System.out.println("\n\t1. Módulo Pacientes ");
            System.out.println("\t2. Módulo Terapeutas ");
            System.out.println("\t0. Salir");
            System.out.print("\n\t- Elija una Opción: ");
            modulo = entrada.nextInt();

            entrada.nextLine();

            switch (modulo) {
                case 1: {

                    System.out.print("\n\t- Ingrese la Cantidad de Pacientes: ");
                    numeroPacientes = entrada.nextInt();

                    RegistroPacientes paciente[] = new RegistroPacientes[numeroPacientes];

                    do {
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
                        switch (opcion) {
                            case 0: {
                                System.out.println("\n\t\tMUCHAS GRACIAS, ADIÓS");
                            }
                            break;
                            case 1: {
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
                            case 5: {
                                System.out.println("\n\t\t\tDATOS DE TODOS LOS PACIENTES");
                                String contenido;

                                FileReader lector = new FileReader(archivo);

                                BufferedReader lectura = new BufferedReader(lector);

                                contenido = lectura.readLine();

                                while (contenido != null) {
                                    System.out.println(contenido);
                                    contenido = lectura.readLine();
                                }
                            }
                            break;
                        }
                    } while (opcion != 0);


                    break;
                }
                case 2: {

                    System.out.print("\n\t- Ingrese la Cantidad de Terapeutas: ");
                    numeroTerapeutas = entrada.nextInt();

                    RegistroTerapeutas terapeuta[] = new RegistroTerapeutas[numeroTerapeutas];

                    do {
                        System.out.println("\n\t\tBIENVENIDO AL REGISTRO DE PACIENTES");
                        System.out.println("\n\t1. Añadir Terapeuta ");
                        System.out.println("\t2. Eliminar Terapeuta ");
                        System.out.println("\t3. Buscar Terapeuta ");
                        System.out.println("\t4. Listar Terapeutas");
                        System.out.println("\t5. Mostrar Datos de Terapeutas");
                        System.out.println("\t0. Salir");
                        System.out.print("\n\t- Elija una Opción: ");
                        opcion = entrada.nextInt();

                        entrada.nextLine();

                        switch (opcion) {
                            case 0: {
                                System.out.println("\n\t\tMUCHAS GRACIAS, ADIÓS");
                            }
                            break;
                            case 1: {
                                FileWriter escritura2 = new FileWriter(archivo2, true);

                                System.out.println("\n\t\t\tAÑADIR TERAPEUTA");

                                for (int i = 0; i < numeroTerapeutas; i++) {
                                    System.out.println("\n\t\tTERAPEUTA #" + (i + 1));
                                    System.out.print("\n\t- Nombre(s): ");
                                    nombre = entrada.nextLine();
                                    System.out.print("\t- Apellidos: ");
                                    apellidos = entrada.nextLine();
                                    System.out.print("\t- Sexo: ");
                                    sexo = entrada.nextLine();
                                    System.out.print("\t- DNI: ");
                                    DNI = entrada.nextLine();
                                    System.out.print("\t- Especialidad: ");
                                    especialidad = entrada.nextLine();
                                    System.out.print("\t- Horario de entrada: ");
                                    horarioentrada = entrada.nextInt();
                                    System.out.print("\t- Horario de salida: ");
                                    horariosalida = entrada.nextInt();
                                    System.out.print("\t-Código: ");
                                    codigo = entrada.nextLine();

                                    escritura2.write("\n\n\t" + nombre);
                                    escritura2.write("\n\t" + apellidos);
                                    escritura2.write("\n\t" + sexo);
                                    escritura2.write("\n\t" + DNI);
                                    escritura2.write("\n\t" + especialidad);
                                    escritura2.write("\n\t" + horarioentrada);
                                    escritura2.write("\n\t" + horariosalida);

                                    terapeuta[i] = new RegistroTerapeutas(nombre, apellidos, sexo, DNI, especialidad, horarioentrada, horariosalida, codigo);

                                }
                                escritura2.close();
                            }
                            break;
                            case 5: {
                                System.out.println("\n\t\t\tDATOS DE TODOS LOS TERAPEUTAS");
                                String contenido;

                                FileReader lector = new FileReader(archivo2);

                                BufferedReader lectura = new BufferedReader(lector);

                                contenido = lectura.readLine();

                                while (contenido != null) {
                                    System.out.println(contenido);
                                    contenido = lectura.readLine();
                                }
                            }
                            break;
                        }
                    } while (opcion != 0);
                }
            }
        } while(modulo != 0);
    }







}
