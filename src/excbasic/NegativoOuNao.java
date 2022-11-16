package excbasic;

import java.util.Scanner;
public class NegativoOuNao {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Verificando se um numero é negativo ou não");
        System.out.print("Digite um numero inteiro: ");
        int num = input.nextInt();

        if(num >= 0){
            System.out.println("NÃO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }
        input.close();
    }
}
