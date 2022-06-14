enum Profissao {
    Atriz,
    Padeiro
}

interface Pessoa {
    nome: string,
    idade: number,
    profissao: Profissao
}

const trabalhador1: Pessoa = {
    nome: 'Maria',
    idade: 29,
    profissao: Profissao.Atriz
};

const trabalhador2: Pessoa = {
    nome: 'Roberto',
    idade: 19,
    profissao: Profissao.Padeiro
};

const trabalhador3: Pessoa = {
    nome: 'Laura',
    idade: 32,
    profissao: Profissao.Atriz
};

const trabalhador4: Pessoa = {
    nome: "Carlos",
    idade: 19,
    profissao: Profissao.Padeiro
}