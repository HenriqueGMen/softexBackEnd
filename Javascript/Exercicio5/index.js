const readline = require('readline-sync');

function Calculator(number1, number2, operator) {
  this.number1 = number1;
  this.number2 = number2;
  this.operator = operator;

  this.result = () => {
    result = 0;

    if (operator === "+") {
      result = number1 + number2;
    } else if (operator === "-") {
      result = number1 - number2;
    } else if (operator === "/") {
      result = number1 / number2;
    } else if (operator === "*") {
      result = number1 * number2;
    } else if (operator === "%") {
      result = number1 % number2;
    } else {
      result = "Erro ao calcular."
    }
    console.log(result);
  }
}

var number1 = readline.questionInt("Digite o primeiro numero: ");
var number2 = readline.questionInt("Digite o segundo numero: ");
var operator = readline.question("Informe a operação desejada: ");

var res = new Calculator(number1, number2, operator);

res.result();