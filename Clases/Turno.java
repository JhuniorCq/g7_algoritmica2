package Clases;

public class Turno {
    public String nombre;
    public String codigo;

    public Turno(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }


}

