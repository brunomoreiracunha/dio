function somaTodos(arrayNumeros){
    return arrayNumeros.reduce(function(anterior, atual){
        console.log({anterior});
        console.log({atual});
        return anterior + atual;
    });
}   

const arrayNumeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

console.log(somaTodos(arrayNumeros));

const listaPreco = [
    {
        name: 'colgate',
        preco: 10,
    },
    {
        name: 'arroz 5kg',
        preco: 15,
    },
    {
        name: 'feijão',
        preco: 8,
    },
    {
        name: 'açucar',
        preco: 12,
    },
    {
        name: 'carne',
        preco: 35,
    },
    {
        name: 'vinho',
        preco: 15,
    },
]

var saldoDisponivel = 100;

function calculaSaldo(saldoDisponivel, listaPreco){
    return listaPreco.reduce(function (anterior, atual, indice){
        console.log("rodada -> ", indice+1);
        console.log({anterior});
        console.log({atual});
        return anterior - atual.preco;
    }, saldoDisponivel);
}

console.log(calculaSaldo(saldoDisponivel, listaPreco));