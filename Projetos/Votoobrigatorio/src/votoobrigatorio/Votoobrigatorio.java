/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votoobrigatorio;

import java.util.Scanner;

/**
 *
 * @author Meu Computador
 */
public class Votoobrigatorio {
    
    
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano do seu nascimento");
        int nascimento = teclado.nextInt();
        int idade = (2023 - nascimento);
        if ((idade >= 16) && (idade <=18) || (idade > 70)) {
            System.out.println("Opcional");
        } else {
            if (idade >= 18) {
                
                System.out.println("Obrigatorio");
                
                
                
            }
            
            
            
        }
        
        
        
        
       
    }
    
}
