/*
function verificaPar(arrayNumeros){
    return arrayNumeros.filter(function (item){
    return item % 2 === 0;});
}*/
function verificaPar(arrayNumeros){
    return arrayNumeros.filter(filtroPar);
}
function verificaImpar(arrayNumeros){
    return arrayNumeros.filter(filtroImpar);
}

function filtroPar(item){
    return item % 2 === 0;
}
function filtroImpar(item){
    return item % 2 !== 0;
}

const arrayNumeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

console.log(verificaPar(arrayNumeros));
console.log(verificaImpar(arrayNumeros));