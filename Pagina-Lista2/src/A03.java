
package Lista02;

import java.util.Scanner;

public class A03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int watts;
        double preco, conta, contaA;
        boolean consumoE;
        System.out.println("Digite o preco do quilowatt: ");
        preco = input.nextDouble();
        System.out.println("Digite a quantidade gasta de quilowatt: ");
        watts = input.nextInt();
        conta = preco * watts;
        contaA = conta * 10 / 100 + conta;
        System.out.println("O valor da conta sera de R$" + conta + " e se tiver atraso sera R$" + contaA);
        if(conta > 70 || contaA > 70){
            consumoE = true;
            System.out.println("Consumo Elevado: " + consumoE);
        }
        else{
            consumoE = false;
            System.out.println("Consumo Elevado: " + consumoE);
        }
    }
}
