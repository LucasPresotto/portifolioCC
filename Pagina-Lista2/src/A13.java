
package Lista01;

import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas, minutos, segundos, segundosTot;
        System.out.println("Digite a hora: ");
        horas = input.nextInt();
        System.out.println("Digite o minuto: ");
        minutos = input.nextInt();
        System.out.println("Digite o segundo: ");
        segundos = input.nextInt();
        segundosTot = (horas * 3600) + (minutos * 60) + segundos;
        System.out.println("Desde que o dia comecou ja se passaram " + segundosTot + " segundos");
    }
}
