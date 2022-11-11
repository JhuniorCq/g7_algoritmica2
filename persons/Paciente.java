package person

public class Paciente extends Persona
{
    protected String ocupacion;
    protected String enfermedad;

    public Paciente(String nombre, String apellido, String sexo, String DNI, String ocupacion, String enfermedad, String codigo)
    {
        super(nombre, apellido, sexo, DNI, codigo);
        this.ocupacion = ocupacion;
        this.enfermedad = enfermedad;
    }

}
