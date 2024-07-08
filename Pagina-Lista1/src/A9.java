
package Atividades;

import java.util.Scanner;


public class A9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cel, fah;
        System.out.println("Digite a temperatura em Celsius: ");
        cel = input.nextDouble();
        fah = (9 * cel + 160)/5;
        System.out.println("A temperatura em fahreheit e: " + fah);
    }
}
