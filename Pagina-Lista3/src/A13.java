
package Lista03;

import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nome = new String[3];
        int[] quant = new int[3];
        System.out.println("Digite o nome do primeiro produto: ");
        nome[0] = input.nextLine();
        System.out.println("Digite a quantidade do produto 1: ");
        quant[0] = input.nextInt();
        System.out.println("Digite o nome do segundo produto: ");
        nome[1] = input.nextLine();
        System.out.println("Digite a quantidade do produto 2: ");
        quant[1] = input.nextInt();
        System.out.println("Digite o nome do terceiro produto: ");
        nome[2] = input.nextLine();
        System.out.println("Digite a quantidade do produto 3: ");
        quant[2] = input.nextInt();
        
        if(quant[0] < 30){
            System.out.println(nome[0] + " esta abaixo do estoque minino");
        }
        if(quant[1] < 30){
            System.out.println(nome[1] + " esta abaixo do estoque minino");
        }
        if(quant[2] < 30){
            System.out.println(nome[2] + " esta abaixo do estoque minino");
        }
        if(quant[0] > 30 && quant[1] > 30 && quant[2] > 30){
            System.out.println("Nenhum produto esta abaixo do estoque minimo");
        }
    }
}
