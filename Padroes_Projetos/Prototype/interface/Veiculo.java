public abstract class Veiculo {
  public String modelo;
	public String marca;
	public String cor;
	public String numeroRodas;
	public String categoria;

  public Veiculo(){}

  public Veiculo(Veiculo veiculo) {
    this.modelo = veiculo.modelo;
    this.marca = veiculo.marca;
    this.cor = veiculo.cor;
    this.numeroRodas = veiculo.numeroRodas;
    this.categoria = veiculo.categoria;
  }

  public abstract Veiculo clone();

  public void represent(Veiculo[] listaCarros){
    for(int i = 0; i < listaCarros.length; i++){
        System.out.println("|| Automóvel ||");
        System.out.println("Marca: " + listaCarros[i].marca);
        System.out.println("Modelo: " + listaCarros[i].modelo);
        System.out.println("Categoria: " + listaCarros[i].categoria);
        System.out.println("Cor: " + listaCarros[i].cor);
        System.out.println("Nº de Rodas: " + listaCarros[i].numeroRodas);
        System.out.println("\n");
    }
  }
}

