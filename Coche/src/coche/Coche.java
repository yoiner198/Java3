package coche;

/**
 *
 * @author yoiner
 */


public class Coche {
    private String color;
    private String marca;
    private int modelo;
    private int caballos;
    private int puertas;
    private String matricula;
    
    
    //Metodo Constructor
    
    public Coche(){
        this.color ="Azul";
        this.marca = "Mazda";
        this.modelo = 1990;
        this.caballos = 12;
        this.puertas = 4;
        this.matricula = "V34A";    
    }
    
    //Metodo getter
    public String getColor(){
       return this.color;
    }
    public String getMarca(){
       return this.marca;
    }
    public int getModelo(){
      return this.modelo;
    }
    public int getCaballos(){
       return this.caballos;
    }
    public int getPuertas(){
       return this.puertas;
    }
    public String getMatricula(){
       return this.matricula;
    }
    
    //metodo Setter
     public void setColor(String c){
         this.color=c;
     }
     public void setMarca(String m){
         this.marca=m;
     }
     public void setModelo(int mo){
         this.modelo=mo;
     }
     public void setCaballos(int cab){
         this.caballos=cab;
     }
     public void setPuertas(int p){
         this.puertas=p;
     }
     public void setMatricula(String ma){
         this.matricula=ma;
     }
    
    //Metodo mostrar info
        public String mostrarInfo() {
        return "Carro {" + "color =" + color + ", marca =" + marca  + ", modelo = " + modelo  + ", Número de caballos de fuerza = " + caballos + ", cantidad de puertas =" +puertas +"matricula = "+matricula+ '}';
        }
}
