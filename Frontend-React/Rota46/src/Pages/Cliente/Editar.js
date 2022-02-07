const ClienteEditar = () => {
    return (
        <div className="container">
            <h1 className="titulo-paginas border-bottom">Editar</h1>
            <div className="row">
                <div className="col-md-6">
                    <form name="form" action="" method="">
                        <input type="hidden" name="txtId" value="" />
                        <div className="form-group col-md-6">
                            <label className="control-label">Nome</label>
                            <input name="txtNome" value="" className="form-control" />
                        </div>
                        <div class="form-group col-md-12">
                            <label className="control-label">Endereço</label>
                            <input name="txtEndereco" value="" className="form-control" />
                        </div>
                        <div className="form-group col-md-4">
                            <label className="control-label">Telefone</label>
                            <input name="txtTelefone" value="" className="form-control" />
                        </div>
                        <div className="form-group col-md-4">
                            <label className="control-label">CPF</label>
                            <input name="txtCPF" value="" className="form-control" />
                        </div>
                        <div className="form-group col-md-3">
                            <label className="control-label">Sexo</label>
                            <select className="custom-select" name="slcSexo">
                                <option selected>-</option>
                                <option>M</option>
                                <option>F</option>
                            </select>
                        </div>
                        <div className="form-group col-md-3">
                            <label className="control-label">Idade</label>
                            <input name="txtIdade" value="" className="form-control" />
                        </div>
                        <div className="form-group col-md-6">
                            <input type="submit" value="Salvar" className="btn btn-success" style={{width:80}} />
                            <a className="btn btn-primary ml-2" href="/cliente">Voltar</a>
                        </div>
                    </form>
                </div>
            </div>
        <br />
        </div>
    );
}
export default ClienteEditar;