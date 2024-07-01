
package Lista02;

import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        double notaP, notaM, notaC, media;
        boolean aprovado = false;
        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite sua nome em Portugues: ");
        notaP = input.nextDouble();
        System.out.println("Digite sua nota em Matemática: ");
        notaM = input.nextDouble();
        System.out.println("Digite sua nota em Conhecimentos Gerais: ");
        notaC = input.nextDouble();
        media = (notaP + notaM + notaC) / 3;
        if(media >=7 && (notaP >=5 && notaM >=5 && notaC >= 5)){
            aprovado = true;
        }
        System.out.println(nome + " suas notas foram: ");
        System.out.println("Portugues: " + notaP);
        System.out.println("Matematica: " + notaM);
        System.out.println("Conhecimentos Gerais: " + notaC);
        System.out.println("Sua media final foi: " + media);
        System.out.println("Aprovado: " + aprovado);
    }
}
