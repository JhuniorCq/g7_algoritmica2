package Clases;
public class Paciente extends Persona {
    protected String ocupacion;
    protected String enfermedad;

    public Paciente(String nombre, String apellido, String sexo, int DNI, int codigo, String ocupacion, String enfermedad) {
        super(nombre, apellido, sexo, DNI, codigo);
        this.ocupacion = ocupacion;
        this.enfermedad = enfermedad;
    }

    @Override
    public String mostrarDatos()
    {
        return "\n- Nombre: "+nombre+"\n- Apellidos: "+apellido+"\n- Sexo: "+sexo+"\n- DNI: "+DNI+
                "\n- Código:" +codigo+"\n- Ocupación: "+ocupacion+"\n- Enfermedad: "+enfermedad;
    }
    public static void menu_paciente() {
        System.out.println("\n\t\tBIENVENIDO AL REGISTRO DE PACIENTES");
        System.out.println("\n\t1. Añadir Clases.Paciente ");
        System.out.println("\t2. Eliminar Clases.Paciente ");
        System.out.println("\t3. Buscar Clases.Paciente ");
        System.out.println("\t4. Listar Clases.Paciente");
        System.out.println("\t5. Mostrar Datos de Pacientes");
        System.out.println("\t0. Salir");
        System.out.print("\n\t- Elija una Opción: ");
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getEnfermedad() {
        return enfermedad;
    }
}
