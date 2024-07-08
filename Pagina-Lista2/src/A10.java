
package Lista01;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, quo, resto;
        System.out.println("Digite um numero: ");
        num = input.nextInt();
        quo = num / 2;
        resto = num % 2;
        System.out.println("O quociente do numero e: " + quo + " e o resto e: " + resto);
    }
}
