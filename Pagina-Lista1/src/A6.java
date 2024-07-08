
package Atividades;

import java.util.Scanner;


public class A6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, quad;
        System.out.println("Digite um número: ");
        num = input.nextInt();
        quad = num * num;
        System.out.println("O quadrado do numero e: " + quad);
    }
}
