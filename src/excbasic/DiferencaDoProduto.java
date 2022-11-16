package excbasic;

import java.util.Scanner;
public class DiferencaDoProduto {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Calculando a diferença do produto de A e B pelo produto de C e D.");
    System.out.print("A: " );
    int a = input.nextInt();
    System.out.print("B: ");
    int b = input.nextInt();
    System.out.print("C: ");
    int c = input.nextInt();
    System.out.print("D: ");
    int d = input.nextInt();

    int diferenca = (a*b)-(c*d);
    System.out.println("Diferença ="+ diferenca);
    input.close();

    }
}
