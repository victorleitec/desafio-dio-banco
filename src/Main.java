public class Main {
    public static void main(String[] args) {
        Cliente fulano = new Cliente();
        fulano.setNome("Fulano");
        Cliente cicrano = new Cliente();
        cicrano.setNome("Cicrano");

        Conta cc = new ContaCorrente(fulano);
        Conta poupanca = new ContaPoupanca(cicrano);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
