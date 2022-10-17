import Entities.Pc;
import Entities.Server;
import Interface.IComputer;

public class Factory {
  public static IComputer getComputer(String ram, String hdd, String cpu, String type){
    if(type == "Pc") {
      return new Pc(ram, hdd, cpu, type);
    }

    else if(type == "Server") {
      return new Server(ram, hdd, cpu, type);
    }

    return null;
  }
}
