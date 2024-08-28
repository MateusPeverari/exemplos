package br.com.sodexo.mbp.heranca;

class Veiculo {
  private String marca;
  private String modelo;

  public Veiculo(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  public void acelerar() {
    System.out.println("O veículo está acelerando.");
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }
}