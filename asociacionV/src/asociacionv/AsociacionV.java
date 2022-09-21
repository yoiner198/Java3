/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacionv;

import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Universidad;

/**
 *
 * @author SALAS
 */
public class AsociacionV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Estudiante> lista = new ArrayList();
        Estudiante a = new Estudiante("Pepe",20,"Ing Sistemas");
        lista.add(a);
        Estudiante b = new Estudiante("Juan",30,"Ing Electronica");
        lista.add(b);
        Estudiante c = new Estudiante("Si",23,"Ing Ambiental");
        lista.add(c);
        
        Universidad upc = new Universidad("Unicesar","Valledupár");
        upc.setEstudianteInsc(lista);
        
        System.out.println(upc);
        System.out.println("------------------");
        
                
       
        
    }
    
}
