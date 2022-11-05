public class App {

  public static void main(String[] args) {
    Veiculo[] listaVeiculos = new Veiculo[5];
    Veiculo[] veiculosClonados = new Veiculo[listaVeiculos.length];

    Veiculo novo = new Fiat();

    Veiculo fiat1 = new Fiat();
    fiat1.marca = "Fiat";
    fiat1.modelo = "Uno";
    fiat1.cor = "Preto";
    fiat1.numeroRodas = "4";
    fiat1.categoria = "Compacto";

    Veiculo fiat2 = new Fiat();
    fiat2.marca = "Fiat";
    fiat2.modelo = "Strada";
    fiat2.cor = "Vermelho";
    fiat2.numeroRodas = "4";
    fiat2.categoria = "Picape";

    Veiculo jeep1 = new Jeep();
    jeep1.marca = "Jeep";
    jeep1.modelo = "Renegade";
    jeep1.cor = "Vermelho";
    jeep1.numeroRodas = "4";
    jeep1.categoria = "SUV";

    Veiculo jeep2 = new Jeep();
    jeep2.marca = "Jeep";
    jeep2.modelo = "Compass";
    jeep2.cor = "Preto";
    jeep2.numeroRodas = "4";
    jeep2.categoria = "SUV";

    Veiculo chevrolet1 = new Chevrolet();
    chevrolet1.marca = "Chevrolet";
    chevrolet1.modelo = "Onix";
    chevrolet1.cor = "Branco";
    chevrolet1.numeroRodas = "4";
    chevrolet1.categoria = "Compacto";

    listaVeiculos[0] = fiat1;
    listaVeiculos[1] = fiat2;
    listaVeiculos[2] = jeep1;
    listaVeiculos[3] = jeep2;
    listaVeiculos[4] = chevrolet1;

    veiculosClonados = listaClonados(listaVeiculos);

    novo.represent(veiculosClonados);
  }

  private static Veiculo[] listaClonados(Veiculo[] array) {
    Veiculo[] clones = array.clone();

    return clones;
  }
}
