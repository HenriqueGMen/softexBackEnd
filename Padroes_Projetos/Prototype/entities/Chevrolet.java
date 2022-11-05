public class Chevrolet extends Veiculo{
  public Chevrolet() {
  }

  public Chevrolet(Chevrolet chevrolet) {
    super(chevrolet);
  }

  public Veiculo clone() {
    return new Chevrolet();
  }

}
