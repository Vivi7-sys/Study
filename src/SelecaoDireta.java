import java.util.Arrays;

public class SelecaoDireta {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 12, 5, 8, 15};

        for (int i = 0; i < numeros.length - 1; i++) {  // -1 é porque nao precisa verificar o ultimo número
            int menor = i;
            for (int j = i + 1; j < numeros.length; j++) { // +1 é porque nao precisa vericar o primeiro número
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