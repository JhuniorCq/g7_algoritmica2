package Archivos;

import Clases.Paciente;
import Clases.Registro;
import Clases.Terapeuta;
import Procesos.configuracionReg;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class txtConfig {
    private String txtPac;
    private String txtTera;

    public txtConfig() {
        this.txtPac = "Data/Lista de Pacientes.txt";
        this.txtTera = "Data/Lista de Terapeutas.txt";
    }
    public void leerTxt(configuracionReg config){
        try {
            FileReader lectPac = new FileReader(txtPac);
            FileReader lectTera = new FileReader(txtTera);
            leerPac(lectPac,config);
            leerTera(lectTera,config);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void guardarTxt(configuracionReg config){
        try{
            FileWriter guardaPac = new FileWriter(this.txtPac);
            FileWriter guardaTera = new FileWriter(this.txtTera);
            config.PacATxt(guardaPac);
            config.TerATxt(guardaTera);
            guardaPac.flush();
            guardaTera.flush();
        } catch(IOException e){
            System.out.println("Exception" + e);
            e.printStackTrace();
        }
        System.out.println("Configuracion guardada");
    }
    public void leerPac(FileReader f, configuracionReg config)throws IOException{
        try {
            String nameNumberString;
            RandomAccessFile pacien = new RandomAccessFile(txtPac, "r");
            while (pacien.getFilePointer() < pacien.length()) {
                nameNumberString = pacien.readLine();
                String[] lineSplit = nameNumberString.split("-");
                String nombre = lineSplit[0];
                String apellido = lineSplit[1];
                String sexo = lineSplit[2];
                int dni = Integer. parseInt(lineSplit[3]);
                String ocupacion = lineSplit[4];
                String enfermedad=lineSplit[5];
                int codigo = Integer. parseInt(lineSplit[6]);
                Paciente p = new Paciente(nombre,apellido,sexo,dni,codigo,ocupacion,enfermedad);
                config.crearPaciente(p);
            }
        } catch (IOException ex){
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE,null, ex);
        } finally {
            f.close();
        }
    }
    public void leerTera(FileReader f, configuracionReg config) throws IOException {
        try {
            String nameNumberString;
            RandomAccessFile terap = new RandomAccessFile(txtTera, "r");
            while (terap.getFilePointer() < terap.length()) {
                nameNumberString = terap.readLine();
                String[] lineSplit = nameNumberString.split("-");
                String nombre = lineSplit[0];
                String apellido = lineSplit[1];
                String sexo = lineSplit[2];
                int dni = Integer.parseInt(lineSplit[3]);
                String especialidad = lineSplit[4];
                int horarioentrada = Integer.parseInt(lineSplit[5]);
                int horariosalida = Integer.parseInt(lineSplit[6]);
                int codigo = Integer.parseInt(lineSplit[7]);
                Terapeuta t = new Terapeuta(nombre,apellido,sexo,dni,codigo,especialidad,horarioentrada,horariosalida);
                config.crearTerapeuta(t);
            }
        }catch (FileNotFoundException ex){
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE,null, ex);
        }catch (IOException ex){
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
           f.close();
        }
    }
}
