package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(22, 33);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22, 44);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("---------------");

        for (Object oRef : lista){
            System.out.println(oRef);
        }

    }
}