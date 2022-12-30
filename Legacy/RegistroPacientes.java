public class RegistroPacientes extends Paciente
{
    private String codigoP;

    public RegistroPacientes(String nombre, String apellido, String sexo, String DNI, String ocupacion, String enfermedad, String codigoP)
    {
        super(nombre, apellido, sexo, DNI, ocupacion, enfermedad);
        this.codigoP = codigoP;
    }

    @Override
    public String mostrarDatos()
    {
        return "\n- Nombre: "+nombre+"\n- Apellidos: "+apellido+"\n- Sexo: "+sexo+"\n- DNI: "+DNI+"\n- Ocupación: "+ocupacion+"\n- Enfermedad: "+enfermedad+"\n- Código: "+codigoP;
    }

    public String getCodigoP()
    {
        return codigoP;
    }
}
