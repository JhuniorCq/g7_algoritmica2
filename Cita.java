import java.util.Vector;
public class Cita
{
    private String día;
    private int hora;
    private Vector <Clases.Terapia> terapias;
    private turno turno;
    public Cita(String día, int hora, Vector <Clases.Terapia> terapias, turno turno)
    {
        this.día = día;
        this.hora = hora;
        this.terapias = new Vector <Clases.Terapia>();
        this.turno = turno;
    }
    public String mostrarDía()
    {
        return "\n- Día: "+día;
    }
    public void setDía(String día)
    {
        this.día = día;
    }
    public String mostrarHora()
    {
        return "\n - Hora: "+hora;
    }
    public void setHora(int hora)
    {
        this.hora = hora;
    }
    //encapsulamiento
    public String getTurno(){
        return turno.getNombre();
    }
    public void registrarcita(String día, int hora)
    {
        //debemos ingresar turno
    }
    public void modificarcita(String día, int hora)
    {
    }
    public void cancelacioncita(String día, int hora, int dni)
    {
    }
    public void buscarcita(int dni)
    {
    }
    public void listarcita()
    {
    }
}