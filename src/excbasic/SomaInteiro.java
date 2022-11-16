package excbasic;

import java.util.Scanner;
public class SomaInteiro {

    public static void  main(String[] args){
        //objeto Scanner para capturar o que for digitado
        Scanner input = new Scanner(System.in);

        //mensagem para inserçao do primeiro valor
        System.out.print("Insira o primeiro valor: ");
        //guarda o valor digitado no primeiro valor
        int valor1 = input.nextInt();

        //imprime msg para pedir o se gundo valor
        System.out.print("Insira o segundo valor: ");
        //guarda o segundo valor na variavel
        int valor2 = input.nextInt();

        int soma = valor1 + valor2;
        System.out.print(soma);
        input.close();





    }
}
