const meuArray = [30, 30, 40, 5, 223, 2049, 3034, 5];

function valorUnico(arr){
    const mySet = new Set(arr);

    return mySet; /*retorna um set (valores sempre unicos.)*/
} 

function valoresUnicos(arr){
    const mySet = new Set(arr);
    
    return [...mySet]; /*retorna os valores dentro de um Array */
}

console.log(valorUnico(meuArray));
console.log(valoresUnicos(meuArray));