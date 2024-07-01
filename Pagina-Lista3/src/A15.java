
package Lista03;

import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade do nadador: ");
        idade = input.nextInt();
        if(idade >= 5 && idade <= 10){
            System.out.println("A categoria do nadador é infantil");
        }
        else if(idade > 10 && idade < 18){
            System.out.println("A categoria do nadador é juvenil");
        }
        else if(idade >= 18 && idade < 61){
            System.out.println("A categoria do nadador é adulto");
        }
        else if(idade > 60){
            System.out.println("A categoria do nadador é senior");
        }
    }
}
