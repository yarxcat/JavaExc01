package excbasic;

import java.util.Scanner;
public class TipoDeCombustivel {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("1. Alcool \n 2. Gasolina \n 3. Disel \n 4. Fim");

        System.out.print("Informe o combustivel abastecido: ");
        int num = input.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int disel = 0;

        while( num != 4){

            if (num == 1){
                alcool = alcool + 1;
            }
            else if (num == 2) {
                gasolina = gasolina + 1;
            }
            else if (num == 3) {
                disel = disel + 1;
            }
            System.out.print("Informe o combustivel abastecido: ");
            num = input.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ alcool);
        System.out.println("Gasolina: "+ gasolina);
        System.out.println("Disel: "+ disel);

        input.close();
    }
}
