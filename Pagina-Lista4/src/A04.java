
package Lista03;

import java.util.Scanner;

public class A04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;
        System.out.println("Digite um número: ");
        num = input.nextDouble();
        if(num % 2 == 0){
            System.out.println("O número é par");
        }
        else{
            System.out.println("o número é ímpar");
        }
    }
}
