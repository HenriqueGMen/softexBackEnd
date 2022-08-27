//Função
function saudacao() {
  return "Olá"
}

//Função com parametros
function grades(grade1, grade2, grade3) {
    var avarage = ((grade1 + grade2 + grade3) / 3).toFixed(1); 
    var result = (avarage >= 7) ? `Aprovado. Sua média foi ${avarage}` : `Reprovado. Sua média foi ${avarage}`;
    return result
  }  

//Arrow function
const nome = (nome, sobrenome) => (`${nome} ${sobrenome}`);

console.log(saudacao())
console.log(nome("Henrique", "Mendonça"))
console.log(grades(4, 6, 8))