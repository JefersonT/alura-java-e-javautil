package br.com.bytebank.banco.test.util.comparator;

import br.com.bytebank.banco.modelo.Conta;

import java.util.Comparator;

//Classe criada para definir uma forma de Compara determiado objeto, para usar em funçoes List.sort(comparator)
public class TitularDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2);
    }
}