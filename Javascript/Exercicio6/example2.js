const readline = require('readline-sync');

function Grades(grade1, grade2) {
  this.grade1 = grade1;
  this.grade2 = grade2;
  
  this.result = () => {
    var currentGrade = this.grade1 + this.grade2
    var minGrade = 21;
    var grade3 = minGrade - currentGrade

    console.log(`Para passar você precisa tirar uma nota ${grade3}`)
  }
};

var grade1 = readline.questionFloat("Informe a primeira nota: ");
var grade2 = readline.questionFloat("Informe a segunda nota: ");

var res = new Grades(grade1, grade2);

res.result();