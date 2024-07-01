
package Lista03;

import java.util.Scanner;

public class A03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, altura, imc;
        System.out.println("Digite o peso(em kg): ");
        peso = input.nextDouble();
        System.out.println("Digite a altura(em metros): ");
        altura = input.nextDouble();
        imc = peso / (altura * altura);
        System.out.println("O indice de massa corporal é: " + imc);
        if(imc < 20){
            System.out.println("Magro");
        }
        else if(imc >= 20 && imc < 25){
            System.out.println("Normal");
        }
        else if(imc >= 25 && imc <= 30){
            System.out.println("Sobrepeso");
        }
        else if(imc > 30){
            System.out.println("obeso");
        }
    }
}
