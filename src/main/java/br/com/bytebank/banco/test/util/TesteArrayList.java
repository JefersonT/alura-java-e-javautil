package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {

        //<Conta> São os Generics
        ArrayList<Conta> lista = new ArrayList();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(22, 33);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22, 44);
        lista.add(cc4);

//        Cliente c5 = new Cliente();
//        lista.add(c5);

        for (int i = 0; i < lista.size(); i++){
            Conta oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("---------------");

        for (Conta oRef : lista){
            System.out.println(oRef);
        }

    }
}