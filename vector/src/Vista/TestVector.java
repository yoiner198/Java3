/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Vector3D;

/**
 *
 * @author SALAS
 */
public class TestVector {

    public static void main(String[] args) {
        Vector3D ra = new Vector3D(1,2,3);
        
        
        System.out.println(ra.getVector());
        
        //Vector3D s = new Vector3D();
        
        //System.out.println(s.getVector());
        
        System.out.println("La suma es: "+ra.sumVector());
        
        System.out.println("El modulo es: "+ra.moduleVector());
        
        System.out.println(ra.scalarMultiplication(2));
        
    }
    
}
