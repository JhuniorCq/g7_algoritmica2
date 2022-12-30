public class Paciente extends Persona
{
    protected String ocupacion;
    protected String enfermedad;

    public Paciente(String nombre, String apellido, String sexo, String DNI, String ocupacion, String enfermedad)
    {
        super(nombre, apellido, sexo, DNI);
        this.ocupacion = ocupacion;
        this.enfermedad = enfermedad;
    }

}