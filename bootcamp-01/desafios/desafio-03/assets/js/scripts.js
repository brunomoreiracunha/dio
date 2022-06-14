var contador = 0;
window.addEventListener("load", addEventos);

function increment(){
    contador++;
    document.getElementById('currentNumber').innerHTML = contador;
    if(contador < 0){
        document.getElementById('currentNumber').style.color = 'red';
    } else if (contador >= 0){
        document.getElementById('currentNumber').style.color = 'black';
    }
}

function decrement(){
    contador--;
    document.getElementById('currentNumber').innerHTML = contador;
    if(contador < 0){
        document.getElementById('currentNumber').style.color = 'red';
    } else if (contador >= 0){
        document.getElementById('currentNumber').style.color = 'black';
    }
} 
function verificacao(){
    if(contador === 10 ){
        document.getElementById("adicionar").disabled = true;
        document.getElementById('adicionar').style.backgroundColor = 'lightgreen';
    }else{
        document.getElementById("adicionar").disabled = false;
        document.getElementById('adicionar').style.backgroundColor = 'mediumseagreen';
    } if(contador === -10){
        document.getElementById("subtrair").disabled = true;
        document.getElementById('subtrair').style.backgroundColor = 'lightgreen';
    } else{  
        document.getElementById("subtrair").disabled = false;
        document.getElementById('subtrair').style.backgroundColor = 'mediumseagreen';
    }
} 

function addEventos(){
    document.getElementById("adicionar").addEventListener("click", increment);
    document.getElementById("adicionar").addEventListener("click", verificacao);
    document.getElementById("subtrair").addEventListener("click", decrement);
    document.getElementById("subtrair").addEventListener("click", verificacao);
}