public class Fiat extends Veiculo {
  public Fiat() {
  }

  public Fiat(Fiat fiat) {
    super(fiat);
  }

  public Veiculo clone() {
    return new Fiat();
  }

}