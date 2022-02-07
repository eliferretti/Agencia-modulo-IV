const PacoteAdicionar = () => {
    return(
		<div className="container">
		<h1 className="titulo-paginas border-bottom">Novo pacote</h1>
		<div className="row">
		    <div className="col-md-6">
		        <form name="form" action="" method="">  
		            <div className="form-group col-md-3">
		                <label className="control-label">Id Cliente</label>
		                <input type="text" name="txtIdCliente" className="form-control" />
		            </div>
		            <div className="form-group col-md-3">
		                <label className="control-label">Id Destino</label>
		                <input type="text"  name="txtIdDestino" className="form-control" />
		            </div>
		            <div className="form-group col-md-5">
		                <label className="control-label">Data da compra</label>
		                <input type="date"  name="txtDataCompra" className="form-control" />
		            </div>
		            <div className="form-group col-md-5">
		                <label className="control-label">Data da viagem</label>
		                <input type="date"  name="txtDataViagem" className="form-control" />
		            </div>
		            <div className="form-group col-md-3">
		                <label className="control-label">Preço</label>
		                <input type="text"  type="text" name="txtPreco" className="form-control" />
		            </div>
		            <div className="form-group col-md-6">
		                <input type="submit" value="Adicionar" className="btn btn-success" style={{width:100}} />
		                 <a class="btn btn-primary ml-2" href="/pacote" style={{width:100}} >Voltar</a>
		            </div>
		        </form>
		    </div>
		</div>
		<br />
	</div>       
    );
}
export default PacoteAdicionar;