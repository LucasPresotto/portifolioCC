
package Lista01;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tipo1, tipo2, tipo3, valorTot;
        System.out.println("Digite a qauntidade vendida do picole tipo1: ");
        tipo1 = input.nextDouble();
        System.out.println("Digite a qauntidade vendida do picole tipo2: ");
        tipo2 = input.nextDouble();
        System.out.println("Digite a qauntidade vendida do picole tipo3: ");
        tipo3 = input.nextDouble();
        tipo1 = tipo1 * 1.50;
        tipo2 = tipo2 * 2.00;
        tipo3 = tipo3 * 0.75;
        valorTot = tipo1 + tipo2 + tipo3;
        System.out.println("O valor arrecadado do picole tipo 1 foi de: " + tipo1 + ", do picole tipo 2: " + tipo2 + ", o picole tipo3: " + tipo3 + " e o valor total arrecadado foi de " + valorTot);
    }
}
