package excbasic;

import java.util.Scanner;
import java.util.Locale;
public class PlanoCartesiano {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor x: ");
        double x = input.nextDouble();
        System.out.print("Digite o valor de y: ");
        double y = input.nextDouble();

        if (x == 0.0 && y == 0.0){
            System.out.println("Origem");
        }
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        input.close();
    }
}
