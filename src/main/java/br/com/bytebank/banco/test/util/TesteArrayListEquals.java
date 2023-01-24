package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        //<Conta> São os Generics
        List<Conta> lista = new ArrayList<>();

        Conta cc1 = new ContaCorrente(22, 22);
        Conta cc2 = new ContaCorrente(22, 22);

        lista.add(cc1);

        boolean igual = cc1.equals(cc2);
        System.out.println(igual); //deve imprimir true

        boolean existe = lista.contains(cc2);
        System.out.println("Já exixte? " + existe);

        for (Conta oRef : lista){
            System.out.println(oRef);
        }

    }
}