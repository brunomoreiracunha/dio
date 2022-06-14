/*Importando o projeto para a leitura da entrada no terminal.*/
const prompts = require("prompts");

function comparaNumeros(NUM1, NUM2) {
  let texto = "";
  texto += primeiraFrase(NUM1, NUM2);
  texto += segundaFrase(NUM1, NUM2);
  return texto;
}

function primeiraFrase(NUM1, NUM2) {
  const IGUAIS = NUM1 === NUM2; /*Compara os dois numeros e retorna True ou False para a variavel.*/
  let texto = `Os numeros ${NUM1} e ${NUM2}`;
  IGUAIS ? (texto += " são iguais. ") : (texto += " não são iguais. ");
  return texto;
}

function segundaFrase(NUM1, NUM2) {
  const SOMA = NUM1 + NUM2;
  const MAIOR10 = SOMA > 10;
  const MAIOR20 = SOMA > 20;
  let texto = `Sua soma é ${SOMA}`;
  if (MAIOR20) {
    return (texto += ", que é maior que 10 e maior que 20.");
  } else {
    MAIOR10
      ? (texto += ", que é maior que 10 e menor que 20.")
      : (texto += ", que é menor que 10 e menor que 20.");
    return texto;
  }
}

/*Função do projeto, o qual recebe os dados informados pelo usuario. */
(async () => {
        var  tempNum1 = await prompts({/*metodo da função que faz a coleta dos dados informados pelo usuario*/
            type: "number",/*Define o tipo de caracter que o Usuario podera digitar.*/
            name: "numero1",/*nome da variavel local, que recebe o valor informado pelo usuario*/
            initial: 0,/*valor inicial a ser informado pelo usuario*/
            message: "Informe o primeiro numero:",/*mensagem informada na tela do usuario*/
            validate: (numero1) => numero1 != -Infinity ? true : `É necessario digitar um numero` /*Validação para que o numero informado pelo usuario não seja um NaN -Infinity*/
        });
        var tempNum2 = await prompts({/*metodo da função que faz a coleta dos dados informados pelo usuario*/
            type: "number",/*Define o tipo de caracter que o Usuario podera digitar.*/
            name: "numero2",/*nome da variavel local, que recebe o valor informado pelo usuario*/
            initial: 0,/*valor inicial a ser informado pelo usuario*/
            message: "Informe o segundo numero:",/*mensagem informada na tela do usuario*/
            validate: (numero2) => numero2 != -Infinity ? true : `É necessario digitar um numero` /*Validação para que o numero informado pelo usuario não seja um NaN -Infinity*/
        });
        var NUM1 = parseInt(Object.values(tempNum1));/*Parse (converte) do tipo Objeto para um inteiro*/
        var NUM2 = parseInt(Object.values(tempNum2));/*Parse (converte) do tipo Objeto para um inteiro*/
        if(!Number.isNaN(NUM1) || !Number.isNaN(NUM2)){/*Uma garantia não necessario, mas que tinha utilizado para garantir que o numero não esta nulo.*/ 
            console.log(comparaNumeros(NUM1, NUM2));/*chamando a função para comparacao dos numeros informados*/
        }
   })();