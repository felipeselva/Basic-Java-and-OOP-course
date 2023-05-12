
package atividade.pkg01;

import javax.swing.JOptionPane; 
public class Atividade01 {

    
    public static void main(String[] args) {
       
        float consumo = Float.parseFloat( JOptionPane.showInputDialog ( null,"digite seu consumo " ));
            EnergiaEletrica e1 = new EnergiaEletrica (consumo);
            e1.CalcularValor(consumo);
            
            
        
        
        
        
        
        
        
    }
    
}
