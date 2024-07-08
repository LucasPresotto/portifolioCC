
package Lista01;

import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segundos, minutos = 0, horas = 0;
        System.out.println("Digite a quantidades de segundos do video: ");
        segundos = input.nextInt();
        while(segundos >= 60){
            segundos = segundos - 60;
            minutos++;
            if(minutos >=60){
                horas++;
                minutos = minutos - 60;
            }
        }
        System.out.println("A duracao do video e " + horas + "h" + minutos + "m" + segundos + "s");
        
    }
}
