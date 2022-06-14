function verificaPar(array){
    if(!array) return -1; 
    if(!array.length) return-1;

    for(let i = 0; i < array.length; i++){
        (array[i] === 0) ? "" : (array[i] % 2 === 0) ? array[i] = 0 : "";
    }
    return array;
}

console.log(verificaPar([0,1,2,3,4,5,6,7,8,9,10]));
console.log(verificaPar([]));
console.log(verificaPar(null));
console.log(verificaPar(undefined));
console.log(verificaPar());