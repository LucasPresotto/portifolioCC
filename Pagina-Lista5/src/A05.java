
package Lista04;

import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura = 0, maiorAT = 0, mediaAM = 0, mediaAT = 0, mulher = 0;
        int codigo = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite a altura: " + i);
            altura = input.nextDouble();
            System.out.println("Digite o sexo (1- masculino e 2- feminino): " + i);
            codigo = input.nextInt();
            mediaAT += altura;
            if(codigo == 2){
                mediaAM += altura;
                mulher++;
            }
            if(altura > maiorAT){
                maiorAT = altura;
            }
       }
        
             System.out.println("A maior altura da turma e: " + maiorAT);
             System.out.println("A media de altura das mulheres e: " + mediaAM/mulher);
             System.out.println("A media de altura da turma e: " + mediaAT/10);
    }
}
