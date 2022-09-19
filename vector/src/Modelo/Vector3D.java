package Modelo;
    
import java.util.Scanner;


public class Vector3D {
    private double x, y, z, xx, yy, zz;
    Scanner r = new Scanner(System.in);
    //metodo constructor
    
    public Vector3D(){
        
        this.x = x;
        this.y = x;
        this.z = x;
        
    }
    //metodo constructor sobrecargado
    
    public Vector3D(double x, double y, double z) {
        this.x=x;
        this.y=y;
        this.z=z;
        
    }
    

    
    //metodo setter

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setZ(double z){
        this.z = z;
    }

    //metodo getter
    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getZ(){
        return this.z;
    }
    
    //metodos ad
    
    public String getVector(){
        return "Vector: "+x+", "+y+", "+z;
    }
 
    public String sumVector(){
        /*System.out.println("Ingrese valor de x: ");
        xx=r.nextDouble();
        System.out.println("Ingrese valor de y: ");
        yy=r.nextDouble();
        System.out.println("Ingrese valor de z: ");
        zz=r.nextDouble();*/
        return (x+this.x)+", "+(y+this.y)+", "+(z+this.z);  
    } 

    public double moduleVector(){
        return (Math.sqrt(Math.pow(2,(x+xx))+Math.pow(2,(y+yy))+Math.pow(2,(z))));
    }
    
    public String scalarMultiplication(int sc){
        System.out.println("Ingrese un número entero: ");
        sc=r.nextInt();
        
        return (sc*(x+xx))+", "+(sc*(y+yy))+", "+(sc*(z+zz));
    }
}
