const PacoteExcluir = () => {
    return (
        <div class="container">
            <h1 class="titulo-paginas">Excluir</h1>
            <h3 class="p-2 rounded text-danger alert-danger">Tem certeza que deseja excluir pacote?</h3>
            <div>
                <dl class="row">
                    <dt class = "col-sm-2">Id</dt>              <dd class = "col-sm-10">1</dd>
                    <dt class = "col-sm-2">Id Cliente</dt>      <dd class = "col-sm-10">2</dd>
                    <dt class = "col-sm-2">Id Destino</dt>      <dd class = "col-sm-10">2</dd>  
                    <dt class = "col-sm-2">Data de compra</dt>  <dd class = "col-sm-10">99/99/9999</dd>        
                    <dt class = "col-sm-2">Data da viagem</dt>  <dd class = "col-sm-10">99/99/9999</dd>
                    <dt class = "col-sm-2">Preço</dt>           <dd class = "col-sm-10">R$ 999,99</dd>
                </dl>   
                <form action="" method="">
                    <input type="hidden" name="txtId" value=""/>
                    <input type="submit" value="Excluir" class="btn btn-danger" style={{width:100}} /> 
                    <a class="btn btn-primary ml-2" href="/pacote" style={{width:100}} >Voltar</a>
                </form>
            </div>
        </div>
    );
}
export default PacoteExcluir;