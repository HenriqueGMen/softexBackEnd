const Sequelize = require('sequelize');
const sequelize = new Sequelize('aluno', 'root', 'admin', {dialect: 'mariadb', host: "localhost"});

module.exports = sequelize;