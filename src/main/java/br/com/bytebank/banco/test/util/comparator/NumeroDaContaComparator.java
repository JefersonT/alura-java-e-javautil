package br.com.bytebank.banco.test.util.comparator;

import br.com.bytebank.banco.modelo.Conta;

import java.util.Comparator;

public class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getNumero(), c2.getNumero());
    }
}