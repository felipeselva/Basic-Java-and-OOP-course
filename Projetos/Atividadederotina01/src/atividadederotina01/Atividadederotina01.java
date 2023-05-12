
package atividadederotina01;

import java.util.Random;
import javax.swing.JOptionPane;

public class Atividadederotina01 {

    
    public static void main(String[] args) {
       
         int q;
         float valor,soma, media;
         
    q = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite a quantidade de valores"));
    soma=0;
    
    for (int c=0; c < q; c++ ){
        
     valor = Float.parseFloat(JOptionPane.showInputDialog("digite um valor"));
     soma = soma + valor;
    
   }
    media = (soma/q);
    JOptionPane.showMessageDialog(null, "a media é" + media );
        
        
        
        
        
        
        
        
    
    
}










}
