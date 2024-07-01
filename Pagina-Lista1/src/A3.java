
package Lista01;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, somaQuad;
        System.out.println("Digite um número: ");
        num1 = input.nextInt();
        System.out.println("Digite outro número: ");
        num2 = input.nextInt();
        somaQuad = (num1 * num1) + (num2 * num2);
        System.out.println("A soma dos quadrados dos numeros e: " + somaQuad);
    }
}
