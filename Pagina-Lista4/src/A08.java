
package Lista04;

import java.util.Scanner;

public class A08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        String continuar;
        int idade = 0, infantil = 0, adulto = 0;
        do{
            System.out.println("Digite a idade: ");
            idade = input.nextInt();
            if(idade < 6){
                System.out.println("Isento de pagamento");
            }
            if(idade >=6 && idade < 13){
                System.out.println("Bilhete de crianca");
                infantil++;
            }
            if(idade > 12 && idade < 66){
                System.out.println("Bilhete normal");
                adulto++;
            }
            if(idade > 65){
                System.out.println("Bilhete de 3 idade");
            }
            System.out.println("Quantidade de bilhetes infantis: " + infantil);
            System.out.println("Quantidade de bilhete adulto: " + adulto);
            System.out.println("Deseja continuar? (Sim/Nao)");
            continuar = entrada.nextLine();
        }while(continuar.equals("Sim"));
    }
}
