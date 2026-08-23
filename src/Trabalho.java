import java.util.Arrays;
import java.util.Random;

public class Trabalho{
    public static void selecaoDireta(int[] vetor){
        for(int i=0; i < vetor.length - 1; i++){
            int menor=i;
            for(int j= i + 1; j< vetor.length; j++){
                if (vetor[j] < vetor[menor]){
                    menor = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }
    }
    public static void bubbleSort(int[] vetor){
        for(int i= 0; i < vetor.length - 1; i++){
            for(int j = 0; j < vetor.length - 1 - i; j++){
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
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
        int[] copia = new int[10000];

        for (int i = 0; i < copia.length; i++) {
            copia[i] = gerador.nextInt(10000);
        }
        int[] vet1 = Arrays.copyOf(copia, copia.length);
        int[] vet2 = Arrays.copyOf(copia, copia.length);
        int[] vet3 = Arrays.copyOf(copia, copia.length);

        long inicioBubble = System.nanoTime();
        bubbleSort(vet1);
        long fimBubble = System.nanoTime();
        long duracaoBubble = fimBubble - inicioBubble;
        long duracaoMs = duracaoBubble / 1_000_000;
        System.out.println("Tempo do Bubble Sort: " + duracaoMs + " ms");

        long inicioInsercao = System.nanoTime();
        insercaoDireta(vet2);
        long fimInsercao = System.nanoTime();
        long duracaoInsercao = fimInsercao - inicioInsercao;
        long duracaoInsercao_Ms = duracaoInsercao / 1_000_000;
        System.out.println("Tempo do Insertion Sort: " + duracaoInsercao_Ms + " ms");

        long inicioSelecao = System.nanoTime();
        selecaoDireta(vet3);
        long fimSelecao = System.nanoTime();
        long duracaoSelecao = fimSelecao - inicioSelecao;
        long duracaoSelecao_Ms = duracaoSelecao / 1_000_000;
        System.out.println("Tempo do Selection Sort: " + duracaoSelecao_Ms + " ms");

        System.out.println("\nVETORES ORDENADOS");
        System.out.println(Arrays.toString(Arrays.copyOfRange(vet1, 0, 10000)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(vet2,0,10000)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(vet3, 0, 10000)));
    }
}