(async () => {
  const database = require('./database');
  const Aluno = require('./alunos');
  await database.sync();

  const resultadoCreate = await Aluno.create({
    nome: 'Henrique',
    matricula: 1022,
  })

  console.log("..:: BANCO DE DADOS CONECTADO ::..")
  console.log(resultadoCreate);
})();