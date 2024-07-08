
package Lista03;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int watts;
        double preco, conta, contaA;
        System.out.println("Digite o preco do quilowatt: ");
        preco = input.nextDouble();
        System.out.println("Digite a quantidade gasta de quilowatt: ");
        watts = input.nextInt();
        conta = preco * watts;
        contaA = conta * 10 / 100 + conta;
        System.out.println("O valor da conta sera de R$" + conta + " e se tiver atraso sera R$" + contaA);
        if (watts > 70){
            System.out.println("Consumo elevado de energia");
        }
        else{
            System.out.println("você é um consumidor consciente");
        }
    }
}
