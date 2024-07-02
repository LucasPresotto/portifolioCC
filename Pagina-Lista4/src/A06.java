
package Lista04;

import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double idade = 0, otimo = 0, ruim = 0, idadeR = 0, maiorI = 0, menorI = Integer.MAX_VALUE, diferenca;
        char avaliacao;
        for(int i = 1; i <= 20; i++){
            System.out.println("Digite a idade: ");
            idade = input.nextDouble();
            System.out.println("Digite sua avaliação (A, B, C, D): ");
            avaliacao = input.next().charAt(0);
            if(avaliacao == 'A'){
                otimo++;
            }
            if(idade > maiorI){
                maiorI = idade;
            }
            if(idade < menorI){
                menorI = idade;
            }
            if(avaliacao == 'D'){
                ruim++;
                idadeR += idade;
            }
        }
        diferenca = maiorI - menorI;
        System.out.println("A quantidade de respostas otimas e: " + otimo);
        System.out.println("A media da idade das pessoas que responderam ruim e: " + idadeR/ruim);
        System.out.println("A  diferença de idade entre a pessoa de maior idade com a pessoa de menor de idade que responderam o questionário e: " + diferenca);
    }
}
