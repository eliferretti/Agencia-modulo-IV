const ClienteAdicionar = () => {
    return(
    <div className="container">
            <h1 className="titulo-paginas border-bottom">Novo cliente</h1>
            <div className="row">
                <div className="col-md-6">
                    <form name="form" action="" method="">
                        <div className="form-group col-md-6">
                            <label className="control-label">Nome</label>
                            <input type="text" name="txtNome" className="form-control" />
                        </div>
                        <div className="form-group col-md-12">
                            <label className="control-label">Endereco</label>
                            <input type="text" name="txtEndereco" className="form-control" />
                        </div>
                        <div className="form-group col-md-4">
                            <label className="control-label">Telefone</label>
                            <input type="text" name="txtTelefone" className="form-control" />
                        </div>
                        <div className="form-group col-md-4">
                            <label className="control-label">CPF</label>
                            <input type="text" name="txtCPF" className="form-control" />
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
                            <input type="text" name="txtIdade" className="form-control" />
                        </div>
                        <div className="form-group col-md-6">
                            <input type="submit" value="Adicionar" className="btn btn-success " style={{width:100}} />
                            <a className="btn btn-primary ml-2" href="/cliente">Voltar</a>
                        </div>
                    </form>
                </div>
            </div>
            <br />
        </div>
    );
}
export default ClienteAdicionar;