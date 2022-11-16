package excbasic;

import java.util.Scanner;
import java.util.Locale;

public class CalculoDeRaio {

    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    double p = 3.14159;
    System.out.println("Calculando a area do circulo..");
    System.out.print("Digite o valor do raio: ");
    double raio = input.nextDouble();

    double area = (p)*Math.pow(raio,2);
    System.out.printf("A area é de %.4f", area);

    input.close();

    }
}
