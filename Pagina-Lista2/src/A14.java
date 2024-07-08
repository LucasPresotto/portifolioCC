
package Lista01;

import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas, minutos, segundos, segundosTot, segundosFalta;
        System.out.println("Digite a hora: ");
        horas = input.nextInt();
        System.out.println("Digite o minuto: ");
        minutos = input.nextInt();
        System.out.println("Digite o segundo: ");
        segundos = input.nextInt();
        segundosTot = (horas * 3600) + (minutos * 60) + segundos;
        segundosFalta = segundosTot - 86400;
        System.out.println("Ainda restam " + segundosTot + " segundos pra acabar o dia");
    }
}
