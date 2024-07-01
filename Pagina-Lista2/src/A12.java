
package Lista02;

import java.util.Scanner;

public class A12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nA, nB;
        System.out.println("Digite o numero 1: ");
        nA = input.nextDouble();
        System.out.println("Dugute o numero 2: ");
        nB = input.nextDouble();
        if(nA == nB){
            System.out.println("Os dois números sao iguais!");
        }
        else{
            System.out.println("Os dois numeros sao diferentes!");
        }
    }
}
