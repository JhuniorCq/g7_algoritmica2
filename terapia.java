/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package terapia;

import java.util.Scanner;  
public class terapia {
    int NombreTerapia;
    int CodigoTerapeuta;
    int Duracion; 
    /**
     * @param args the command line arguments
     */
    
   public static void main(String[] args)
    { int i=0;
      terapia t=new terapia();
      while( i==0){
      int e;
      
        System.out.println("Revisar Terapeuta");
        System.out.println("0. Salir");
        System.out.println("1. Establecer Terapeuta");
        System.out.println("2. Mostrar Terapeuta");
        do{Scanner x=new Scanner(System.in);
           e=x.nextInt();} while(e>=3 || e<=0);
      if(e==0){i++;1}  
      if(e==1){t.setCodigoTerapeuta();}
      if(e==2){t.getCodigoTerapeuta();}
    }
    }
    public void setCodigoTerapeuta()
    {
        System.out.println("Ingrese el código del terapeuta");
        
        Scanner entrada=new Scanner(System.in);
       
        this.CodigoTerapeuta = entrada.nextInt();
        
    }
    public void getCodigoTerapeuta()
    {
        System.out.println(this.CodigoTerapeuta);   
    }
    
}
 