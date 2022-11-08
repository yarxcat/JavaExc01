import java.util.Scanner;
import java.util.Locale;
public class SalarioPorHora {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o numero do funcionario: ");
        int funcionario = input.nextInt();
        System.out.print("Digite o valor da hora trabalhada: ");
        double valorh = input.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        int horas = input.nextInt();

        double salario = horas*valorh;
        System.out.println("NUMBER = "+funcionario);
        System.out.printf("SALARY = %.2f", salario);
        input.close();
    }
}
