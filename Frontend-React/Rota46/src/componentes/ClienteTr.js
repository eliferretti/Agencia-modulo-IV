const ClienteTr = (props) => {
    return (
        <tr>
            <td>
                {props.Id}
            </td>
            <td>
                {props.Nome}
            </td>
            <td>
                {props.Endereco}
            </td>
            <td>
                {props.Telefone}
            </td>
            <td>
                {props.CPF}
            </td>
            <td>
                {props.Sexo}
            </td>
            <td>
                {props.Idade}
            </td>
            <td>
                <div className="row pr-2 justify-content-end">
                    <div className="p-1 m-0">
                        <form action="/clienteeditar" method="get">
                            <input type="hidden" name="txtId" value={props.Id} />
                            <input type="submit" value="Editar" className="btn btn-primary" style={{width:70}} />
                        </form>		    		
                    </div>
                    <div className="p-1 m-0">
                        <form action="/clienteexcluir" method="get">
                            <input type="hidden" name="txtId" value={props.Id} />
                            <input type="submit" value="Excluir" className="btn btn-danger" style={{width:70}} />
                        </form>		    		
                    </div>
                </div>
            </td>
        </tr>	
    );
}
export default ClienteTr;