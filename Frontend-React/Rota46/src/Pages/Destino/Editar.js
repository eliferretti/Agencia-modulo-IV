const DestinoEditar = () => {
    return (
<div className="container">
<h1 className="titulo-paginas border-bottom">Editar</h1>
<div className="row">
    <div className="col-md-6">
	    <form name="form" action="" method="">  
	    	<input type="hidden" name="txtId" value="" className="form-control" />
	        <div className="form-group col-md-6">
	            <label className="control-label">Título</label>
	            <input type="text" name="txtTitulo" value="" className="form-control" />
	        </div>
	        <div className="form-group col-md-12">
	            <label className="control-label">Descrição</label>
	            <textarea name="txtDescricao" className="form-control" rows="3"></textarea>
	        </div>
	        <div className="form-group col-md-4">
	            <label className="control-label">Tipo</label>
	            <select className="custom-select" name="slcTipo">
	                <option selected>-</option>
	                <option>Nacional</option>
	                <option>Internacional</option>
	            </select>
	        </div>
	        <div className="form-group col-md-3">
	            <label className="control-label">Promoção</label>
	            <select className="custom-select" name="slcPromo">
	                <option selected>-</option>
	                <option>Sim</option>
	                <option>Não</option>
	            </select>
	        </div>
	        <div className="form-group col-md-3">
	            <label className="control-label">Preço</label>
	            <input type="text" name="txtPreco" value="" className="form-control" />
	        </div>
	        <div className="form-group col-md-6">
	            <input type="submit" value="Salvar" className="btn btn-success" style={{width:100}}/>
	             <a className="btn btn-primary ml-2" href="/destino" >Voltar</a>
	        </div>
	    </form>
    </div>
</div>
<br />
</div>
    );
}
export default DestinoEditar;