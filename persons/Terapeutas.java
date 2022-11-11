package person

public class Terapeuta extends Persona
{
    protected String especialidad;
    protected int horarioEntrada;
    protected int horarioSalida;

    public Terapeuta(String nombre, String apellido, String sexo, String DNI, String especialidad, int horarioEntrada, int horarioSalida, String codigo)
    {
        super(nombre, apellido, sexo, DNI, codigo);
        this.especialidad = especialidad;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
    }

}
