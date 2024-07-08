
package Lista03;

import java.util.Scanner;

public class A08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome; 
        char categoria;
        double salarioA, salarioN, reajuste;
        System.out.println("Digite o nome do funcionario: ");
        nome = input.nextLine();
        System.out.println("Digite a categoria do funcionario (A a Z): ");
        categoria = input.next().charAt(0);
        System.out.println("Digite o salario do funcionario: ");
        salarioA = input.nextDouble();
        switch(categoria){
            case 'A':
            case 'H':
                salarioN = salarioA * 0.10;
                break;
            case 'B':
            case 'D':
            case 'E':
                salarioN = salarioA *0.15;
                break;
            case 'C':
            case 'F':
                salarioN = salarioA * 0.25;
                break;
            default:
                salarioN = salarioA * 0.30;
        }
        reajuste = salarioA + salarioN;
        
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Novo Salario: " + reajuste);
        
    }
}
