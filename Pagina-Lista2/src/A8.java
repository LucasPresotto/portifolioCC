
package Lista01;

import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        double salariominimo, quantCarro, valorTot, salario;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do salario minimo: ");
        salariominimo = input.nextDouble();
        System.out.println("Digite a quantidade de carros vendida pelo funcionario: ");
        quantCarro = input.nextDouble();
        System.out.println("Digite o valor total das vendas: ");
        valorTot = input.nextDouble();
        salario = (salariominimo * 2) + (quantCarro * 150.00) + (5 * valorTot / 100);
        System.out.println("O salario do funcionario e: " + salario);
    }
}
