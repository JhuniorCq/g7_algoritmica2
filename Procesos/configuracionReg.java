package Procesos;

import Clases.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class configuracionReg {
    private Vector<Paciente> pacientes;
    private Vector<Terapeuta> terapeutas;
    private Vector<Cita> citas;

    public configuracionReg() {
        this.pacientes = new Vector<Paciente>();
        this.terapeutas = new Vector<Terapeuta>();
        this.citas = new Vector<Cita>();
    }

    public Vector<Paciente> getPacientes() {
        return pacientes;
    }

    public Vector<Terapeuta> getTerapeutas() {
        return terapeutas;
    }

    public Vector<Cita> getCitas() {
        return citas;
    }

    public int crearPaciente(Paciente pac) {
        Enumeration<Paciente> enumPac = this.pacientes.elements();
        while (enumPac.hasMoreElements()) {
            Paciente p = enumPac.nextElement();
            if (pac.getDNI() == p.getDNI()) {
                return 1;
            }
        }
        this.pacientes.add((Paciente) pac);
        return 0;
    }

    public void borrarPaciente(int buscado) {
        int i;
        for (i = 0; i < getPacientes().size(); i++) {
            Paciente p = getPacientes().get(i);
            if (buscado == p.getCodigo()) {
                System.out.println("Esta Seguro que desea eliminar este Paciente S/N");
                Scanner s = new Scanner(System.in);
                char op = s.nextLine().charAt(0);
                System.out.println(p);
                if (op == 'S') getPacientes().remove(p);
                else System.out.println("Regresando al menu anterior");
            }
        }
    }

    public void borrarTerapeuta(int buscado) {
        int i;
        for (i = 0; i < getTerapeutas().size(); i++) {
            Terapeuta t = getTerapeutas().get(i);
            if (buscado == t.getCodigo()) {
                System.out.println("Esta Seguro que desea eliminar este Terapeuta S/N");
                Scanner s = new Scanner(System.in);
                char op = s.nextLine().charAt(0);
                System.out.println(t);
                if (op == 'S') getTerapeutas().remove(t);
                else System.out.println("Regresando al menu anterior");
            }
        }
    }

    public int crearTerapeuta(Terapeuta tera) {
        Enumeration<Terapeuta> enuTera = this.terapeutas.elements();
        while (enuTera.hasMoreElements()) {
            Terapeuta t = enuTera.nextElement();
            if (tera.getDNI() == t.getDNI()) {
                return 1;
            }
        }
        this.terapeutas.add((Terapeuta) tera);
        return 0;
    }

    public void PacATxt(FileWriter escritura) throws IOException {
        Enumeration<Paciente> enumPac = this.pacientes.elements();
        while (enumPac.hasMoreElements()) {
            Paciente p = enumPac.nextElement();
            String nombre = p.getNombre();
            String apellidos = p.getApellido();
            String sexo = p.getSexo();
            int DNI = p.getDNI();
            String ocupacion = p.getOcupacion();
            String enfermedad = p.getEnfermedad();
            int codigo = p.getCodigo();
            escritura.write("" + nombre);
            escritura.write("-" + apellidos);
            escritura.write("-" + sexo);
            escritura.write("-" + DNI);
            escritura.write("-" + ocupacion);
            escritura.write("-" + enfermedad);
            escritura.write("-" + codigo);
            escritura.write("\n");
        }
    }

    public void TerATxt(FileWriter escritura) throws IOException {
        Enumeration<Terapeuta> enuTera = this.terapeutas.elements();
        while (enuTera.hasMoreElements()) {
            Terapeuta t = enuTera.nextElement();
            String nombre = t.getNombre();
            String apellidos = t.getApellido();
            String sexo = t.getSexo();
            int DNI = t.getDNI();
            String especialidad = t.getEspecialidad();
            int horarioEntrada = t.getHorarioEntrada();
            int horarioSalida = t.getHorarioSalida();
            int codigo = t.getCodigo();
            escritura.write("" + nombre);
            escritura.write("-" + apellidos);
            escritura.write("-" + sexo);
            escritura.write("-" + DNI);
            escritura.write("-" + especialidad);
            escritura.write("-" + horarioEntrada);
            escritura.write("-" + horarioSalida);
            escritura.write("-" + codigo);
            escritura.write("\n");
        }
    }

    public Paciente buscarPac(String busca) {
        int i;
        for (i = 0; i < getPacientes().size(); i++) {
            Paciente p = getPacientes().get(i);
            if (busca.equals(p.getApellido())) {
                System.out.println(p.mostrarDatos());
                return p;
            }
        }
        System.out.println("Paciente no encotrado!");
        return null;
    }

    public Terapeuta buscarTer(String busca) {
        int i;
        for (i = 0; i < getTerapeutas().size(); i++) {
            Terapeuta t = getTerapeutas().get(i);
            if (busca.equals(t.getApellido())) {
                System.out.println(t.mostrarDatos());
                return t;
            }
        }
        System.out.println("Terapeuta no encotrado!");
        return  null;
    }
    public void crearCita(Cita cita, Terapeuta t, Paciente p) throws IOException{
        this.citas.add((Cita) cita);
        FileWriter escritura = new FileWriter("Data/Citas.txt");
        String nombreT = t.getNombre();
        String apellidosT = t.getApellido();
        String nombreP = p.getNombre();
        String apellidosP = p.getApellido();
        String turno = cita.getTurno();
        String hora = cita.mostrarHora();
        String tipTerapia = cita.getTerapias().getNombre_terapia();
        int numSes = cita.getTerapias().getSesiones();
        escritura.write("" + nombreT);
        escritura.write("-" + apellidosT);
        escritura.write("-" + nombreP);
        escritura.write("-" + apellidosP);
        escritura.write("-" + turno);
        escritura.write("-" + hora);
        escritura.write("-" + tipTerapia);
        escritura.write("-" + numSes);
        escritura.write("\n");
        escritura.close();
    }
}
