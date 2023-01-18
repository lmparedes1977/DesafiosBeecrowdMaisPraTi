import java.util.*;

public class FrequenciaDeNumeros {

    //https://www.beecrowd.com.br/judge/pt/problems/view/1171/11?origem=1

    static Scanner sc = new Scanner(System.in);

    public static void medeFrequencia(){
        int numero_entradas = numeroEntradas();
        int [] entradas = coletaEntradas(numero_entradas);

        HashSet<Integer> conj = new HashSet<>();
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int entrada: entradas){conj.add(entrada);}

        for (int entrada: entradas){mapa.put(entrada, 0);}

        for (int entrada: entradas){mapa.replace(entrada, mapa.get(entrada) + 1);}

        for (int item: conj){
            System.out.println(item + " aparece " + mapa.get(item) + " vez(es);");
        }
    }

    private static int numeroEntradas(){
        System.out.print("Digite com quantos números queres entrar: ");
        int numero_entradas = sc.nextInt();
        return numero_entradas;
    }

    private static int[] coletaEntradas(int n){
        int[] entradas = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Entre com novo valor: ");
            entradas[i] = sc.nextInt();
        }
        return entradas;
    }


}
