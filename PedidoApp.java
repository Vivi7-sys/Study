import java.time.LocalDateTime;

public class PedidoApp {
    public static void main(String[] args) {
        Pedido ped1 = new Pedido(1, LocalDateTime.now(), "jao");

        ped1.adicionarItem("bola de basquete", 400, 1);
        ped1.adicionarItem("Raquete", 1200, 2);
        ped1.adicionarItem("Luva de boxe", 1500, 1);

        System.out.println("Valor total do pedido: " + ped1.getValor());
        ped1.exibirItens();
    }
}
