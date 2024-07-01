
package Lista01;

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cel, fah;
        System.out.println("Digite a temperatura em graus celsius: ");
        cel = input.nextDouble();
        fah = 9 * cel / 5 + 32;
        System.out.println("A temperatura em fahrenheit: " + fah);
    }
}
