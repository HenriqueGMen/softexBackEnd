package Decorator;

import Component.Sanduiche;

public abstract class SanduicheDecorator extends Sanduiche{

  public Sanduiche sanduiche;
  
  public String getDescricao() {
    return descricao;
  }

  public double getPreco() {
    return preco;
  }

}
