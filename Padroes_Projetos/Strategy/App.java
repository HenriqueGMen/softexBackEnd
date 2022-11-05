import java.util.Scanner;

import Implementation.Multiplication;
import Implementation.Subtraction;
import Implementation.Sum;

public class App {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int op = 0;
    int firstNumber = 0;
    int secondNumber = 0;
    String cont = "sim";
    
    while (cont == "sim") {
      System.out.println("1 - Somar");
      System.out.println("2 - Subtrair");
      System.out.println("3 - Multiplicar");
      op = input.nextInt();

      System.out.println("Digite o primeiro número:");
      firstNumber = input.nextInt();
  
      System.out.println("Digite o segundo número:");
      secondNumber = input.nextInt();

      if (op == 1) {
        Calculator calc = new Calculator(new Sum());
        int result = calc.execute(firstNumber, secondNumber);
        System.out.println(result);
      }
  
      if (op == 2) {
        Calculator calc = new Calculator(new Subtraction());
        int result = calc.execute(firstNumber, secondNumber);
        System.out.println(result);
  
      }
  
      if (op == 3) {
        Calculator calc = new Calculator(new Multiplication());
        int result = calc.execute(firstNumber, secondNumber);
        System.out.println(result);
      }

      
      System.out.println("Deseja continuar? 'sim' 'nao'");
      cont = input.next();

      if(cont == "nao") {
        break;
      }
    }
  }
}