import java.util.Arrays;

public class SelecaoDireta {
    public static void main(String[] args) {
        int[] numeros = {12, 24, 77, 69, 0};

        for (int i = 0; i < numeros.length - 1; i++) {
            int menor = i;
            for (int j = i; j < numeros.length; j++) {
                // O if serve para receber o menor indice
                if (numeros[j] < numeros[menor]) {
                    menor = j;
                }
            }
            int aux = numeros[i];
            numeros[i] = numeros[menor];
            numeros[menor] = aux;
        }
        System.out.println("|VETOR EM ORDEM CRESCENTE|");
        System.out.println(Arrays.toString(numeros));

    }
}