const ClienteExcluir = () => {
    return (
<div className="container">
    <h1 className="titulo-paginas">Excluir</h1>
    <h3 className="p-2 rounded text-danger alert-danger">Tem certeza que deseja excluir cliente?</h3>
    <div>
        <dl className="row">
            <dt className = "col-sm-2">Nome</dt>     <dd className = "col-sm-10">José da Silva</dd>
            <dt className = "col-sm-2">Endereço</dt> <dd className = "col-sm-10">Rua A</dd>
            <dt className = "col-sm-2">Telefone</dt> <dd className = "col-sm-10">(99) 99999-9999</dd>
            <dt className = "col-sm-2">CPF</dt>      <dd className = "col-sm-10">999.999.999-99</dd>
            <dt className = "col-sm-2">Sexo</dt>     <dd className = "col-sm-10">M</dd>
            <dt className = "col-sm-2">Idade</dt>    <dd className = "col-sm-10">99</dd>
        </dl>   
        <form action="" method="">
            <input type="hidden" name="txtId" value=""/>
            <input type="submit" value="Excluir" className="btn btn-danger" style={{width:80}}/> 
            <a className="btn btn-primary ml-2" href="/cliente">Voltar</a>
        </form>
    </div>
    <br />
    <br />
</div>
    );
}
export default ClienteExcluir;