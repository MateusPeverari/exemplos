package br.com.sodexo.mbp.polimorfismo;

public class Main {
  public static void main(String[] args) {
  var circulo = new Circulo();
  var retangulo = new Retangulo();

  circulo.desenhar();
  retangulo.desenhar();

  retangulo.desenhar(10);
}
}
