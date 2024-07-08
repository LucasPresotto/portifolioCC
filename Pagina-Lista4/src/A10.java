
package Lista03;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;
        System.out.println("Digite o primeiro lado do triangulo: ");
        x = input.nextInt();
        System.out.println("Digite o segundo lado do triangulo: ");
        y = input.nextInt();
        System.out.println("Digite o terceiro lado do triangulo: ");
        z = input.nextInt();
        if(x > y+z || y > x+z || z > x+y){
            System.out.println("Não é um triangulo");
        }
        else{
            if(x == y && y == z){
                System.out.println("Tipo de trinagulo: Equilatero");
            }
            else if(x == y || y == z || z == x){
                System.out.println("Tipo de trinagulo: Isócele");
            }
            else{
                System.out.println("Tipo de trinagulo: Escaleno");
            }
        }
    }
}
