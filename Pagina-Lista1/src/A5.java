package Lista01;

import java.util.Scanner;


public class A5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, altura, area, perimetro;
        System.out.println("Digite a base do retangulo: ");
        base = input.nextInt();
        System.out.println("Digite a altira do retangulo: ");
        altura = input.nextInt();
        area = base * altura;
        perimetro = (base * 2) + (altura * 2);
        System.out.println("A area do retangulo e: " + area + " e o perimetro e: " + perimetro);
    }
}
