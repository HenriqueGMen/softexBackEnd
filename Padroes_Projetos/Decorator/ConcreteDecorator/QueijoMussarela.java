package ConcreteDecorator;

import Component.Sanduiche;
import Decorator.SanduicheDecorator;

public class QueijoMussarela extends SanduicheDecorator {

  public QueijoMussarela(Sanduiche sanduiche) {
    this.sanduiche = sanduiche;
  }

  public String getDescricao() {
    return sanduiche.getDescricao() + " + Queijo Mussarela";
  }

  public double getPreco() {
    return sanduiche.getPreco() + 2;
  }
  
}
