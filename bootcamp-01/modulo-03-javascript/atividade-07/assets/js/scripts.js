const BASE_URL = 'https://thatcopy.pw/catapi/rest/';
const catImg = document.getElementById('img-cat');
const catBtn = document.getElementById('botao-troca');

const getCats = async () => {
	
	const DATA = await fetch(BASE_URL, { 
            mode: 'no-cors'
        })
        .then((resposta) => resposta.json())
        .catch((erros) => console.log(erros));

    return DATA.webpurl;
};

const loadImg = async () => {
	catImg.src = await getCats();
};

catBtn.addEventListener('click', loadImg);

loadImg();