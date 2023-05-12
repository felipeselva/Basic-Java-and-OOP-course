
package ppo02;


public class Caneta {
    
    public String cor;
    private float ponta;
    public String modelo;
    protected int carga;
    protected boolean tampada;
    
    public void status (){
        System.out.println(" Uma caneta de cor " + this.cor);
        System.out.println("Está caneta esta tampada " + this.tampada);
        System.out.println(" Uma caneta de ponta " + this.ponta);
        System.out.println(" Com a carga " + this.carga);
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro não posso rabiscar");
            
        } else { System.out.println(" Estou Rabiscando  ");
        
        }
    }
    
    protected void tampar (){
        this.tampada = true;
        
        
    }
    protected void destampar () {
        
        this.tampada = false;
        
    }
    
    
}
