
package Lista02;

import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distancia, consumo, preco, gasto;
        System.out.println("Digite a distancia a ser percorrida (km): ");
        distancia = input.nextDouble();
        System.out.println("Digite o consumo medio de combustivel do carro: ");
        consumo = input.nextDouble();
        System.out.println("Digite o preco do litro do ocmbustivel: ");
        preco = input.nextDouble();
        gasto = distancia / consumo * preco;
        System.out.println("O valor a ser gasto em combustivel na viagem sera de R$" + gasto);
    }
}
