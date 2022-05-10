public class TestaConta {
    
    public static void main(String[] args) {
        System.out.println();

        ContaCorrente cc = new ContaCorrente(1001, 707);
        ContaPoupanca cp = new ContaPoupanca(2002, 150);


        Cliente jeziel = new Cliente("Jeziel BA", 707150, "Estudante");
        

        cc.setTitular(jeziel);

        cc.deposita(100);
        cp.deposita(100);

        cc.transfere(15, cp);


    }
}