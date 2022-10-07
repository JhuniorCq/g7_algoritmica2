import java.util.Date;
import java.util.Vector;

public class cita {
    private String día;
    private Date hora;
    private Vector <terapia> terapias;

    public cita(String día, Date hora, Vector<terapia> terapias) {
        this.día = día;
        this.hora = hora;
        this.terapias =new Vector<terapia>();
    }
    public String getDía(){
        return día;
    }
    public void setDía(String día) {
        this.día = día;
    }
    public Date getHora(){
        return hora;
    }
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public void registrarcita(String día, Date hora,int dni){
    }
    public void modificarcita(String día, Date hora,int dni){
    }
    public void cancelacioncita(String día, Date hora,int dni){
    }
    public void buscarcita(int dni){
    }
    public void listarcita(){
    }
}
