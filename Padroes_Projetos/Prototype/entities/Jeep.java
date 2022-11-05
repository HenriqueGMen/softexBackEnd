public class Jeep extends Veiculo {
  public Jeep() {
  }

  public Jeep(Jeep jeep) {
    super(jeep);
  }

  public Veiculo clone() {
    return new Jeep();
  }

}