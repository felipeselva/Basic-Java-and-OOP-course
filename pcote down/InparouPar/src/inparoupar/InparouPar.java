
package inparoupar;

import javax.swing.JOptionPane;
public class InparouPar {

 
    public static void main(String[] args) {
       
    double nt1,nt2,nt3, media;
    
   String n1,n2,n3;
   
   n1 = JOptionPane.showInputDialog (null,"Digite um numero ");
   nt1 = Double.parseDouble (n1);
   
   n2 = JOptionPane.showInputDialog (null,"Digite um numero ");
   nt2 = Double.parseDouble (n1);
   
   n3 = JOptionPane.showInputDialog (null,"Digite um numero ");
   nt3= Double.parseDouble (n1);
   
   media = (nt1+nt2+nt3)/3;
   
   
   if ( media >= 7 )
       
   { JOptionPane.showMessageDialog(null, "Aprovado com nota " + media);}
   
    
   else 
   
   { JOptionPane.showMessageDialog(null, "Reprovado com nota " + media );}
    
    
    
    
    
    
    
    
    
    }
    
}
