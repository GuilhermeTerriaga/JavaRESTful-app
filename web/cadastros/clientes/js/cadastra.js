let btngravar;

function aoCarregarPagina(){
    btngravar = document.getElementById("btngravar");
    btngravar.addEventListener('click', gravar);
}

function gravar(){
    const endpoint = "http://localhost:8080/AplicacaoWebRESTful/services/clientes/cadastrar";
    
    let nome = document.getElementById("txtnome");
    var cliente = JSON.stringify({"nome": nome.value});
    
    var cabecalho = new Headers({
        "Content-Type": "application/json",
        "X-Custom-Header": "ProccessThisImmediately"
    });
    
    fetch(endpoint, {
        method: "POST",
        headers: cabecalho,
        body: cliente
    })
            .then(response => response.json())
            .then(data => {
                alert(data);
            }) 
                    .catch(() => console.log("ops!"));
}
