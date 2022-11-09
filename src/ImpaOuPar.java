import java.util.Scanner;
public class ImpaOuPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero para saber se é ímpar ou par: ");
        int numero = input.nextInt();

        //se o numero dividio por 2 for igual a ZERO o numero é par : se nao, impar
        String resultado = numero % 2 == 0 ? "O número é par!" : "O número é ímpar!";
        System.out.println(resultado);


    }
}