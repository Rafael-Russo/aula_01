package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Conta;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setNumero(10);
        c.setSaldo(100.0);

//        c.depositar(50.0);


        Conta c2 = new Conta();
        c2.setNumero(90);
        c2.setSaldo(500.0);

        System.out.println(c.getSaldo());
    }
}
