package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Cliente;

public class TestaConta {
    public static void main(String[] args) {
        System.out.println();

        ContaCorrente cc = new ContaCorrente(1001, 707);
        ContaPoupanca cp = new ContaPoupanca(2002, 150);


        Cliente jeziel = new Cliente();
        

        cc.setTitular(jeziel);

        cc.deposita(100);
        cp.deposita(100);

        cc.transfere(15, cp);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());


    }
}