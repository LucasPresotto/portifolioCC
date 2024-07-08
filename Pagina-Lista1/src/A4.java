
package Atividades;

import java.util.Scanner;


public class A4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y, x;
        System.out.println("Digite o valor de x: ");
        x = input.nextInt();
        y = (3*x)+2;
        System.out.println("O valor de y é: " + y);
    }
}
