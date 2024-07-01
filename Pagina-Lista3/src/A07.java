
package Lista03;

import java.util.Scanner;

import java.util.Arrays;

public class A07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valor = new int[3];
        System.out.println("Digite o primeiro numero: ");
        valor[0] = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        valor[1] = input.nextInt();
        System.out.println("Digite o terceiro numero: ");
        valor[2] = input.nextInt();
        Arrays.sort(valor);
        System.out.println(Arrays.toString(valor));
        
    }
}
