public class Terapeutas extends Persona
{
    protected String especialidad;
    protected int horarioEntrada;
    protected int horarioSalida;

    public Terapeutas(String nombre, String apellido, String sexo, String DNI, String especialidad, int horarioEntrada, int horarioSalida)
    {
        super(nombre, apellido, sexo, DNI);
        this.especialidad = especialidad;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
    }

}