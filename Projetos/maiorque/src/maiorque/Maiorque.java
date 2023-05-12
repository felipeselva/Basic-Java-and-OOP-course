
package maiorque;

import javax.swing.JOptionPane;
public class Maiorque {

   
    public static void main(String[] args) {
        
        double n1,n2,n3;
        String nu1, nu2;
        
        
        
        nu1 = JOptionPane.showInputDialog (null,"Digite o primeiro numero " );
        n1 = Double.parseDouble(nu1);
        
        nu2 = JOptionPane.showInputDialog (null,"Digite o segundo numero " );
        n2 = Double.parseDouble(nu2);
        
        n3 = (n1+n2);
        
        if (n3 > 10)
            
            
        { JOptionPane.showMessageDialog(null, " A soma dos dois numeros é " + n3);}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
