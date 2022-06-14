const botaoAtualizar = document.getElementById('atualizar-saldo');
const botaoLimpar = document.getElementById('limpar-saldo');
const novoValor = document.getElementById('novo-valor') as HTMLInputElement;
const valorTotal = document.getElementById('valor-total');

var saldoTotal = 0;

limparSaldo();

function somarAoSaldo(valor: number) {
    if(valorTotal && !Number.isNaN(valor)){
        saldoTotal += valor;
        valorTotal.innerHTML = saldoTotal.toString();
    }
    limparCampo();
}

function limparCampo() {
    novoValor.value = "";
}

function limparSaldo() {
    if (valorTotal) {
        saldoTotal = 0;
        valorTotal.innerHTML = saldoTotal.toString();
    }
}

botaoAtualizar.addEventListener('click', function () {
    somarAoSaldo(Number(novoValor.value));
});

botaoLimpar.addEventListener('click', function () {
    limparSaldo();
});
    