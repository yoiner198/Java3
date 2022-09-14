package cuenta;

import java.util.Scanner;

public class Cuenta {
    private int noCuenta, des;
    private String nombreCliente;
    private double saldo, monto;
    Scanner w = new Scanner(System.in);
    
    public Cuenta(){
        this.noCuenta=0;
        this.nombreCliente="John";
        this.saldo=0.0;
        
    }
    
    public void setNoCuenta(int noCuenta){
        this.noCuenta = noCuenta;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public int getNocuenta(){
        return this.noCuenta;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public int dDedes(){
        System.out.println("Para consignar presione 1       Para retirar presione 2");
        des=w.nextInt();
        if(des==1){
           Consignar();
        }
        else if(des==2){
            Retirar();
        }
        return 0;
    }
    public boolean Consignar(){
        System.out.println("Cuanto desea consignar... ");
        monto=w.nextDouble();
        saldo=saldo+monto;
        System.out.println("Su nuevo saldo es: "+saldo);
        return true;
    }
    public boolean Retirar(){
        System.out.println("Cuanto desea retirar... ");
        monto=w.nextDouble();
        saldo=saldo-monto;
        System.out.println("Su nuevo saldo es: "+saldo);
        return true; 
    }
    
    
}
