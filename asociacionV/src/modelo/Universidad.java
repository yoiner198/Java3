/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author SALAS
 */
public class Universidad {
    private String nombre;
    private String ciudad;
    
    private ArrayList<Estudiante> estudianteInsc;

    public Universidad(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estudianteInsc = new ArrayList();
    }

    public Universidad(String nombre, String ciudad, ArrayList<Estudiante> estudianteInsc) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estudianteInsc = estudianteInsc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public ArrayList<Estudiante> getEstudianteInsc() {
        return estudianteInsc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEstudianteInsc(ArrayList<Estudiante> estudianteInsc) {
        this.estudianteInsc = estudianteInsc;
    }

    @Override
    public String toString() {
        String infoEstudiantes = "";
        for(Estudiante e: this.estudianteInsc){
            infoEstudiantes = infoEstudiantes +"\n"+e.toString();
        }
        return "Universidad{" 
                + "\nnombre=" + nombre 
                + ", \nciudad=" + ciudad 
                + ", \nestudianteInsc = " + infoEstudiantes 
                + '}';
    }
    
    
    
    
    
}
