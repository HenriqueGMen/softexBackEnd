import Interface.Strategy;

public class Calculator {
  private Strategy calculatorStrategy;

  public Calculator(Strategy operation) {
    calculatorStrategy = operation;
  }

  public int execute(int firstNumber, int secondNumber) {
    return calculatorStrategy.execute(firstNumber, secondNumber);
  }
  
}
