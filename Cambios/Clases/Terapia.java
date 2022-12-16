package Clases;

import java.util.Vector;

public class Terapia {
    private String nombre_terapia;
    private int sesiones;
    private Vector<Terapeuta> terapeuta;

    //MÉTODO CONSTRUCTOR
    public Terapia(String nombre_terapia, int sesiones)
    {
        this.nombre_terapia = nombre_terapia;
        this.sesiones = sesiones;
        this.terapeuta = new Vector<Terapeuta>();
    }

    //GETTERS

    public String getNombre_terapia()
    {
        return nombre_terapia;
    }

    public int getSesiones()
    {
        return sesiones;
    }

}