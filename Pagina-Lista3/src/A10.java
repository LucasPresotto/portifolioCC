
package Lista02;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tamanhoPista, peso, visibilidade, chuva, passageiros;
        boolean decolagem = false, decola = false;
        System.out.println("Digite o tamanho da pista (km): ");
        tamanhoPista = input.nextDouble();
        System.out.println("Digite o peso do aviao (toneladas): ");
        peso = input.nextDouble();
        System.out.println("Digite a visibilidade da pista (metros): ");
        visibilidade = input.nextDouble();
        System.out.println("Digite a quantidade de chuva (mm): ");
        chuva = input.nextDouble();
        System.out.println("Digite a qunatidade de passageiros do aviao: ");
        passageiros = input.nextDouble();
        if((tamanhoPista < 1.5 && peso < 40) || (tamanhoPista > 1.5 && tamanhoPista < 2.0 && peso > 60)){
            decola = false;
        }
        else if(tamanhoPista > 2.0){
            decola = true;
        }
        else if(visibilidade < 20){
            if(decolagem = true){
                decola = true;
            }
        }
        else if(chuva > 5){
            decola = false;
        }
        else if(passageiros > 100 && chuva > 0){
            decola = false;
        }
        System.out.println("Tamanho da Pista: " + tamanhoPista);
        System.out.println("Peso do Aviao: " + peso);
        System.out.println("Visibilidade da Pista: " + visibilidade);
        System.out.println("Chuva: " + chuva);
        System.out.println("Quantidade de Passageiros" + passageiros);
        System.out.println("Sistema de decolagem: " + decolagem);
        System.out.println("Decola: " + decola);
    }
}
 