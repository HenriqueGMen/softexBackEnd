package Interface;

public abstract class IComputer {
  public abstract String getRam();
  public abstract String getHDD();
  public abstract String getCPU();
  public abstract String getType();

  public String toString(){
    return 
      "Computador do tipo: " + this.getType() + "\n" +
      " RAM: " + this.getRam() + 
      ", HDD: " + this.getHDD() + 
      ", CPU:" + this.getCPU();
  }
}
