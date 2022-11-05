package Implementation;

import Interface.Strategy;

public class Sum implements Strategy {

  public int execute(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }  

}
