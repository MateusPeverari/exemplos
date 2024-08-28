package br.com.sodexo.mbp.heranca;

class Carro extends Veiculo {
  private int numeroDePortas;

  public Carro(String marca, String modelo, int numeroDePortas) {
    super(marca, modelo);
    this.numeroDePortas = numeroDePortas;
  }

  public void exibirInformacoes() {
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Número de Portas: " + numeroDePortas);
  }
}
