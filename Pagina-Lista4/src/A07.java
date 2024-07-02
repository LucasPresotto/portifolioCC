package Lista04;

import java.util.Scanner;

public class A07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        char apartamento, continuar;
        int diaria, pagar=0;
        do {
            System.out.println("Digite o nome: ");
            nome = input.nextLine();
            System.out.println("Digite o tipo de apartamento (A, B, C): ");
            apartamento = input.next().charAt(0);
            System.out.println("Digite a quantidade de diarias: ");
            diaria = input.nextInt();
            if(apartamento == 'A') {
                pagar = diaria * 150;
            }
            if(apartamento == 'B') {
                pagar = diaria * 100;
            }
            if(apartamento == 'C') {
                pagar = diaria * 75;
            }
            System.out.println("O valor total " + pagar + " do cilente " + nome + " apartamento " + apartamento + " com " + diaria + " diaria");
            System.out.println("Deseja continuar? (S/N)");
            continuar = input.next().charAt(0);
        } while(continuar == 'S' && diaria > 0);
    }
}
