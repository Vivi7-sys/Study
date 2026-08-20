import java.util.Arrays;
import java.util.Random;

public class InsercaoDireta {
    public static void insercaoDireta(int[] vetor){
        for(int i = 1; i < vetor.length; i++){
            int atual = vetor[i];
            int j;
            for(j = i - 1; j >= 0 && vetor[j] > atual; j--){
                vetor[j + 1] = vetor[j];
            }
            vetor[j + 1] = atual;
        }
    }
    public static void main(String[] args) {
        Random gerador = new Random();
        int[] copia = new int[1000];

        for (int i = 0; i < copia.length; i++) {
            copia[i] = gerador.nextInt(10000);
        }
        int[] vet1 = Arrays.copyOf(copia, copia.length);
        insercaoDireta(vet1);
        System.out.println(Arrays.toString(Arrays.copyOfRange(vet1, 0, 1000)));

    }
}
