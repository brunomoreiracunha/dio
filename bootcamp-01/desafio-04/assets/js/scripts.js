/*Identifica o formulario e referência o mesmo a uma variável.*/
const FORMULARIO = document.getElementById('formulario');
/*Identifica a DIV, onde receberá lista de tarefas e referência a mesma a uma variável.*/
const LISTA_TAREFAS = document.getElementById('lista-tarefas');

/*Adiciona uma função ao Botão do formulario.*/
FORMULARIO.onsubmit = function (excecao) {
    /*Metodo que cancela o evento, retornando ao estado incial prevenindo um submit, se o evento for cancelavel.*/
    excecao.preventDefault();
    /*Indentifica o INPUT, onde recebe o texto e o referência a uma variável*/
	const TAREFA_DESCRICAO = document.getElementById('tarefa-input');
	/*Invoca a função para adicionar uma tarefa.*/
    adicionarTarefa(TAREFA_DESCRICAO.value);
	/*Reinicia o formulario*/
    FORMULARIO.reset();
    
};

/*Função para adicionar uma tarefa.*/
function adicionarTarefa(descricao) {
    /*Criando por etapas, as tags HTML que seram adicionadas.*/
	const TARFA_CONTAINER = document.createElement('div');/*a DIV*/
	const NOVA_TAREFA = document.createElement('input');/*o INPUT(bolinha do checkbox) dentro da DIV*/
	const NOVA_LEGENDA = document.createElement('label');/*o LABEL(Texto) que vai ao  lado do INPUT*/
	const NOVA_DESCRICAO = document.createTextNode(descricao);/*o TEXTO que vai ser o texto do label*/

    /*Iniciando os atributos do INPUT*/
	NOVA_TAREFA.setAttribute('type', 'checkbox');/*Transforma em CHECBOX*/
	NOVA_TAREFA.setAttribute('name', descricao);/*Nome do input*/
	NOVA_TAREFA.setAttribute('id', descricao);/*Id do input*/

    /*Iniciando os Atributos do LABEL*/
	NOVA_LEGENDA.setAttribute('for', descricao);/*Adicionando o FOR para maior controle do label*/
	NOVA_LEGENDA.appendChild(NOVA_DESCRICAO);/*Adicionado o texto ao label*/

    /*Adicionando o INPUT e o LABEL na DIV*/
	TARFA_CONTAINER.classList.add('tarefa-item');/*Adiciona a Classe na DIV*/ 
	TARFA_CONTAINER.appendChild(NOVA_TAREFA);/*Adiciona o INPUT ao DIV*/
	TARFA_CONTAINER.appendChild(NOVA_LEGENDA);/*Adiciona o LABEL ao DIV*/

    /*Adiciona o DIV da tarefa criada ao DIV da Lista de Tarefas*/
	LISTA_TAREFAS.appendChild(TARFA_CONTAINER);
}