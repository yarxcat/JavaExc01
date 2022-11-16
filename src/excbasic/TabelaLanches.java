package excbasic;

import java.util.Scanner;
import java.util.Locale;
public class TabelaLanches {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Tabela de lanches \n" +
                "1     Cachorro quente     R$4.00 \n" +
                "2     X-Salada            R$4.50 \n" +
                "3     X-Bacon             R$5.00 \n" +
                "4     Torrada Simples     R$2.00 \n" +
                "5     Refrigerante        R$1.50 \n");


        System.out.print("Informe o numero do item desejado na tabela: ");
        int item = input.nextInt();
        System.out.print("Informe a quantidade: ");
        int quant = input.nextInt();

        double total = 0;
        if(item == 1){
            total = quant*4;
        } 
        else if (item == 2) {
            total = quant*4.50;
        } 
        else if (item == 3) {
            total = quant*5;
        } 
        else if (item == 4) {
            total = quant*2;
        } 
        else if (item == 5) {
            total = quant*1.50;
        }
        else {
            System.out.println("Este item nao está no cardapio.");
        }
        
        System.out.printf("Total: R$ %.2f", total);


        input.close();

    }
}
