
package exerciciotemperatura;

import java.util.Scanner;


public class ExercicioTemperatura {

    
    public static void main(String[] args) {

        
        
         float[] temp = new float[7];
    float media = 0;
    int diasAcima = 0, diasAbaixo = 0;

    Scanner sc = new Scanner(System.in);

    for (int controle = 0; controle < 7; controle++) {
        System.out.print("Digite a temperatura do " + (controle + 1) + "º dia: ");
        temp[controle] = sc.nextFloat();
        media += temp[controle];
    }

    media = media / 7;

    for (int controle = 0; controle < 7; controle++) {
        if (temp[controle] > media) {
            diasAcima++;
        }
        if (temp[controle] < media) {
            diasAbaixo++;
        }
    }

    System.out.println("A média das temperaturas é " + media);
    System.out.println("A quantidade de dias que a temperatura ficou acima da média é " + diasAcima);
    System.out.println("A quantidade de dias que a temperatura ficou abaixo da média é " + diasAbaixo);
}
}
