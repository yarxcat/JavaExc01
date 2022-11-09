import java.util.Scanner;
import java.util.Locale;
public class Intervalos {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor para saber em qual dos intervalos ele se encontra: \n" +
                "([0, 25]), ([25, 50]), ([50, 75]), ([75, 100]) : " );
        double num = input.nextDouble();

        if(num < 0.0 || num > 100.0){
            System.out.println("Fora do intervalo");
        }
        else if (num <= 25.0) {
            System.out.println("Intervalo [0,25]");
        }
        else if (num <= 50.0) {
            System.out.println("Intervalo [25,50]");
        }
        else if (num <= 75.0) {
            System.out.println("Intervalo [50,75]");
        }
        else {
            System.out.println("Intervalo [75,100]");
        }

        input.close();
    }
 }
