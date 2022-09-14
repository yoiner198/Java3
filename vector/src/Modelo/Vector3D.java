package Modelo;
    
import java.util.Scanner;


public class Vector3D {
    private int x, y, z, xx, yy, zz;
    Scanner r = new Scanner(System.in);
    //metodo constructor
    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        
    }
    //metodo constructor sobrecargado
    public Vector3D(){
        System.out.println("Ingrese valor de x: ");
        x=r.nextInt();
        System.out.println("Ingrese valor de y: ");
        y=r.nextInt();
        System.out.println("Ingrese valor de z: ");
        z=r.nextInt();
    }
    
    //metodo setter

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setZ(int z){
        this.z = z;
    }

    //metodo getter
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getZ(){
        return this.z;
    }
    
    //metodos ad
    
    public String getVector(){
        return "Vector: "+x+", "+y+", "+z;
    }
 
    public int sumVector(){
        System.out.println("Ingrese valor de x: ");
        xx=r.nextInt();
        System.out.println("Ingrese valor de y: ");
        yy=r.nextInt();
        System.out.println("Ingrese valor de z: ");
        zz=r.nextInt();
        return (x+xx)+(y+yy)+(z+zz);  
    } 

    public double moduleVector(){
        return (Math.sqrt(Math.pow(2,x)+Math.pow(2,y)+Math.pow(2,z)));
    }
    
    public String scalarMultiplication(int sc){
        System.out.println("Ingrese un número entero: ");
        sc=r.nextInt();
        
        return (sc*x)+", "+(sc*y)+", "+(sc*z);
    }
}
