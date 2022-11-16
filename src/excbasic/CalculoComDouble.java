package excbasic;

import java.util.Locale;
import java.util.Scanner;

public class CalculoComDouble {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 3 valores para o calculo do triangulo, trapezio, circulo quadrado e retangulo..");
        System.out.print("A: ");
        double a = input.nextDouble();
        System.out.print("B: ");
        double b = input.nextDouble();
        System.out.print("C: ");
        double c = input.nextDouble();

        //a área do triângulo retângulo que tem A por base e C por altura.
        double triang =(a*c)/2;
        System.out.printf("TRIANGULO: %.3f \n",triang);

        // a área do círculo de raio C. (pi = 3.14159)
        double circ = (c)*Math.pow(3.14159,2);
        System.out.printf("CIRCULO: %.3f \n",circ);

        // a área do trapézio que tem A e B por bases e C por altura.
        double trap = 0.5*c*(a+b);
        System.out.printf("TRAPEZIO: %.3f \n",trap);

        //a área do quadrado que tem lado B.
        double quad = Math.pow(b,2);
        System.out.printf("QUADRADO: %.3f \n",quad);

        // a área do retângulo que tem lados A e B
        double retan = a*b;
        System.out.printf("RETANGULO: %.3f \n",retan);

        input.close();
    }
}
