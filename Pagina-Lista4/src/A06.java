
package Lista03;

import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, menor;
        System.out.println("Digite o primeiro numero: ");
        n1 = input.nextInt();
        System.out.println("Digite o segunod numero: ");
        n2 = input.nextInt();
        System.out.println("Digite o terceiro numero: ");
        n3 = input.nextInt();
        menor = n1;
        if(n2 < menor){
            menor = n2;
        }
        if(n3 < menor){
            menor = n3;
        }
        System.out.println("O menor numero é o " + menor);
    }
}
