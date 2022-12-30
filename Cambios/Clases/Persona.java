package Clases;
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String sexo;
    protected int DNI;
    protected int codigo;

    public Persona(String nombre, String apellido, String sexo, int DNI, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.DNI = DNI;
        this.codigo = codigo;
    }

    public String mostrarDatos()
    {
        return "\n- Nombre: "+nombre+"\n- Apellidos: "+apellido+"\n- Sexo: "+sexo+"\n- DNI: "+DNI+"\n- Codigo: "+codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
