
package Lista04;

import java.util.Scanner;

public class A04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("|    Cardapio     |   Codigo   |  Preco  |");
        System.out.println("| Cachorro quente |     100    |   4,00  |"  );
        System.out.println("|    X Salada     |     101    |   6,00  |"  );
        System.out.println("|  Bauru com ovo  |     102    |   6,50  |"  );
        System.out.println("|   Refrigerante  |     103    |   2,00  |"  );
        System.out.println("------------------------------------------");
        int op, quant;
        double valor;
        System.out.println("Digite o codigo da opcao que deseja: ");
        op = input.nextInt();
        System.out.println("Digite a quantidade: ");
        quant = input.nextInt();
        for(int i = 100; i == op; i++){
            valor = 4 * quant;
            System.out.println(quant + " Cachoro quente: " + valor);
        }
        for(int i = 101; i == op; i++){
            valor = 6 * quant;
            System.out.println(quant + " X Salada: " + valor);
        }
        for(int i = 102; i == op; i++){
            valor = 6.50 * quant;
            System.out.println(quant + " Bauru com ovo: " + valor);
        }
        for(int i = 103; i == op; i++){
            valor = 2 * quant;
            System.out.println(quant + " Refrigerante: " + valor);
        }
    }
}
