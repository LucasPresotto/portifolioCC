
package Lista02;

import java.util.Scanner;

public class A07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int altura, largura, comprimento, areaPiso, areaParede, volume;
        boolean arP = false, arM = false, arG = false;
        System.out.println("Digite a altura da sala: ");
        altura = input.nextInt();
        System.out.println("Digite a largura da sala: ");
        largura = input.nextInt();
        System.out.println("Digite o comprimento da sala: ");
        comprimento = input.nextInt();
        areaPiso = largura * comprimento;
        areaParede = (altura * largura + altura * comprimento) * 2;
        volume = altura * largura * comprimento;
        System.out.println("Area do Piso: " + areaPiso);
        System.out.println("Volume da sala: " + volume);
        System.out.println("Area das paredes: " + areaParede);
        if(volume < 100){
            arP = true;
            System.out.println("Ar pequeno: " + arP);
            System.out.println("Ar medio: " + arM);
            System.out.println("Ar grande: " + arG);
        }
        else if(volume >= 100 && volume <=500){
            arM = true;
            System.out.println("Ar pequeno: " + arP);
            System.out.println("Ar medio: " + arM);
            System.out.println("Ar grande: " + arG);
        } else{
            arG = true;
            System.out.println("Ar pequeno: " + arP);
            System.out.println("Ar medio: " + arM);
            System.out.println("Ar grande: " + arG);
        }
    }
}
