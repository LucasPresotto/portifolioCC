
package Lista02;

import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nA, nB, nC, soma;
        System.out.println("Digite o numero A: ");
        nA = input.nextDouble();
        System.out.println("Digite o numero B: ");
        nB = input.nextDouble();
        System.out.println("Digite o numero C: ");
        nC = input.nextDouble();
        soma = nA + nB;
        if(soma == nC){
            System.out.println("A soma de A e B é igual ao numero C");
        }
        else if(soma > nC){
            System.out.println("A soma de A e B é maior que o numero C");
        }
        else{
            System.out.println("A soma de A e B é menor que o numero C");
    }
}
}