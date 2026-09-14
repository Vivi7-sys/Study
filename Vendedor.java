public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularBonus() {
        return totalVendas * 0.10; // 10% do total de vendas
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.print(" Bônus de vendas: " + this.totalVendas);
    }
}
