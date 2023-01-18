import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Arrays;
import java.util.Scanner;

public class AlarmeDespertador {

    private static Scanner sc = new Scanner(System.in);
    public static void calculaMinutos(){
        Integer[] horarios = recebeDados();
        int delta_minutos =  1440 - (horarios[0] * 60 + horarios[1]) + horarios[2] * 60 + horarios[3];
        if (delta_minutos > 1440){
            System.out.println("Vocês descançará " + (delta_minutos - 1440));
        } else{
            System.out.println("Vocês descançará " + delta_minutos);
        }


    }

    private static Integer[] recebeDados() {
        boolean sucesso = false;
        Integer[] dados = new Integer[4];
        while (!sucesso){
            try{
                System.out.println("Digite a hora(0 a 23) e minuto(0 a 59), inicias e finais, no formato H M H M: ");
                String entrada = sc.nextLine();
                String[] lista = entrada.split(" ");
                for (int i = 0; i < 4; i++){
                    dados[i] =  Integer.parseInt(lista[i]);
                }
                if (dados[0] > 23 || dados[2] > 23 || dados[1] > 59 || dados[3] > 59){
                    throw new Exception("Deu ruim");
                }
                sucesso = true;
            } catch (Exception e) {
                System.out.println("Entrada Inválida. Use apenas UM espaço entre os dados.");
            }
        }
        return dados;
    }





}
