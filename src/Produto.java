public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    public static int totalProdutos = 0;

    public String getNome(){ return nome;}
    public double getPreco(){ return preco;}
    public int getQuantidadeEstoque(){ return quantidadeEstoque;}
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        if(preco < 0){
            System.out.println("Valor Invalído!");
        }
        else {
            this.preco = preco;
        }
    }
    public Produto(){
        this("Produto sem nome", 0.0, 0);
    }
    public Produto(String nome, double preco, int QuantidadeInicial){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = QuantidadeInicial;
        totalProdutos++;
    }
    static int getTotalProdutos(){
        return Produto.totalProdutos;
    }
    public void vender(int quantidade){
        if(quantidade > 0 && quantidade <= this.quantidadeEstoque){
            this.quantidadeEstoque -= quantidade;
        }
        else {
            System.out.println("Estoque insuficiente!");
        }
    }
    public void repor(int quantidade){
        this.quantidadeEstoque += quantidade;
    }
    public void exibirDados(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }
}

