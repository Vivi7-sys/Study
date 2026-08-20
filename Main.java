import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        int[] vetPar = new int[50];
        int[] vetImpar = new int[50];
        Random gerador = new Random();
        System.out.println("Vetor Pares: ");

        /**for (int i = 0; i < vet.length; i++) {
            vet[i] = gerador.nextInt(50);
            System.out.print(vet[i]+ " ");
        }*/

        for (int i = 0; i < vetPar.length; i++) {
            vetPar[i] = gerador.nextInt(50);
            if(vetPar[i] % 2 == 0){
                System.out.print(vetPar[i] + " " );
            }
        }
        System.out.println("\nVetor Impares:");
        for (int i = 0; i < vetImpar.length; i++) {
            vetImpar[i] = gerador.nextInt(50);
            if(vetImpar[i] % 2 != 0){
                System.out.print(vetImpar[i] + " " );
            }
        }



    }
}