package br.com.sodexo.mbp.abstracao;

import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    var cachorro = new Cachorro();
    var gato = new Gato();

    cachorro.som();
    gato.som();
    cachorro.dormir();
    gato.dormir();

    var testeMap = new HashMap<String, Integer>();
    testeMap.put("Teclado", 10);
    testeMap.put("Mouse", 0);

    System.out.println(testeMap.get("Mouse"));

    testeMap.replace("Mouse", 1);

    System.out.println(testeMap.get("Mouse"));

    List<String> teste = null;

    teste.get(0);
  }
}
