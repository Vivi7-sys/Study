public class itemPedido {
    private  String produto;
    private float valor;
    private int quantidade;


    public itemPedido() {
        this("sem produto", 0, 0);
    }

    public itemPedido(String produto, int quantidade, float valor) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
