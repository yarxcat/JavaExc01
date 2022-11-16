package excbasic;

import java.util.Scanner;
public class LeiaNumImoares {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int x = input.nextInt();

        for (int i=1; i<=x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
