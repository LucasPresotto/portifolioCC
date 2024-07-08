
package Lista02;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class A18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int diaNasc, mesNasc, anoNasc, diaAtual, mesAtual, anoAtual, diasVividos;
        System.out.println("Digite o ano de seu nascimento (dia, mes, ano): ");
        diaNasc = input.nextInt();
        mesNasc = input.nextInt();
        anoNasc = input.nextInt();
        System.out.println("Digite o ano atual (dia, mes, ano): ");
        diaAtual = input.nextInt();
        mesAtual = input.nextInt();
        anoAtual = input.nextInt();
        diasVividos = ((anoAtual - anoNasc) * 360) + ((mesAtual - mesNasc) * 30) + (diaAtual - diaNasc);
        System.out.println("O total de dias vividos foi " + diasVividos);
    }
}
