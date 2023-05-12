/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
 
public class ExercicioRepita {

    
    public static void main(String[] args) {
     
        int n,s = 0;
     
        do {
        
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> infomre um numero: <br>(Valor 0 interrompe)</html>"));
     
     s += n;
    } while (n != 0);
       
        JOptionPane.showMessageDialog(null, "<html> Resultado Final <br><hr>" + "<br> Somatorio vale " + s + "</html>");
        
        
        
        
        
        
        
        
    }
    
}
