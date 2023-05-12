/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pernas;

import java.util.Scanner;

/**
 *
 * @author Meu Computador
 */
public class Pernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
         System.out.println("Qauntas pernas você possui ?");
        String tipo;
        int pernas = teclado.nextInt();
        switch (pernas) {
            case 1:
                tipo = "saci";
                System.out.println ("você é um "+tipo);
                        break;
                        case 2:
                        tipo = "bipedi";
                        System.out.println ("você é um "+tipo);
                                break;
                                case 4:
                                tipo = "quadrupedi";
                                System.out.println ("você é um "+tipo);
                                break;
                                
                                default: 
                                        tipo = "ET";
                          System.out.println ("você é um "+tipo);
                          
                          
                          
                          
                          
                          
                          
                          
                                        
                                
                                
                
                
                
        }
        
        
        
        
        
        
        
    }
    
}
