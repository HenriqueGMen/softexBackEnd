const Sequelize = require('sequelize');
const sequelize = new Sequelize('database', 'root', 'root', {dialect: 'mariadb', host: "localhost"});

module.exports = sequelize;