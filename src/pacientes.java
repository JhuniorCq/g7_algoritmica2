import java.util.Vector;

public class pacientes {
    private String apellido;
    private String nombre;
    private int dni;
    private String sexo;
    private Vector<cita> citas;

    public pacientes(String apellido, String nombre, int dni,String sexo){
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni= dni;
        this.sexo = sexo;
        this.citas= new Vector<cita>();
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDNI(){
        return dni;
    }
    public void setDNI(int dni) {
        this.dni = dni;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void añadirpaciente(String apellido, String nombre, String sexo, int dni){
    }
    public void eliminarpaciente(int dni){
    }
    public void modificarpaciente(String apellido, String nombre, String sexo, int dni){
    }
    public void buscarpaciente(int dni){
    }
    public void listarpaciente(){

    }

}