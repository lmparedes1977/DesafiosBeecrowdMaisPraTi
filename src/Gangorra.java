import java.util.Scanner;

public class Gangorra {

    public static void testaGangorra(){
        System.out.println("Entre com o Peso 1: ");
        int p1 = testaEntrada();
        System.out.println("Entre com o Comprimiento 1: ");
        int c1 = testaEntrada();
        System.out.println("Entre com o Peso 2: ");
        int p2 = testaEntrada();
        System.out.println("Entre com o Comprimiento 2: ");
        int c2 = testaEntrada();

        if (p1*c1 == p2*c2){
            System.out.println("0");
        }
        if (p1*c1 > p2*c2){
            System.out.println("-1");
        }
        if (p1*c1 < p2*c2){
            System.out.println("1");
        }
    }

    private static int testaEntrada() {
        Scanner sc = new Scanner(System.in);
        int ent = sc.nextInt();
        while (ent < 10 || ent > 100) {
            System.out.println("Entrada inválida. Entre com nr. inteiro entre 10 e 100: ");
            ent = sc.nextInt();
        }
        return ent;
    }


}
