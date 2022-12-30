package Clases;

public class Terapeuta extends Persona {
    protected String especialidad;
    protected int horarioEntrada;
    protected int horarioSalida;

    public Terapeuta(String nombre, String apellido, String sexo, int DNI, int codigo, String especialidad, int horarioEntrada, int horarioSalida) {
        super(nombre, apellido, sexo, DNI, codigo);
        this.especialidad = especialidad;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
    }

    @Override
    public String mostrarDatos() {
        return "\n- Nombre: " + nombre + "\n- Apellidos: " + apellido + "\n- Sexo: " + sexo + "\n- DNI: " +
                DNI + "\n- Especialidad: " + especialidad + "\n- Horario de Entrada: " + horarioEntrada +
                "\n- Horario de Salida: " + horarioSalida;
    }
    public static void menu_terapeuta() {
        System.out.println("\n\t\tBIENVENIDO AL REGISTRO DE TERAPEUTAS");
        System.out.println("\n\t1. Añadir Terapeuta ");
        System.out.println("\t2. Eliminar Terapeuta ");
        System.out.println("\t3. Buscar Terapeuta ");
        System.out.println("\t4. Listar Clases.Terapeutas");
        System.out.println("\t5. Mostrar Datos de Clases.Terapeutas");
        System.out.println("\t0. Salir");
        System.out.print("\n\t- Elija una Opción: ");

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getHorarioEntrada() {
        return horarioEntrada;
    }

    public int getHorarioSalida() {
        return horarioSalida;
    }
}
