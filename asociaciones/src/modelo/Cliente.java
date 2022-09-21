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
public class Cliente {
    private String nombre;
    private String apellido;
    private String id;
    
    private Cuenta cuentaRegistrada;

    public Cliente(String nombre, String apellido, String id, Cuenta cuentaRegistrada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentaRegistrada = cuentaRegistrada;
    }

    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }

    public Cuenta getCuentaRegistrada() {
        return cuentaRegistrada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCuentaRegistrada(Cuenta cuentaRegistrada) {
        this.cuentaRegistrada = cuentaRegistrada;
    }

    @Override
    public String toString() {
        return "\nCliente{" + "\nnombre=" + nombre + ", \napellido=" + apellido + ", \nid=" + id + ", \ncuentaRegistrada=" + cuentaRegistrada + '}';
    }
    
    
}
