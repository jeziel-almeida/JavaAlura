public class TestaConta {
    
    public static void main(String[] args) {
        System.out.println();

        ContaCorrente cc = new ContaCorrente(1001, 707);
        ContaPoupanca cp = new ContaPoupanca(2002, 150);

        Cliente jeziel = new Cliente();
        jeziel.setNome("Jeziel");
        jeziel.setCpf(707);

        cc.setTitular(jeziel);

        cc.deposita(100);
        cp.deposita(100);

        cc.transfere(15, cp);

    }
}