const mult2 = {
    value: 2,
}
const mult3 = {
    value: 3,
}
const mult5 = {
    value: 5,
}

function  multiplosMapComThis(arrayNumeros, thisArg){
    return arrayNumeros.map(function (item){
      return item * this.value;  
    }, thisArg);
}

function multiplosMapSemThis(arrayNumeros){
    return arrayNumeros.map(function (item) {
       return item * 6; 
    });
}

function multiplosMapSemThisEArrowFunction(arrayNumeros){
    return arrayNumeros.map(item => item * 7);
}

const arrayNumeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

console.log('Multiplos de 2 = ' + multiplosMapComThis(arrayNumeros, mult2));
console.log('Multiplos de 3 = ' + multiplosMapComThis(arrayNumeros, mult3));
console.log('Multiplos de 5 = ' + multiplosMapComThis(arrayNumeros, mult5));
console.log('Multiplos de 6 = ' + multiplosMapSemThis(arrayNumeros));
console.log('Multiplos de 7 = ' + multiplosMapSemThisEArrowFunction(arrayNumeros));