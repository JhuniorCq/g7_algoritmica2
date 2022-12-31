import Archivos.txtConfig;
import Clases.Paciente;
import Clases.Terapeuta;
import Procesos.configuracionReg;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Registro {
    public static void menu_general() {
        System.out.println("\n\t\tBIENVENIDO AL SISTEMA DEL CENTRO DE REFLEXOLOGÍA");
        System.out.println("\n\t1. Módulo Pacientes ");
        System.out.println("\t2. Módulo Clases.Terapeutas ");
        System.out.println("\t0. Salir");
        System.out.print("\n\t- Elija una Opción: ");
    }
    public static void main(String[] args) throws IOException {
        configuracionReg configR = new configuracionReg();
        txtConfig tconfig = new txtConfig();
        tconfig.leerTxt(configR);
        int numeroPacientes;
        int numeroTerapeutas;
        int opcion;
        String nombre;
        String apellidos;
        String sexo;
        int DNI;
        String ocupacion;
        String enfermedad;
        int codigo;
        String especialidad;
        int horarioentrada, horariosalida;
        File archivo;
        File archivo2;
        int contador=0;
        int modulo;
        archivo = new File("Data/Lista de Pacientes.txt");
        archivo2 = new File("Data/Lista de Terapeutas.txt");
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        do {
            tconfig.guardarTxt(configR);
            menu_general();
            modulo = entrada.nextInt();
            entrada.nextLine();
            switch (modulo) {
                case 1: {
                    Clases.Paciente.menu_paciente();
                    opcion = entrada.nextInt();
                    switch (opcion) {
                        case 0: {
                            System.out.println("\n\t\tMUCHAS GRACIAS, ADIÓS");
                        }
                        break;
                        case 1: {
                            System.out.println("\n\t\t\tAÑADIR PACIENTE");
                            System.out.println("\n\t\t\t¿Desea Añadir Varios pacientes a la vez? S/N");
                            char op = entrada2.nextLine().charAt(0);
                            if (op == 'S') {
                                System.out.print("\n\t- Ingrese la Cantidad de Pacientes: ");
                                numeroPacientes = entrada.nextInt();
                            } else numeroPacientes = 1;
                            for (int i = 0; i < numeroPacientes; i++) {
                                System.out.println("\n\t\tPaciente #" + (i + 1));
                                System.out.print("\n\t- Nombre(s): ");
                                nombre = entrada2.nextLine();
                                System.out.print("\t- Apellidos: ");
                                apellidos = entrada2.nextLine();
                                System.out.print("\t- Sexo: ");
                                sexo = entrada2.nextLine();
                                System.out.print("\t- DNI: ");
                                DNI = entrada.nextInt();
                                System.out.print("\t- Ocupacion: ");
                                ocupacion = entrada2.nextLine();
                                System.out.print("\t- Enfermedad: ");
                                enfermedad = entrada2.nextLine();
                                System.out.print("\t-Código: ");
                                codigo = entrada.nextInt();
                                Paciente p = new Paciente(nombre, apellidos, sexo, DNI, codigo, ocupacion, enfermedad);
                                configR.crearPaciente(p);
                            }
                        }
                        break;
                        case 2: {
                            System.out.println("\n\t\t\tEliminar Paciente");
                            System.out.println("\tIngresa el codigo: ");
                            int buscador;
                            Scanner e = new Scanner(System.in);
                            buscador = e.nextInt();
                            configR.borrarPaciente(buscador);
                            break;
                        }
                        case 3:
                            String buscado;
                            System.out.println("Ingresa el apellido a buscar: ");
                            buscado= entrada2.nextLine();
                            configR.buscarPac(buscado);
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
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    do {
                        Clases.Terapeuta.menu_terapeuta();
                        opcion = entrada.nextInt();
                        entrada.nextLine();
                        switch (opcion) {
                            case 0: {
                                System.out.println("\n\t\tMUCHAS GRACIAS, ADIÓS");
                            }
                            break;
                            case 1: {
                                System.out.print("\n\t- Ingrese la Cantidad de Terapeutas: ");
                                System.out.println("\n\t\t\t¿Desea Añadir Varios Terapuetas a la vez? S/N");
                                char op = entrada2.nextLine().charAt(0);
                                if (op == 'S') {
                                    System.out.print("\n\t- Ingrese la Cantidad de Pacientes: ");
                                    numeroTerapeutas = entrada.nextInt();
                                } else numeroTerapeutas = 1;
                                for (int i = 0; i < numeroTerapeutas; i++) {
                                    System.out.println("\n\t\tTERAPEUTA #" + (i + 1));
                                    System.out.print("\n\t- Nombre(s): ");
                                    nombre = entrada2.nextLine();
                                    System.out.print("\t- Apellidos: ");
                                    apellidos = entrada2.nextLine();
                                    System.out.print("\t- Sexo: ");
                                    sexo = entrada2.nextLine();
                                    System.out.print("\t- DNI: ");
                                    DNI = entrada.nextInt();
                                    System.out.print("\t- Especialidad: ");
                                    especialidad = entrada2.nextLine();
                                    System.out.print("\t- Horario de entrada: ");
                                    horarioentrada = entrada2.nextInt();
                                    System.out.print("\t- Horario de salida: ");
                                    horariosalida = entrada2.nextInt();
                                    System.out.print("\t-Código: ");
                                    codigo = entrada.nextInt();
                                    Terapeuta t = new Terapeuta(nombre, apellidos,sexo,DNI,codigo,especialidad,horarioentrada,horariosalida);
                                    configR.crearTerapeuta(t);
                                }
                            }
                            break;
                            case 2:
                                    System.out.println("\n\t\t\tEliminar Terapeuta");
                                    System.out.println("\tIngresa el codigo: ");
                                    int buscado;
                                    Scanner e = new Scanner(System.in);
                                    buscado = e.nextInt();
                                    configR.borrarTerapeuta(buscado);
                                break;
                            case 3:
                                String buscador;
                                System.out.println("Ingresa el apellido a buscar: ");
                                buscador= entrada2.nextLine();
                                configR.buscarTer(buscador);
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
        } while (modulo != 0);
    }
}
