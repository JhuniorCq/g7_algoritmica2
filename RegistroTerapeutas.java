public class RegistroTerapeutas extends Terapeutas
{
    private String codigoT;

    public RegistroTerapeutas(String nombre, String apellido, String sexo, String DNI, String especialidad, int horarioEntrada, int horarioSalida, String codigoT)
    {
        super(nombre, apellido, sexo, DNI, especialidad, horarioEntrada, horarioSalida);
        this.codigoT = codigoT;
    }
    @Override
    public String mostrarDatos()
    {
        return "\n- Nombre: "+nombre+"\n- Apellidos: "+apellido+"\n- Sexo: "+sexo+"\n- DNI: "+DNI+"\n- Especialidad: "+ especialidad+"\n- Horario de Entrada: "+horarioEntrada+"\n- Horario de Salida: "+horarioSalida;
    }
}