
package Lista02;

import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double produto1_01, produto1_02, produto2_01, produto2_02, produto3_01, produto3_02, inflacao1, inflacao2, inflacao3, inflacaoMedia;
        System.out.println("Digite o preco do produto 1 no dia 01/01/22: ");
        produto1_01 = input.nextDouble();
        System.out.println("Digite o preco do produto 2 no dia 01/01/22: ");
        produto2_01 = input.nextDouble();
        System.out.println("Digite o preco do produto 3 no dia 01/01/22: ");
        produto3_01 = input.nextDouble();
        System.out.println("Digite o preco do produto 1 no dia 02/01/22: ");
        produto1_02 = input.nextDouble();
        System.out.println("Digite o preco do produto 2 no dia 02/01/22: ");
        produto2_02 = input.nextDouble();
        System.out.println("Digite o preco do produto 3 no dia 02/01/22: ");
        produto3_02 = input.nextDouble();
        inflacao1 = ((produto1_02 - produto1_01) / produto1_01) * 100;
        inflacao2 = ((produto2_02 - produto2_01) / produto2_01) * 100;
        inflacao3 = ((produto3_02 - produto3_01) / produto3_01) * 100;
        inflacaoMedia = (inflacao1 + inflacao2 + inflacao3) / 3;
        if(inflacaoMedia > 0.55){
            System.out.println("Inflacao esta acima da media! +" + inflacaoMedia);
        }
        else{
            System.out.println("Inflacao nao esta acima da media! +" + inflacaoMedia);
        }
    }
}
