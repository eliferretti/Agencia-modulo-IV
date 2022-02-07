import DestinoTr from "../../componentes/DestinoTr";
const DestinoLista = () => {
    return(
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
                    <DestinoTr Id="2" Titulo="Ipanema" Descricao="Conheça Ipanema" Tipo="Nac" Promo="Não" Preco="R$ 888,99" />
                    <DestinoTr Id="3" Titulo="Leblon" Descricao="Conheça Leblon" Tipo="Nac" Promo="Sim" Preco="R$ 777,99" />
                </tbody>
            </table>
        </div>
    </div>
    );
}
export default DestinoLista;