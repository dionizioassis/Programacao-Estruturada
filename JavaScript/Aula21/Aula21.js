// declaração de uma função
function saudar(nome,nome2){
        console.log(`Olá ${nome} e ${nome2}`)
    }

// Função sem parâmetros e sem retorno
function criarMenuPrincipal(){
        let menu = `
        ==== Selecione uma opção ===\n
        Opção 1 - Ação 1\n
        Opção 2 - Ação 2\n
        Opção 3 - Ação 3\n
        Opção 4 - Ação 4\n
        `
        console.log(menu)
    }
function explicarErro(codigo){
        if(codigo == 200){
            console.log('OK')
        }else if(codigo == 404){
            console.log('Página não encontrada')
        }else{
            console.log('Erro não especificado')
        }
    }

// Função com parâmetros e com retorno
    function calcularMedia(np1, np2, np3){
        let media = (np1 + np2 + np3)/3

        return media
    }
function mandarMensagem(nome){
    let mensagem = `Bem-vindo ${nome}`
    console.log(mensagem)
   } 

function normalizarUsuario(texto){
    texto = texto.trim().toLowerCase()
    texto = texto.replaceAll(" ",".")
    return texto
   }

function contarAcima(valores, limite){
    let contador = 0
    for (let i = 0; i < valores.length; i++){
        if(valores[i] > limite){
            contador++
        }
    }
    return contador
   }

function verificarSituacao(n1,n2,n3){
    let media = calcularMedia(n1,n2,n3)
    if(media > 5){
        console.log('Aprovado '+media.toFixed(2))
    }else{
        console.log('Reprovado')
    }
}

const calcularMediaPonderada = (n1,p1,n2,p2) => {
    return (n1*p1 + n2*p2)/(p1 + p2)
}