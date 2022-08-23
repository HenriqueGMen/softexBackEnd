const express = require('express');

const app = express();

app.get("/alunos", (req, res) => {
  return res.json(["Pedro", "Joana", "Guilherme"]);
});

app.post("/alunos", (req, res) => {
  return res.json(["Pedro", "Joana", "Guilherme", "Marina"]);
});

app.delete("/alunos/:id", (req, res) => {
  return res.json(["Pedro", "Joana", "Marina"]);
});

module.exports = app;