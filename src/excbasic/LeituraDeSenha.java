package excbasic;

import  java.util.Scanner;
public class LeituraDeSenha {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a senha: ");
        int senha = input.nextInt();

        while (senha != 2002){
            System.out.println("Senha Invalida");
            System.out.print("Digite uma senha valida: ");
            senha = input.nextInt();

        }
        System.out.println("Acesso Permitido");

        input.close();
    }

}
