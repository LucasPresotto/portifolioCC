
package Lista02;

import java.util.Scanner;

public class A17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantParcel, parcelasPag;
        double valorParcel, valorPago, valorResta;
        System.out.println("Digite a quantidade de parcelas do consorcio: ");
        quantParcel = input.nextInt();
        System.out.println("Digite a quantidade de parcelas ja pagas: ");
        parcelasPag = input.nextInt();
        System.out.println("Digite o valor de cada parcela: ");
        valorParcel = input.nextDouble();
        valorPago = parcelasPag * valorParcel;
        valorResta = (quantParcel - parcelasPag) * valorParcel;
        System.out.println("Voce ja pagou R$" + valorPago + " e ainda resta pagar R$" + valorResta);
    }
}
