const empregado1 = {
    codigo: 12,
    nome: 'João'
};

const empregado2: {codigo: number, nome: string} = {
    codigo: 8,
    nome: 'Maria'
};

interface Funcionario {
    codigo: number;
    nome: string;
};

const empregado3 = {} as Funcionario;
empregado3.nome = 'José';
empregado3.codigo = 6;

const empregado4: Funcionario = {
    nome: 'Pedro',
    codigo: 4
}