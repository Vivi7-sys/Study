import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    private int numeroPedido;
    private LocalDateTime dataPedido;
    private float valor;
    private String cliente;
    // vetor
    private ArrayList<itemPedido> itens;

    public void adicionarItem(String produto, int quantidade, float valor){
        this.itens.add(new itemPedido(produto, quantidade, valor));
        this.valor = this.valor + (valor*quantidade); // altera valor do pedido
    }
    public Pedido(int numeroPedido, LocalDateTime dataPedido, String cliente) {
        this.setNumeroPedido(numeroPedido);
        this.setDataPedido(dataPedido);
        this.valor = 0;
        this.setCliente(cliente);
        this.itens = new ArrayList<itemPedido>();
    }

    public Pedido() {
        this(0, LocalDateTime.now(), "Sem cliente");
    }
    public void exibirItens(){
        System.out.println("Itens do pedido: ");
        for(itemPedido itemPedido : this.itens){
            System.out.println("Produto: " + itemPedido.getProduto() + " Quantidade: " + itemPedido.getQuantidade() + " Valor: " + itemPedido.getValor());
        }
    }


    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
