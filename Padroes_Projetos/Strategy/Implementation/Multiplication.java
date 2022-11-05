package Implementation;

import Interface.Strategy;

public class Multiplication implements Strategy {

  public int execute(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }
  
}