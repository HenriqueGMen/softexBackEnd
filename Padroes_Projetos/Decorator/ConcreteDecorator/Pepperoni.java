package ConcreteDecorator;

import Component.Sanduiche;
import Decorator.SanduicheDecorator;

public class Pepperoni extends SanduicheDecorator{

  public Pepperoni(Sanduiche sanduiche) {
    this.sanduiche = sanduiche;
  };

  public String getDescricao() {
    return sanduiche.getDescricao() + " + Pepperoni";
  }

  public double getPreco() {
    return sanduiche.getPreco() + 0.99;
  }
  
}
