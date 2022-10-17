import Interface.IComputer;

public class App {  
  public static void main(String[] args) {
    IComputer computer1 = Factory.getComputer("2GB","250Gb", "1.8GHz", "Pc");
    IComputer computer2 = Factory.getComputer("8GB","700Gb", "2.8GHz", "Server");

    System.out.println(computer1);
    System.out.println(computer2);
  }
}