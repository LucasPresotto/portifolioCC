
package Atividades;

import java.util.Scanner;


public class A7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma;
        int quad[] = new int[4];
        int vetor[] = new int[4];
        for(int i = 0; i<1; i++){
        System.out.println("Digite 4 números: ");
        vetor[0] = input.nextInt();
        vetor[1] = input.nextInt();
        vetor[2] = input.nextInt();
        vetor[3] = input.nextInt();
        } 
        quad[0] = vetor[0] * vetor[0];
        quad[1] = vetor[1] * vetor[1];
        quad[2] = vetor[2] * vetor[2];
        quad[3] = vetor[3] * vetor[3];
        
        soma = quad[0] + quad[1] + quad[2] + quad[3];
        
        System.out.println("Os quadrados dos numeros sao: " + soma);
    }
}
 