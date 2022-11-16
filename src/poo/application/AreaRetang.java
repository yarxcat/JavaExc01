package poo.application;

import java.util.Scanner;
import java.util.Locale;
import entires.Rectangle;

public class AreaRetang {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.println("Digite a largura e altura do retangulo: ");
        rect.largura = input.nextDouble();
        rect.altura = input.nextDouble();

        System.out.printf("AREA = %.2f \n", rect.area());
        System.out.printf("PERIMETRO = %.2f \n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f \n", rect.diagonal());

        input.close();
    }
}
