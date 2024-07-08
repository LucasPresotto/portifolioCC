
package Lista02;

import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioBruto, salarioLiquido;
        int dependentes;
        System.out.println("Digite o seu salario bruto: ");
        salarioBruto = input.nextDouble();
        System.out.println("Digite o numero de dependente: ");
        dependentes = input.nextInt();
        salarioLiquido = salarioBruto - (salarioBruto * 11 / 100 + salarioBruto * 15 / 100);
        salarioLiquido = salarioLiquido + dependentes * 150.0;
        System.out.println("Seu salario liquido final sera de R$" + salarioLiquido);
    }
}
