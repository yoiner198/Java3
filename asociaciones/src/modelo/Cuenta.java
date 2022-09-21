package modelo;

import java.util.Date;

public class Cuenta {
    private double saldo;
    private double limite;
    private Date fechaApertura;
    
    private Cliente titular;

    public Cuenta(double saldo, double limite, Date fechaApertura, Cliente titular) {
        this.saldo = saldo;
        this.limite = limite;
        this.fechaApertura = fechaApertura;
        this.titular = titular;
    }

    public Cuenta(double saldo, double limite, Date fechaApertura) {
        this.saldo = saldo;
        this.limite = limite;
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "\nCuenta{" + "\nsaldo=" + saldo + ", \nlimite=" + limite + ", \nfechaApertura=" + fechaApertura + ", \ntitular=" + titular + '}';
    }
    
    
    
}
