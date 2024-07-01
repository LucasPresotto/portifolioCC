
package Lista03;

import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("digite um número: ");
        num = input.nextInt();
        if(num <= 10){
            System.out.println("F1");
        }
        else if(num > 10 && num <= 100){
            System.out.println("F2");
        }
        else if(num > 100){
            System.out.println("F3");
        }
    }
}
