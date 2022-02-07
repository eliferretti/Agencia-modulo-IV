import ClienteTr from "../../componentes/ClienteTr";
const ClienteLista = () => {
    return(
        <div className="container">
        <h1 className="titulo-paginas">Lista de clientes</h1>

        <div className="row">
            <div className="col-3">
                <p>
                    <a className="btn btn-success text-white" href="/clienteadicionar" >Adicionar</a>
                </p>
            </div>
            <div className="col d-flex justify-content-end">		
                <form action="/clienteconsultar" method="get" className="form-group">
                    <div className="d-flex justify-content-end">					
                        <input type="text" name="txtCPF" className="form-control mr-2" placeholder="Informe CPF" />	
                        <button type="submit" className="btn btn-success">Consultar</button>					
                    </div>
                </form>	
            </div>
        </div>

        <div className="overflow-auto">
            <table className="table table-striped table-sm" >
                <thead className="border-top">
                    <tr>
                        <th>
                            Id
                        </th>
                        <th>
                            Nome
                        </th>
                        <th>
                            Endereco
                        </th>
                        <th>
                            Telefone
                        </th>
                        <th>
                            CPF
                        </th>
                        <th>
                            Sexo
                        </th>
                        <th>
                            Idade
                        </th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <ClienteTr Id="1" Nome="José da Silva" Endereco="Rua sem nome" Telefone="(99) 99999-9999" CPF="999.999.999-99" Sexo="M" Idade="99"/>
                    <ClienteTr Id="2" Nome="Ana Maria" Endereco="Rua A" Telefone="(88) 88888-8888" CPF="888.888.888-88" Sexo="F" Idade="88"/>
                    <ClienteTr Id="3" Nome="Maria Silva" Endereco="Rua B" Telefone="(77) 77777-7777" CPF="777.777.777-77" Sexo="F" Idade="77"/>
                </tbody>
            </table>
        </div>
    </div>
    );
}
export default ClienteLista;