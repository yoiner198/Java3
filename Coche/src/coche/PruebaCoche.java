
package coche;


/**
 *
 * @author Yoiner
 */
public class PruebaCoche {
    public static void main(String[] args) {
        Coche m = new Coche();
        m.setColor("Rojo");
        m.setCaballos(98);
        m.setMarca("Chevrolet");
        m.setModelo(2000);
        m.setMatricula("MVF5");
        m.setPuertas(6);
        
        
        System.out.println(m.mostrarInfo());
    
    
    }

    
    
}
