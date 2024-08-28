package br.com.sodexo.mbp.heranca;

public class Main {
  public static void main(String[] args) {
    var carro = new Carro("VW", "Gol", 4);

    carro.acelerar();

    carro.exibirInformacoes();

    var veiculo = new Veiculo("honda", "fit");
    veiculo.acelerar();
  }
}
