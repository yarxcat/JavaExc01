package poo.application;

import  java.util.Locale;
import java.util.Scanner;
import entires.DadosPessoa;

public class SalarioDoFuncionario {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DadosPessoa dados = new DadosPessoa();

        System.out.print("Nome: ");
        dados.name = input.nextLine();
        System.out.print("Salario bruto: ");
        dados.salarioBruto = input.nextDouble();
        System.out.print("Impostos: ");
        dados.imposto = input.nextDouble();

        System.out.println("Funcionario: "+ dados);
        System.out.println();
        System.out.println("Qual a porcentagem de aumento? ");
        double percentage = input.nextDouble();
        dados.aumentoSalario(percentage);

        System.out.println();
        System.out.println("Atualização de dados: "+ dados);
        input.close();


    }
}
