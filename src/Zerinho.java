//https://www.beecrowd.com.br/judge/pt/problems/view/1467/11?origem=1

import java.util.Scanner;
public class Zerinho {
    static int ali;
    static int bet;
    static int cla;
    static String vencedor;
    static Scanner sc = new Scanner(System.in);
    public static void jogarZerinho(){
        System.out.print("Jogada da Alice [0 ou 1]: ");
        ali = trataEntrada(sc.nextInt());
        System.out.print("Jogada do Beto [0 ou 1]: ");
        bet = trataEntrada(sc.nextInt());
        System.out.print("Jogada da Clara [0 ou 1]: ");
        cla = trataEntrada(sc.nextInt());
        vencedor = testaVencedor(ali, bet, cla);
        System.out.println(vencedor);

    }
    private static int trataEntrada(int nextInt) {
        int entrada = nextInt;
        while (entrada != 0 && entrada != 1){
            System.out.print("Entrada inválida. Digite 0 (zero) ou 1 (um): ");
            entrada = sc.nextInt();
        }
        return entrada;
    }
    private static String testaVencedor(int ali, int bet, int cla) {
        if (ali == bet && ali != cla) {
            return "Vitória da Clara!";
        }
        if (ali == cla && ali != bet){
            return "Vitória do Beto!";
        }
        if (cla == bet && ali != cla){
            return "Vitória da Alice!";
        }
        return "Empate! Todos mostraram " + ali;
    }
}