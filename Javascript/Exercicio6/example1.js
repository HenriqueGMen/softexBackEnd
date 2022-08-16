const readline = require('readline-sync');

function Grades(grade1, grade2, grade3) {
  this.grade1 = grade1;
  this.grade2 = grade2;
  this.grade3 = grade3;
  
  this.result = () => {
    var avarage = ((this.grade1 + this.grade2 + this.grade3) / 3).toFixed(1); 
    var result = (avarage >= 7) ? `Aprovado. Sua média foi ${avarage}` : `Reprovado. Sua média foi ${avarage}`;
    console.log(result)
  }  
}

var grade1 = readline.questionFloat("Informe a primeira nota: ");
var grade2 = readline.questionFloat("Informe a segunda nota: ");
var grade3 = readline.questionFloat("Informe a terceira nota: ");

var res = new Grades(grade1, grade2, grade3);

res.result();