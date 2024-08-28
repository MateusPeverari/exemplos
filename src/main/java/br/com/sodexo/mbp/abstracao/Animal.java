package br.com.sodexo.mbp.abstracao;

abstract class Animal {
  abstract void som();

  void dormir() {
    System.out.println("O animal está dormindo.");
  }
}
