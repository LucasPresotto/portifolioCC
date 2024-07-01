
package Lista01;

import java.util.Scanner;


public class A4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, quad, soma;
        System.out.println("Digite um número: ");
        num1 = input.nextInt();
        System.out.println("Digite outro número: ");
        num2 = input.nextInt();
        soma = num1 + num2;
        quad = soma * soma;
        System.out.println("A soma dos quadrados dos numeros e: " + quad);
    }
}
