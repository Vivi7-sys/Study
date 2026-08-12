public class ProdutoApp {
    public static void main(String[] args){
        Produto produto1 = new Produto("bisteca", 30, 200);
        Produto produto2 = new Produto("ketchup", 15, 150);
        Produto produto3 = new Produto();

        produto1.vender(10);
        produto2.vender(5);
        produto1.repor(8);
        produto1.exibirDados();
        produto2.exibirDados();
        produto3.exibirDados();
        System.out.println("\nTotal de Produtos: " + Produto.getTotalProdutos());

    }
}
