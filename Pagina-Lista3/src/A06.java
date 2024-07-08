
package Lista02;

import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double prova1, prova2, trabalho, frequencia;
        boolean aprovado;
        System.out.println("Digite a nota da prova1: ");
        prova1 = input.nextDouble();
        System.out.println("Digite a nota do prova2: ");
        prova2 = input.nextDouble();
        System.out.println("Digite a nota do trabalho: ");
        trabalho = input.nextDouble();
        System.out.println("Digite a frequencia: ");
        frequencia = input.nextDouble();
        if(trabalho >= 7 && (prova1 >= 6 || prova2 >= 6) && frequencia >=70){
            aprovado = true;
            System.out.println("Aprovado: " + aprovado);
        }
        else if (trabalho >= 6 && (prova1 >= 6 || prova2 >= 6) && frequencia >=90){
            aprovado = true;
            System.out.println("Aprovado: " + aprovado);
        }
        else{
            aprovado = false;
            System.out.println("Aprovado: " + aprovado);
        }
    
    }
}
