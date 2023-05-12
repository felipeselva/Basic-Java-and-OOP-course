
package testejava2;

import javax.swing.JOptionPane;

public class TesteJava2 {

  
    public static void main(String[] args) {
        // TODO code application logic here
    
    double hora, vhora, valor,entrada,saida;
    String hpermanencia, hentrada,hsaida;
    
    
    hentrada = JOptionPane.showInputDialog(null, "Digite o horario de entrada");
    entrada = Double.parseDouble(hentrada);
    
    
    hpermanencia = JOptionPane.showInputDialog(null, "Quantas horas deseja ficar ?");
    hora = Double.parseDouble(hpermanencia);
    
    vhora = 5.00;
    if (hora <= 1)
            
            { JOptionPane.showMessageDialog(null, "Valor de Permancencia é R$ 8,00");}
    
   else if (hora == 2)
            
            { JOptionPane.showMessageDialog(null, "Valor de Permancencia é R$ 15,00");}
    
   else if (hora > 2)
            
            { valor = hora*vhora;
                    JOptionPane.showMessageDialog(null, "Valor de Permancencia é R$" + valor);
            }
            
            
            
            
            }
    
}
