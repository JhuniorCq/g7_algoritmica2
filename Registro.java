import Archivos.txtConfig;
import Clases.Paciente;
import Clases.Terapeuta;
import Procesos.configuracionReg;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                            FileReader lectora = null;
                            String buscado;
                            System.out.println("Ingresa el apellido a buscar: ");
                            buscado= entrada2.nextLine();
                            try {
                                lectora = new FileReader(archivo);
                                String nameNumberString;
                                RandomAccessFile pacien = new RandomAccessFile(archivo, "r");
                                while (pacien.getFilePointer() < pacien.length()) {
                                    nameNumberString = pacien.readLine();
                                    String[] lineSplit = nameNumberString.split("-");
                                    String nombre1 = lineSplit[0];
                                    String apellido1 = lineSplit[1];
                                    String sexo1 = lineSplit[2];
                                    int dni1 = Integer. parseInt(lineSplit[3]);
                                    String ocupacion1 = lineSplit[4];
                                    String enfermedad1=lineSplit[5];
                                    int codigo1 = Integer. parseInt(lineSplit[6]);
                                    if (apellido1.equals(buscado)) {
                                        System.out.println("Datos del paciente");
                                        System.out.println("Nombre: "+ nombre1);
                                        System.out.println("Apellido: "+apellido1);
                                        System.out.println("Sexo: "+sexo1);
                                        System.out.println("DNI: "+dni1);
                                        System.out.println("Ocupación: "+ocupacion1);
                                        System.out.println("Enfermedad: "+enfermedad1);
                                        System.out.println("codigo: "+codigo1);
                                    }
                                    if(pacien.getFilePointer() == pacien.length()&& !apellido1.equals(buscado)){
                                        System.out.println("Paciente no encontrado!");
                                    }}
                            }catch (FileNotFoundException ex){
                                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE,null, ex);
                            }catch (IOException ex){
                                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            finally {
                                lectora.close();;
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
                                FileWriter escritura2 = new FileWriter(archivo2, true);
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
                                    System.out.println("\n\t\t\tEliminar Paciente");
                                    System.out.println("\tIngresa el codigo: ");
                                    int buscado;
                                    Scanner e = new Scanner(System.in);
                                    buscado = e.nextInt();
                                    configR.borrarTerapeuta(buscado);
                                break;
                            case 3:
                                FileReader lectora = null;
                                String buscados;
                                System.out.println("Ingresa el apellido a buscar: ");
                                buscados= entrada2.nextLine();
                                try {
                                    lectora = new FileReader(archivo2);
                                    String nameNumberString;
                                    RandomAccessFile terap = new RandomAccessFile(archivo2, "r");
                                    while (terap.getFilePointer() < terap.length()) {
                                        nameNumberString = terap.readLine();
                                        String[] lineSplit = nameNumberString.split("-");
                                        String nombre1 = lineSplit[0];
                                        String apellido1 = lineSplit[1];
                                        String sexo1 = lineSplit[2];
                                        int dni1 = Integer. parseInt(lineSplit[3]);
                                        String especialidad1 = lineSplit[4];
                                        int horarioentrada1=Integer. parseInt(lineSplit[5]);
                                        int horariosalida1=Integer. parseInt(lineSplit[6]);
                                        int codigo1 = Integer. parseInt(lineSplit[7]);
                                        if (apellido1.equals(buscados)) {
                                            System.out.println("Datos del paciente");
                                            System.out.println("Nombre: "+ nombre1);
                                            System.out.println("Apellido: "+apellido1);
                                            System.out.println("Sexo: "+sexo1);
                                            System.out.println("DNI: "+dni1);
                                            System.out.println("Especialidad: "+especialidad1);
                                            System.out.println("Horario entrada: "+horarioentrada1);
                                            System.out.println("Horario salida: "+horariosalida1);
                                            System.out.println("codigo: "+codigo1);
                                        }
                                        if (terap.getFilePointer() == terap.length() && !apellido1.equals(buscados)){
                                            System.out.println("Terapeuta no encontrado!");
                                        }}
                                }catch (FileNotFoundException ex){
                                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE,null, ex);
                                }catch (IOException ex){
                                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                finally {
                                    lectora.close();;
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
        } while (modulo != 0);
    }
}
