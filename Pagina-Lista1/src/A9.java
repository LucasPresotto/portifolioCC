
package Lista01;

import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int QCafe, QLeite, QBolacha;
        double  CCafe, CLeite, CBolacha, GTotal;
        System.out.println("Digite a qauntidade comprada de cafe: ");
        QCafe = input.nextInt();
        System.out.println("Digite o valor do cafe: ");
        CCafe = input.nextDouble();
        System.out.println("Digite a qauntidade comprada de leite: ");
        QLeite = input.nextInt();
        System.out.println("Digite o valor do leite: ");
        CLeite = input.nextDouble();
        System.out.println("Digite a qauntidade comprada de bolacha: ");
        QBolacha = input.nextInt();
        System.out.println("Digite o valor da bolacha: ");
        CBolacha = input.nextDouble();
        CCafe = CCafe * QCafe;
        CLeite = CLeite * QLeite;
        CBolacha = CBolacha * QBolacha;
        GTotal = CCafe + CLeite + CBolacha;
        System.out.println("O valor total do cafe foi: " + CCafe);
        System.out.println("O valor total do leite foi: " + CLeite);
        System.out.println("O valor total de bolacha foi: " + CBolacha);
        System.out.println("E o gasto total foi de : " + GTotal);
    }
}
