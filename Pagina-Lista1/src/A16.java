
package Lista01;

import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double salario, c1, c2, salarioFinal;
       salario = 1500.0;
       c1 = (2 * 200.0 / 100) + 200;
       c2 = (2 * 120.0) / 100 + 120;
       salarioFinal = salario - c1 - c2;
       System.out.println("Restará do salario do João R$" + salarioFinal);
    }
    
    
}
