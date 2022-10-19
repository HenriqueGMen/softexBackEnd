public class AdaptadorPatoDemo {
  static void adpterPato (IPato animal){
    animal.fazerQuaqua();
  };

  static void adpterGalinha (IGalinha animal){
    animal.fazerCocorico();
  };

  public static void main(String[] args) {
    Pato pato = new Pato();

    adpterGalinha(new AdaptadorPato(pato));
  }
  
}