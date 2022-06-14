function validaArray(meuArray, numero){
    try{
        if(!meuArray && !numero) throw new ReferenceError("Envie os parametros.");

        if(typeof meuArray !== 'object') throw new TypeError("O array informado precisa ser um Object.");

        if(typeof numero !== 'number') throw new TypeError("O valor informado precisa ser um Number.");

        if(meuArray.length !== num) throw new RangeError("O tamanho do array é inválido.");

        return meuArray;
    }
    catch(e){   
        if(e instanceof ReferenceError){
            console.log("Reference Error");
            console.log(e.name);
            console.log(e.stack);
        } else if(e instanceof TypeError){
            console.log("Type Error");
            console.log(e.name);
            console.log(e.stack);
        } else if(e instanceof RangeError){
            console.log("Range Error");
            console.log(e.name);
            console.log(e.stack);
        } else{
            console.log("Tipo de Erro não esperado.");
            console.log(e.name);
            console.log(e.stack);
        }
    }
}

var arrayObject = [
    {
        tipo: fruta,
        valor: 5,
    },
    {
        tipo: eletronico,
        valor: 10,
    }
];

var arrayNumeros = [1,2,3,4,5];
var tam5 = 5;
var tam2 = 2;
var tamL = letra;

console.log(validaArray());
console.log(validaArray(arrayNumeros));
console.log(validaArray(arrayObject));
console.log(validaArray(arrayObject,tam5));
console.log(validaArray(arrayNumeros,tamL));
console.log(validaArray(arrayObject,tam2));
console.log(validaArray(arrayObject,tamL));