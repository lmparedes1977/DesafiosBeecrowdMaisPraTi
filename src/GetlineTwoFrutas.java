//https://www.beecrowd.com.br/judge/pt/problems/view/1217/11?origem=

import java.util.Scanner;

public class GetlineTwoFrutas {

    private static Scanner sc = new Scanner(System.in);

    public static void calculaFrutas() {

        double totalGasto = 0;
        double mediaGasto = 0;
        double totalFrutas = 0;
        double mediaFruasDia = 0;


        System.out.print("Digite o número de dias a serem analisados: ");
        int nEntradas = sc.nextInt();
        while (nEntradas < 1 || nEntradas > 365) {
            System.out.print("Invalido. Minimo 1, máximo 365. Digite o número de dias: ");
            nEntradas = sc.nextInt();
        }
        int[] nFrutasDia = new int[nEntradas];


        for (int i = 0; i < nEntradas; i++) {
            boolean sucesso = false;
            while (!sucesso) {
                try {
                    System.out.println("Valor gasto no dia " + (i + 1) + ": ");
                    double gasto = sc.nextDouble();
                    if (gasto < 0.10 || gasto > 20.0) {
                        throw new Exception("Gasto Diário precisa estar entre R$ 0,10 e R$ 20,00");
                    }
                    totalGasto += gasto;
                    System.out.println("Frutas compradas no dia " + (i + 1) + ": ");
                    sc.next();
                    String frutas = sc.nextLine();
                    nFrutasDia[i] = frutas.split(" ").length;
                    totalFrutas += nFrutasDia[i];
                    sucesso = true;
                } catch (Exception e) {
                    System.out.println("Entrada Inválida " + e);
                }
            }
        }
        int ndia = 1;
        for (int dia : nFrutasDia) {
            System.out.println("day " + ndia + ": " + dia + " Kg");
            ndia += 1;
        }
        mediaGasto = totalGasto / nEntradas;
        mediaFruasDia = totalFrutas / nEntradas;
        System.out.printf("mediaFruasDia %.2f by day\n", mediaFruasDia);
        System.out.printf("R$ %.2f by day\n", mediaGasto);
    }
}