package br.com.sodexo.mbp.excecoes;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    var listaNumeros = new ArrayList<Integer>();

    listaNumeros.add(1);
    listaNumeros.add(2);
    listaNumeros.add(3);
    listaNumeros.add(4);

    try {
      System.out.println(Busca.buscarValor(listaNumeros, 20));
    } catch (NaoEncontradaException exception) {
      System.out.println(exception.getMessage());
    }
  }
}
