package br.com.sodexo.mbp.encapsulamento;

public class Main {
  public static void main(String[] args) {
    var produto = new Produto("Notebook", 2500.00);

    System.out.println(produto.getNome());
    System.out.println("Preço: " + produto.getPreco());

    produto.setPreco(0);
    System.out.println("Novo Preço: " + produto.getPreco());
  }
}
