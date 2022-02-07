const DestinoExcluir = () => {
    return (
        <div className="container">
        <h1 className="titulo-paginas">Excluir</h1>
        <h3 className="p-2 rounded text-danger alert-danger">Tem certeza que deseja excluir destino?</h3>
        <div>
            <dl className="row">
                <dt className = "col-sm-2">Destino</dt>   <dd className = "col-sm-10">Copacabana</dd>
                <dt className = "col-sm-2">Descrição</dt> <dd className = "col-sm-10">Conheça Copacabana</dd>
                <dt className = "col-sm-2">Tipo</dt>      <dd className = "col-sm-10">Nac</dd>
                <dt className = "col-sm-2">Promoção</dt>  <dd className = "col-sm-10">Sim</dd>
                <dt className = "col-sm-2">Preço</dt>     <dd className = "col-sm-10">000,00</dd>
            </dl>   
            <form action="" method="">
                <input type="hidden" name="txtId" value=""/>
                <input type="submit" value="Excluir" className="btn btn-danger" style={{width:100}}/> 
                <a className="btn btn-primary ml-2" href="/destino">Voltar</a>
            </form>
        </div>
        </div>
    );
}
export default DestinoExcluir;