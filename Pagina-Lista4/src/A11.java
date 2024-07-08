
package Lista03;

import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seg, min, hr, mais;
        System.out.println("Digite a hora (0 a 23): ");
        hr = input.nextInt();
        System.out.println("Digite os minutos (0 a 59): ");
        min = input.nextInt();
        System.out.println("Digite os segundos (0 a 59): ");
        seg = input.nextInt();
        mais = seg + 1;
        if(mais == 60){
            seg = 00;
            min += 1;
            if(min == 60){
                min = 00;
                hr += 1;
                if(hr == 24){
                    hr = 00;
                }
            }
            System.out.println("Hora: " + hr + ":" + min + ":" + seg);
        }
        else{
            System.out.println("Hora: " + hr + ":" + min + ":" + seg);
        }
    }
}
