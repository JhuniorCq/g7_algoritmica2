import java.util.Vector;
public class terapia
{
    //PROPIEDADES
    private String nombre_terapia;
    private int sesiones;
    private Vector<Terapeutas> var_terapeuta;

    //MÉTODO CONSTRUCTOR
    public terapia(String nombre_terapia, int sesiones)
    {
        this.nombre_terapia = nombre_terapia;
        this.sesiones = sesiones;
        this.var_terapeuta = new Vector<Terapeutas>();
    }

    //SETTERS Y GETTERS
    public void setNombre_terapia(String nombre_terapia)
    {
        this.nombre_terapia = nombre_terapia;
    }
    public String getNombre_terapia()
    {
        return nombre_terapia;
    }
    public void setSesiones(int sesiones)
    {
        this.sesiones = sesiones;
    }
    public int getSesiones()
    {
        return sesiones;
    }

    //MÉTODOS
    public void añadir_terapia(String nombre_terapia, int sesiones)
    {

    }
    public void eliminar_terapia(String nombre_terapia)
    {

    }
    public void modificar_terapia(String nombre_terapia, int sesiones)
    {

    }
    public void buscar_terapia(String nombre_terapia)
    {

    }
    public void listar_terapia()
    {

    }
}
