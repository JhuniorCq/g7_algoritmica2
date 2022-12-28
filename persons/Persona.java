package person

public abstract class Persona
{
    protected String nombre;
    protected String apellido;
    protected String sexo;
    protected String DNI;
    protected String codigo;

    public Persona(String nombre, String apellido, String sexo, String DNI, String codigo)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.DNI = DNI;
        this.codigo = codigo;
    }

    public String mostrarDatos()
    {
        return "\n- Nombre: "+nombre+"\n- Apellidos: "+apellido+"\n- Sexo: "+sexo+"\n- DNI: "+DNI;
    }
}
