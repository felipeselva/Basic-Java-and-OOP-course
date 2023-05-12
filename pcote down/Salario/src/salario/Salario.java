
package salario;

import javax.swing.JOptionPane;

public class Salario {

           
    public static void main(String[] args) {
    
    double salario, aumento, nsalario;
   String str_salario;
        
    str_salario = JOptionPane.showInputDialog (null, "Digite seu salario");
    salario = Double.parseDouble (str_salario);
    
    if (salario <= 280.00)
        
            
            { aumento = (salario/100)*20;
            nsalario = salario + aumento;
            JOptionPane.showMessageDialog(null, " Seu salario atula é de R$ " + salario);
            JOptionPane.showMessageDialog(null, " Seu aumento será de 20%" );
             JOptionPane.showMessageDialog(null, " O Valor do aumento é de R$ " + aumento);
              JOptionPane.showMessageDialog(null, " o seu novo salario é de R$ " + nsalario ); }
              
    else if (salario > 280.00 && salario < 700.00)
        
        
            
            { aumento = (salario/100)*15;
            nsalario = salario + aumento;
            JOptionPane.showMessageDialog(null, " Seu salario atula é de R$ " + salario);
            JOptionPane.showMessageDialog(null, " Seu aumento será de 15%" );
             JOptionPane.showMessageDialog(null, " O Valor do aumento é de R$ " + aumento);
              JOptionPane.showMessageDialog(null, " o seu novo salario é de R$ " + nsalario );
              
              
              
            
            
            }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
