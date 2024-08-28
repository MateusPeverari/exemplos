package br.com.sodexo.mbp.encapsulamento;

class Produto {
  private String nome;
  private double preco;

  public String getNome() {
    return "Produto: " + nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    if (preco == 0) {
      System.out.println("Preco não pode ser 0.");
      return;
    }
    this.preco = preco;
  }

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }
}
