import java.util.Scanner;

public class TopN {

    public static void consultaCategoriaTop(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Pof favor, digita a tua colocação: ");
        int colocacao = sc.nextInt();

        if (colocacao == 1){
            System.out.println("Ficaste no TOP 1!");
        } else if (colocacao <= 3) {
            System.out.println("Ficaste no TOP 3!");
        } else if (colocacao <= 5) {
            System.out.println("Ficaste no TOP 5!");
        } else if (colocacao <= 10) {
            System.out.println("Ficaste no TOP 10!");
        } else if (colocacao <= 25) {
            System.out.println("Ficaste no TOP 25!");
        } else if (colocacao <= 50) {
            System.out.println("Ficaste no TOP 50!");
        } else if (colocacao <= 100) {
            System.out.println("Ficaste no TOP 100!");
        }
        System.out.println("PARABÉNS!");
    }

}
