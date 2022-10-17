import Component.Sanduiche;
import ConcretComponents.SanduicheFrangoAssado;
import ConcreteDecorator.Pepperoni;
import ConcreteDecorator.QueijoMussarela;

public class App {
  public static void main(String[] args) {
    Sanduiche sanduiche1 = new SanduicheFrangoAssado();
    sanduiche1 = new Pepperoni(sanduiche1);
    sanduiche1 = new QueijoMussarela(sanduiche1);
    System.out.println(sanduiche1.getDescricao() + " - R$ "+ sanduiche1.getPreco());
  }
}
