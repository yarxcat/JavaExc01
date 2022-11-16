package poo.application;

import java.util.Locale;
import java.util.Scanner;

import entires.Triangle;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("digite os valores do triangulo x: ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();

        System.out.println("Digite os valore do triangulo y: ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Area do triangulo x: "+areaX);
        System.out.println("Area do triangulo y: "+areaY);

        if (areaX > areaY) {
            System.out.println("Maior area: X");
        }
        else {
            System.out.println("Maior area: Y");
        }

        input.close();
    }
}
