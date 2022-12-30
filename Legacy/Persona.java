public abstract class Persona
{
    protected String nombre;
    protected String apellido;
    protected String sexo;
    protected String DNI;

    public Persona(String nombre, String apellido, String sexo, String DNI)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.DNI = DNI;
    }

    public String mostrarDatos()
    {
        return "\n- Nombre: "+nombre+"\n- Apellidos: "+apellido+"\n- Sexo: "+sexo+"\n- DNI: "+DNI;
    }
}
