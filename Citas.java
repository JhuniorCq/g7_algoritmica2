import java.util.Vector;

public class Citas
{
    private String día;
    private int hora;
    private Vector <Terapia> terapias;

    private Turno turno;


    public Citas(String día, int hora, Vector <Terapia> terapias, Turno turno)
    {
        this.día = día;
        this.hora = hora;
        this.terapias = new Vector <Terapia>();
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
