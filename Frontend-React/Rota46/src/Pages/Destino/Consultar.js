import DestinoTr from "../../componentes/DestinoTr";
const DestinoConsultar = () => {
    return (
        <div className="container">
        <h1 className="titulo-paginas">Lista de destinos</h1>
        <div className="row">
            <div className="col-3">
                <p>
                    <a className="btn btn-success text-white" href="/destinoadicionar" >Adicionar</a>
                </p>
            </div>
            <div className="col d-flex justify-content-end">		
                <form action="/destinoconsultar" method="get" className="form-group">
                    <div className="d-flex justify-content-end">					
                        <input type="text" name="txtTitulo" className="form-control mr-2" placeholder="Informe destino" />	
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
                            Destino
                        </th>
                        <th>
                            Descrição
                        </th>
                        <th>
                            Tipo
                        </th>
                        <th>
                            Promo
                        </th>
                        <th>
                            Preço
                        </th>
                        <th>
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <DestinoTr Id="1" Titulo="Copacabana" Descricao="Conheça Copacabana" Tipo="Nac" Promo="Sim" Preco="R$ 999,99" />
                </tbody>
            </table>
        </div>
    </div>
    );
}
export default DestinoConsultar;