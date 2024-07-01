
package Lista03;

import java.util.Scanner;

public class A18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo, saldoN;
        System.out.println("Digite o saldo medio do cliente: ");
        saldo = input.nextDouble();
        if(saldo >= 0 && saldo <= 500){
            System.out.println("Nenhum credito");
        }
        else if(saldo > 500 && saldo <= 1000){
            saldoN = 0.30 * saldo;
            System.out.println("Saldo medio: " + saldo);
            System.out.println("Valor do credito: " + saldoN);
        }
        else if(saldo > 1000 && saldo <= 3000){
            saldoN = 0.4 * saldo;
            System.out.println("Saldo medio: " + saldo);
            System.out.println("Valor do credito: " + saldoN);
        }
        else if(saldo > 3000){
            saldoN = 0.5 * saldo;
            System.out.println("Saldo medio: " + saldo);
            System.out.println("Valor do credito: " + saldoN);
        }
    }
}
