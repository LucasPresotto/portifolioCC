
package Lista02;

import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double prova1, prova2, trabalho;
        boolean aprovado;
        System.out.println("Digite a nota da prova1: ");
        prova1 = input.nextDouble();
        System.out.println("Digite a nota do prova2: ");
        prova2 = input.nextDouble();
        System.out.println("Digite a nota do trabalho: ");
        trabalho = input.nextDouble();
        if(trabalho >= 7 && (prova1 >= 6 || prova2 >= 6)){
            aprovado = true;
            System.out.println("Aprovado: " + aprovado);
        }
        else{
            aprovado = false;
            System.out.println("Aprovado: " + aprovado);
        }
    }
}
