const DestinoTr = (props) => {
    return (
        <tr>
            <td>
                {props.Id}
            </td>
            <td>
                {props.Titulo}
            </td>
            <td>
                {props.Descricao}
            </td>
            <td>
                {props.Tipo}
            </td>
            <td>
                {props.Promo}
            </td>
            <td>
                {props.Preco}
            </td>
            <td>
                <div className="row pr-2 justify-content-end">
                    <div className="p-1 m-0">
                        <form action="/destinoeditar" method="get">
                            <input type="hidden" name="txtId" value={props.Id} />
                            <input type="submit" value="Editar" className="btn btn-primary" style={{width:70}} />
                        </form>		    		
                    </div>
                    <div className="p-1 m-0">
                        <form action="/destinoexcluir" method="get">
                            <input type="hidden" name="txtId" value={props.Id} />
                            <input type="submit" value="Excluir" className="btn btn-danger" style={{width:70}} />
                        </form>		    		
                    </div>
                </div>
            </td>
        </tr>	
    );
}
export default DestinoTr;