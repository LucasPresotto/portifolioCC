
package Lista02;

import java.util.Scanner;

public class A08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tempo, distancia;
        boolean perigo = false;
        System.out.println("Digite o tempo de percepção (em segundos): ");
        tempo = input.nextDouble();
        distancia = tempo * 340.0;
        System.out.println("A distancia do raio foi de " + distancia + " metros");
        if(distancia < 200){
            perigo = true;
            System.out.println("Perigo: " + perigo);
        } else{
            System.out.println("Perigo: " + perigo);
    }
    }
}
