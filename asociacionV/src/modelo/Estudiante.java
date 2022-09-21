/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author SALAS
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String programa;

    public Estudiante(String nombre, int edad, String programa) {
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return "Estudiante{" 
                + "nombre=" + nombre 
                + ", edad=" + edad 
                + ", programa=" + programa + '}';
    }
    
    
}
