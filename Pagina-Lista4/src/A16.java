
package Lista03;

import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y;
        System.out.println("Digite a coordenada x (abississa): ");
        x = input.nextDouble();
        System.out.println("Digite a coordenada y (ordenada): ");
        y = input.nextDouble();
        if(x > 0 && y > 0){
            System.out.println("o ponto esta na 1 quadrante");
        }
        else if(x > 0 && y < 0){
            System.out.println("O ponto esta no 4 quadrante");
        }
        else if(x < 0 && y < 0){
            System.out.println("O ponto esta no 3 quadrante");
        }
        else if(x < 0 && y > 0){
            System.out.println("O ponto esta no 2 quadrante");
        }
        else if(x == 0 && y == 0){
            System.out.println("O ponto nao pertence a nenhum quadrante");
        }
    }
}
