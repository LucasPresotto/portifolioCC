
package Lista03;

import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alt, peso = 0;
        char sexo;
        System.out.println("Digite a altura: ");
        alt = input.nextDouble();
        System.out.println("Digite o sexo (M ou F): ");
        sexo = input.next().charAt(0);
        if(sexo == 'M'){
            peso = (72.7 * alt) - 58;
            System.out.println("O peso ideal e de " + peso + "Kg");
        }
        else if(sexo == 'F'){
            peso = (62.1 * alt) - 44.7;
            System.out.println("O peso ideal e de " + peso + "Kg");
        }
        else{
            System.out.println("Sexo nao valido!");
        }
    }
}
