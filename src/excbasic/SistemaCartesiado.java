package excbasic;

import java.util.Scanner;
public class SistemaCartesiado {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor de X no plano cartesiano: ");
        int x = input.nextInt();
        System.out.print("Digite o valor de Y no plano cartesiano: ");
        int y = input.nextInt();

        while(x != 0 && y != 0){

            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }

            System.out.print("Informe o valor de X no plano cartesiano: ");
            x = input.nextInt();
            System.out.print("Digite o valor de Y no plano cartesiano: ");
            y = input.nextInt();
        }

        input.close();

    }
}
