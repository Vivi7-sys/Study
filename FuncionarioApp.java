public class FuncionarioApp {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Escravo", 10);
        System.out.println("Dados do escravo");
        funcionario.exibirDados();
        System.out.println();

        Gerente gerente = new Gerente("Patrão", 5000, 1000);
        System.out.println("Dados do patrão");
        gerente.exibirDados();
        System.out.println();

        Vendedor vendedor = new Vendedor("Clt", 1621, 3);
        System.out.println("Dados do clt fudido");
        vendedor.exibirDados();

    }
}
