
package Lista03;

import java.util.Scanner;

public class A12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angulo;
        System.out.println("Digite o angulo: ");
        angulo = input.nextDouble();
        if(angulo < 90){
            System.out.println("O angulo é agudo");
        }
        else if(angulo == 90){
            System.out.println("O angulo é reto");
        }
        else if(angulo > 90){
            System.out.println("O angulo é obtuso");
        }
    }
}
