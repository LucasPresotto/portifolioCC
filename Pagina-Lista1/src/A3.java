
package Atividades;

import java.util.Scanner;


public class A3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, end, tel;
        System.out.println("Digite o nome: ");
        nome = input.nextLine();
        System.out.println("Digite o endereco: ");
        end = input.nextLine();
        System.out.println("Digite o telefone: ");
        tel = input.nextLine();
        System.out.println(nome + " com o telefone " + tel + " mora no endereco " + end);
        
    }
}
