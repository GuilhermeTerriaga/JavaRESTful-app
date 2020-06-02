function aoCarregarPagina(){
    btnpegar = document.getElementById("btnpegar");
    btnpegar.addEventListener('click', listar);
}
function listar(){
    const endpoint = "http://localhost:8080/AplicacaoWebRESTful/services/clientes/listar";
    var table = document.getElementById("tblcliente");
    table.innerHTML = "";
    fetch(endpoint)
            .then(response => response.json())
            .then(data => {
                if(data.lenght != 0){
                 for(i in data){
                     let linha = table.insertRow(0);
                     let celid  = linha.insertCell(0);
                     let celnome = linha.insertCell(1);
                     
                     celid.innerHTML = data[i].id;
                     celnome.innerHTML = data[i].nome;
                     
                }
              }else{
                  alert("Nenhum cliente enontrado!");
                     
            }
        }
         )
         


        .catch(() => console.log("ops!"));
}


