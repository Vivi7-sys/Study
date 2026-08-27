public class buscaBinaria {
    public static int bin(int[]vet,int inicio, int fim, int num ) {
        int meio;
        if(inicio > fim) {
            return -1;
        }
        else{
            meio = (inicio+fim)/2;
            if(vet[meio] == num)
                return meio;
            else if(num < vet[meio])
                return bin(vet, inicio, meio-1, num);
            else
                return bin(vet, meio+1, fim, num);
        }
    }
    public static void main(String[] args) {
        int[]vetor = {3, 7, 10, 25, 30, 47, 50};

        int result = bin(vetor,0, vetor.length-1, 50);
        System.out.println(result);

    }
}
