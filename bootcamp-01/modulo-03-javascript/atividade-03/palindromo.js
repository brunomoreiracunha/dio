function verificaPalindromo(texto){
    if(!texto) return "texto vazio";
    
    return texto.toLowerCase().split("").reverse().join("") === texto.toLowerCase();
}
function verificaPalindromoComSpacamento(texto){
    if(!texto) return "texto vazio";
    
    return texto.replace(/\s/g, '').toLowerCase().split("").reverse().join("") === texto.replace(/\s/g, '').toLowerCase();
}
function verificaPalindromoComArray(texto){
    if(!texto) return "texto vazio";
    let temp = texto.toLowerCase();
    for(let i = 0; i < temp.length / 2; i++){
        if(temp[0] !== temp[temp.length - 1 - i]){
            return false;
        }
        return true;
    }
}
console.log(verificaPalindromo("Maram"));
console.log(verificaPalindromoComSpacamento("A base do teto desaba"));
console.log(verificaPalindromoComArray("Reinier"));