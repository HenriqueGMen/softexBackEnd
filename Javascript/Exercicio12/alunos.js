const Sequelize = require("sequelize");
const database = require("./database");

const Aluno = database.define('aluno', {
  id: {
    type: Sequelize.INTEGER,
    autoIncrement: true,
    allowNull: false,
    primaryKey: true
  },
  nome: {
    type: Sequelize.STRING,
    allowNull: false
  },
  matricula: {
    type: Sequelize.INTEGER
  },
})

module.exports = Aluno;