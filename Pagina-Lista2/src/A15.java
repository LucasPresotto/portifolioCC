
package Lista01;

import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, engordar, emagrecer;
        System.out.println("Digite o seu peso: ");
        peso = input.nextDouble();
        engordar = (15 * peso / 100) + peso;
        emagrecer = peso - (20 * peso / 100);
        System.out.println("Se voce engoradar 15% seu peso será Kg" + engordar);
        System.out.println("Se voce emagrecer 20% seu peso será Kg" + emagrecer);
    }
}
