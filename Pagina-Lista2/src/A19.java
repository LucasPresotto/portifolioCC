
package Lista02;

import java.lang.reflect.Array;
import java.util.Scanner;

public class A19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0, soma = 0;
        System.out.println("Digite uim numero entre 0 e 999: ");
        numero = input.nextInt();
        while(numero > 0){
            soma += numero % 10;
            numero /= 10;
        }
        System.out.println("A soma dos digitos do numero e: " + soma);
    }
}
 