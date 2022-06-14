import { corVerde } from "./modules/metodos.js";

const botao = document.getElementById("botao");
const corpo = document.getElementsByTagName("body")[0];

const mudarCor = function () {
	botao.addEventListener("click", async function () {
		const { corVermelha } = await import("./modules/metodos.js");
		corVermelha(corpo);
	});
};

mudarCor();