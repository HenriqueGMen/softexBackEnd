package Entities;

import Interface.IComputer;

public class Server extends IComputer{
  private String ram;
  private String hdd;
  private String cpu;
  private String type;

  public Server(String ram, String hdd, String cpu, String type) {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
    this.type = type;
  }

  public String getRam() {
    return this.ram;
  }

  public String getHDD() {
    return this.hdd;
  }

  public String getCPU() {  
    return this.cpu;
  }

  public String getType() {
    return this.type;
  }  
}
