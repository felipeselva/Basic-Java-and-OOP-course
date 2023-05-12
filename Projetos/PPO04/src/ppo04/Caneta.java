
package ppo04;


public class Caneta {
   public String modelo;
   private float ponta;
   private String cor;
   private boolean tampada;

    public Caneta() {
        this.modelo = "BIC";
        this.ponta = 0.5f;
        this.cor = "azul";
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public String getCor() {
        return cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    
    public void status () {
        
        System.out.println(cor);
        System.out.println(ponta);
        System.out.println(modelo);
    }
    
}
