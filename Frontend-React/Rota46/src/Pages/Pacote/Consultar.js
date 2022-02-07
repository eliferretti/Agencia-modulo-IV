import PacoteTr from "../../componentes/PacoteTr";
const PacoteConsultar = () => {
    return(
        <div className="container">
            <h1 className="titulo-paginas">Consulta pacote</h1>
            <div className="row">
                <div className="col-3">
                    <p>
                        <a className="btn btn-success text-white" href="/pacoteadicionar" >Adicionar</a>
                    </p>
                </div>
                <div className="col d-flex justify-content-end">		
                    <form name="form" action="pacoteconsultar" method="get" className="form-group">
                        <div className="d-flex justify-content-end">					
                            <input type="text" name="txtId" className="form-control mr-2" placeholder="Informe Id pacote" />	
                            <button type="submit" className="btn btn-success" >Consultar</button>					
                        </div>
                    </form>	
                </div>
            </div>
            <div className="overflow-auto">
                <table className="table table-sm table-striped" >
                    <thead className="border-top">
                        <tr>
                            <th>
                                Id
                            </th>
                            <th>
                                Cliente
                            </th>
                            <th>
                                Destino
                            </th>
                            <th>
                                Data Compra
                            </th>
                            <th>
                                Data Viagem
                            </th>
                            <th>
                                Preço
                            </th>
                            <th>
                            </th>
                        </tr>
                    </thead>
                    <tbody>    	
                        <PacoteTr Id="1" Cliente="José da Silva" Destino="Copacabana" DataCompra="99/99/9999" DataViagem="99/99/9999" Preco="R$ 999,99" />
                    </tbody>
                </table>
            </div>
        </div>
    );
}

export default PacoteConsultar;