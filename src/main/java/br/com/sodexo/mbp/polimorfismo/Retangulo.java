package br.com.sodexo.mbp.polimorfismo;

public class Retangulo implements Forma {
  public void desenhar() {
    System.out.println("Desenhando um Retangulo.");
  }

  public void desenhar(int tamanho) {
    System.out.println("Desenhando um Retangulo de tamanho: " + tamanho);
  }
}
