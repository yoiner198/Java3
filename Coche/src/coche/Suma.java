package coche;

/**
 *
 * @author Yo
 */
public class Suma {
    private int n1,n2;
    int setN1;
    int setN2;
    
    //constructor

    public Suma(){
        this.n1=0;
        this.n2=0;
        
    }
    
    //metodo setter
    
    public void setN1(int n1){
        this.n1=n1; 
    }

    public void setN2(int n2){
        this.n2=n2; 
    }
    
    //metodo getter
    
    public int getN1(){
        return this.n1;
    }
    
    public int getN2(){
        return this.n2;
    }

    
    public String rSuma(){
        return "La suma es "+(setN1+setN2);
    }
    
}
