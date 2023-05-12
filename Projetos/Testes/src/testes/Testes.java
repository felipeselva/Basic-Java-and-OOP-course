
package testes;


import javax.swing.JOptionPane;



public class Testes {

   
    public static void main(String[] args) {
       
      double taxa,diaria, ndiaria, valdiaria;
      String diaria_str;
      

      diaria = 95.00;
      diaria_str = JOptionPane.showInputDialog(null, "Quantos dias pretende ficar ? ");
      ndiaria = Double.parseDouble(diaria_str);
      valdiaria = (diaria * ndiaria);
      JOptionPane.showConfirmDialog(null, " O Valor da diaria é " + valdiaria);
     
      
      if (ndiaria < 10) 
      
      { taxa = (valdiaria/100)*15;
          
       JOptionPane.showMessageDialog(null, "Sua taxa é " + taxa);
       
   }
     
              
      else if (ndiaria == 10) 
     
     
      
      { taxa = (valdiaria/100)*10;
          JOptionPane.showMessageDialog(null, "Sua taxa é " + taxa);
          
      }
      
      else if (ndiaria > 10)
      
      { taxa = (valdiaria/100)*5;
          JOptionPane.showMessageDialog(null, "Sua taxa é " + taxa);
      
      }
     
      
      
      
    }
      
      
      
      
      
      
      
      
      
      
             
  
   
   
   
   
   
   
   
   
     
       
        
        
    }
    
}
