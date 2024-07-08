
package Lista04;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2;
        System.out.println("Digite o primeiro numero: ");
        n1 = input.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = input.nextDouble();
        while(n1 <= n2){
            System.out.println("Numero 1: " +  n1 + " Numero 2: " + n2);
            n1++;
        }
        
    }
}
