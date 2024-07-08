
package Lista02;

import java.util.Scanner;

public class A04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, altura, imc;
        boolean acimaPeso;
        System.out.println("Digite o peso(em kg): ");
        peso = input.nextDouble();
        System.out.println("Digite a altura(em metros): ");
        altura = input.nextDouble();
        imc = peso / (altura * altura);
        System.out.println("O indice de massa corporal é: " + imc);
        if(imc > 25){
            acimaPeso = true;
            System.out.println("Acima do Peso: " + acimaPeso);
        }
        else{
            acimaPeso = false;
            System.out.println("Acima do Peso: " + acimaPeso);
        }
    }
}
