
package Lista04;

import java.util.Scanner;

public class A09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        String cpf;
        double rendaM, desconto;
        char classe;
        do{
            System.out.println("Digite o cpf: (00 encerra)");
            cpf = entrada.nextLine();
            System.out.println("Digite sua renda mensal: ");
            rendaM = input.nextDouble();
            System.out.println("Digite sua classe: (A, B, C, D, E) ");
            classe = input.next().charAt(0);
            if(classe == 'A'){
                System.out.println("Isento de aliquota");
                desconto = rendaM;
                System.out.println("Não possui desconto");
            }
            if(classe == 'B'){
                System.out.println("Aliquota de 5%");
                desconto = rendaM * 0.05;
                System.out.println("O valor a ser descontado e de R$" + desconto);
            }
            if(classe == 'C'){
                System.out.println("Aliquota de 10%");
                desconto = rendaM * 0.10;
                System.out.println("O valor a ser descontado e de R$" + desconto);
            }
            if(classe == 'D'){
                System.out.println("Aliquota de 15%");
                desconto = rendaM * 0.15;
                System.out.println("O valor a ser descontado e de R$" + desconto);
            }
            if(classe == 'E'){
                System.out.println("Aliquota de 20%");
                desconto = rendaM * 0.20;
                System.out.println("O valor a ser descontado e de R$" + desconto);
            }
        }while(!cpf.equals("00"));
    }
}
