
package Lista04;

import java.util.Scanner;

public class A03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade, i = 0;
        char sexo;
        System.out.println("Digite o nome: ");
        nome = input.nextLine();
        System.out.println("Digite a idade: ");
        idade = input.nextInt();
        System.out.println("Digite o sexo (M/F): ");
        sexo = input.next().charAt(0);
        while(idade != 0){
            i++;
            System.out.println("Digite 0 pra sair");
            System.out.println("Digite a sua idade: ");
            idade = input.nextInt();
        }
        System.out.println("Numero de repeticoes: " + i);
    }
}
