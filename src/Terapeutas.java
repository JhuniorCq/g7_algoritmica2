import javax.swing.*;
import java.util.Scanner;

public class Terapeutas {
    //Declaración de atributos o propiedades
    private String apellido;
    private String nombre;
    private String sexo;
    private int codigo;

    //Definición de constructores
    public Terapeutas(String apellido, String nombre, String sexo, int codigo){
    this.apellido = apellido;
    this.nombre = nombre;
    this.sexo = sexo;
    this.codigo = codigo;
    }
    //Creando getters and setters

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
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //Procedimientos
    public void añadirterapeuta(String apellido, String nombre, String sexo, int codigo){
        //Definición de procedimientos para la creación de un terapeuta
    }
    public void eliminarterapeuta(int codigo){
        //Definición de procedimientos para la eliminación de un terapeuta
    }
    public void modificarterapeuta(String apellido, String nombre, String sexo, int codigo){
        //Definición de procedimientos para la modificación de los datos de un terapeuta
    }
    public void buscarterapeuta(int codigo){
        //Definición de procedimientos para la busqueda de un terapeuta por su código
    }
    public void listarterapeuta(){
        //Definición de procedimientos para la listado de los terapeuta
    }

}
