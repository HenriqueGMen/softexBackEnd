package Implementation;

import Interface.Strategy;

public class Subtraction implements Strategy{

  public int execute(int firstNumber, int secondNumber) {
    return firstNumber - secondNumber;
  }
  
}
