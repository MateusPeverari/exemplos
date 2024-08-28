package br.com.sodexo.mbp.excecoes;

import java.util.List;

public class Busca {
  public static int buscarValor(List<Integer> lista, int valorProcurado) throws NaoEncontradaException {
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) == valorProcurado) {
        return i; // Retorna o índice do valor encontrado
      }
    }
    // Lança exceção se o valor não for encontrado
    throw new NaoEncontradaException("Valor " + valorProcurado + " não encontrado na lista.");
  }
}
