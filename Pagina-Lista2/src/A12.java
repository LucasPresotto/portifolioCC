
package Lista01;

import java.util.Scanner;

public class A12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pesoPrato, valorPag;
        System.out.println("DigiTe o peso do prato em kilos: ");
        pesoPrato = input.nextDouble();
        valorPag = (pesoPrato + 0.450) * 39.00;
        System.out.println("O valor a pagar pelo prato e: R$" + valorPag);
    }
}
