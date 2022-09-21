/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejAsociaciones;

import java.util.Date;
import modelo.Cliente;
import modelo.Cuenta;

/**
 *
 * @author SALAS
 */
public class Asociaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(0,0, new Date());
        Cliente cliente1 = new Cliente("Yoiner", "Juas","AD56", new Cuenta(0,0, new Date()));
        
        System.out.printf(cuenta.toString());
        System.out.printf(cliente1.toString());
        
// TODO code application logic here
    }
    
}
