
package Lista02;

import java.util.Scanner;

public class A09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorCompra, valorPago, troco, notas100 = 0, notas10 = 0, notas1 = 0;
        System.out.println("Digite o valor da compra: ");
        valorCompra = input.nextInt();
        System.out.println("Digite o valor pago: ");
        valorPago = input.nextInt();
        troco = valorPago - valorCompra;
        System.out.println("O troco será de R$" + troco);
        notas100 = troco / 100;
        notas10 = (troco % 100) / 10;
        notas1 = (troco % 100) % 10;
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 1: " + notas1);
    }   
              
    }

