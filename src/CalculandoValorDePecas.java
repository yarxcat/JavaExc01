import java.util.Scanner;
import java.util.Locale;
public class CalculandoValorDePecas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        System.out.print("Informe o codigo da primera peça: ");
        //int p1 = input.nextInt();
        System.out.print("Numero de peças: ");
        int nump1 = input.nextInt();
        System.out.print("Informe o valor unitario da peça: ");
        double valu1 = input.nextDouble();

        System.out.print("Informe o codigo da segunda peça: ");
        //int p2 = input.nextInt();
        System.out.print("Numero de peças: ");
        int nump2 = input.nextInt();
        System.out.print("Informe o valor unitario da peça: ");
        double valu2 = input.nextDouble();

        double valor_p1 = nump1*valu1;
        double valor_p2 = nump2*valu2;
        double valor_total = valor_p1+valor_p2;
        System.out.printf("VALOR A PAGAR: %.2f",valor_total);

        input.close();
    }
}
