import java.util.Scanner;
public class CalculoHora {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Informe a hora inicial do jogo: ");
        int horai = input.nextInt();
        System.out.print("Infome o horario de termino do jogo: ");
        int horaf = input.nextInt();

        int duracao;
        if(horai < horaf){
            duracao = horaf - horai;
        }
        else {
            duracao = 24 - horai + horaf;
        }

        System.out.println("O JOGO DUROU "+duracao+" HORA(s)");

        input.close();
    }
}
