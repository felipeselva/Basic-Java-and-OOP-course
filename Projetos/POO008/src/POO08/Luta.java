
package POO08;

import java.util.Random;


public class Luta {
    
    private Lutador desafiado;
            private Lutador desafiante;
                    private int rounds;
                         private boolean aprovada;   
    
    
    
    
    
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == (l2.getCategoria())) {
             
            this.aprovada = true;
            desafiado = l1;
            desafiante = l2;
            
        }
        
        else 
        
        { this.aprovada = false; 
        desafiado = null;
        desafiante = null;
         System.out.println("Luta não pode acontecer ");
         
        }
    }
    
    public void Lutar() {
        if (this.aprovada) {
            desafiado.apresentarLutador();
            desafiante.apresentarLutador();
            
             Random aleatorio = new Random();
            
            int vencedor = aleatorio.nextInt(3);
              switch (vencedor) {
            
                  
            case 0: 
                System.out.println("EMPARTOU");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
             break;
            case 1:
                System.out.println("Desafiante Venceu");
                desafiante.ganharLuta();
                desafiado.perderLuta();
                break;
            case 2:
                System.out.println("Desafiado Venceu");
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;
              }     
            
            
            
        } 
        
        
    
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd ) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    
    
}

