
package Lista03;

import java.util.Scanner;

public class A09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numero;
        double saldoA, valor, saldoN = 0;
        char operacao;
        System.out.println("Digite o numero da conta: ");
        numero = input.nextLine();
        System.out.println("Digite o saldo atual da conta: ");
        saldoA = input.nextDouble();
        System.out.println("Digite a operaçao que deseja realizar (1 para Deposito e 2 para Saque): ");
        operacao = input.next().charAt(0);
        System.out.println("Digite o valor da operacao: ");
        valor = input.nextInt();
        switch(operacao){
            case '1':
                saldoN = saldoA + valor;
                break;
            case '2':
                saldoN = saldoA - valor;
                break;
        }
        
        System.out.println("Novo saldo: " + saldoN);
        if(saldoN < 0){
            System.out.println("Conta estourada!");
        }
    }
}
