
package Atividades;

import java.util.Scanner;


public class A5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double con, dis, vol;
        System.out.println("Digite a distancia percorrida: ");
        dis = input.nextDouble();
        System.out.println("Digite o volume de combustivel: ");
        vol = input.nextDouble();
        con = dis/vol;
        System.out.println("O consumo medio e: " + con);
    }
}
