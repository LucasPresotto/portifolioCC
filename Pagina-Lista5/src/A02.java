package Lista04;

import java.util.Scanner;

public class A02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, soma;
        System.out.println("Digite o primeiro numero: ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = input.nextInt();
        while(n1 > n2) {
            System.out.println("o segundo numero deve ser maior que o primeiro!");
            System.out.println("Digite o primeiro numero: ");
            n1 = input.nextInt();
            System.out.println("Digite o segundo numero: ");
            n2 = input.nextInt();
        }
        soma = n1 + n2;
        System.out.println("A soma dos numeros e: " + soma);
    }
}
