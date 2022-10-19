public class AdaptadorPato implements IGalinha{
  private IPato pato;

  public AdaptadorPato(IPato pato) {
    this.pato = pato;
  }

  public void fazerCocorico() {
    pato.fazerQuaqua();
  }

  public void voar() {
  }  
}