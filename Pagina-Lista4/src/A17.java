
package Lista03;

import java.util.Scanner;

public class A17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, pesoN;
        String planeta;
        System.out.println("Digite o peso na Terra: ");
        peso = input.nextDouble();
        System.out.println("Digite o planeta: ");
        planeta = input.nextLine();
        switch(planeta){
            case "Mercurio":
                pesoN = 0.37 * peso;
                System.out.println("O peso em Mercurio e " + pesoN);
                break;
            case "Venus":
                pesoN = 0.88 * peso;
                System.out.println("O peso em Venus e " + pesoN);
                break;
            case "Marte":
                pesoN = 0.38 * peso;
                System.out.println("O peso em Marte e " + pesoN);
                break;
            case "Jupiter":
                pesoN = 1.15 * peso;
                System.out.println("O peso em Jupiter e " + pesoN);
                break;
            case "Saturno":
                pesoN = 0.37 * peso;
                System.out.println("O peso em Saturno e " + pesoN);
                break;
            case "Urano":
                pesoN = 1.17 * peso;
                System.out.println("O peso em Urano e " + pesoN);
                break;
            case "Netuno":
                pesoN = 1.18 * peso;
                System.out.println("O peso em Netuno e " + pesoN);
                break;
            
        }
    }
}
