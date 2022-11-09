import java.util.Scanner;
public class Multiplos {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Descobrindo se dois numeros são multiplos entre si");
      System.out.print("Digite o primeiro numero: ");
      int num1 = input.nextInt();
      System.out.print("Digite o segundo numero: ");
      int num2 = input.nextInt();

      if(num1 > num2){
          String result = num1 % num2 == 0 ? "São multiplos" : "Não são multiplos";
          System.out.println(result);
      }
      if (num2 > num1){
        String resulta = num2 % num1 == 0 ? "São multiplos" : "Não são multiplos";
        System.out.println(resulta);
      }

      input.close();
    }
}
