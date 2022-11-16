package poo.application;

import java.util.Locale;
import java.util.Scanner;
import entires.DadosAluno;

public class BoletimFinal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DadosAluno aluno = new DadosAluno();

        System.out.print("Digite seu nome: ");
        aluno.name = input.nextLine();

        System.out.println("Digite suas notas: ");
        aluno.nota1 = input.nextDouble();
        aluno.nota2 = input.nextDouble();
        aluno.nota3 =input.nextDouble();

        System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("FALTAM %.2f PONTOS%n", aluno.pontosQueFaltam());
        }
        else {
            System.out.println("PASS");
        }

        input.close();
    }

}
