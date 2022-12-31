package Clases;

import java.util.Vector;
public class Cita
{
    private String dia;
    private int hora;
    private Terapia terapias;
    private Turno turno;
    public Cita(String dia, int hora, Terapia terapias, Turno turno)
    {
        this.dia = dia;
        this.hora = hora;
        this.terapias = terapias;
        this.turno = turno;
    }
    public String mostrarDia()
    {
        return "\n- Día: "+dia;
    }
    public void setDia(String dia)
    {
        this.dia = dia;
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
    public void registrarcita(String dia, int hora)
    {
        //debemos ingresar turno
    }
    public void modificarcita(String dia, int hora)
    {
    }
    public void cancelacioncita(String dia, int hora, int dni)
    {
    }
    public void buscarcita(int dni)
    {
    }
    public void listarcita()
    {
    }
    public Terapia getTerapias() {
        return terapias;
    }
}