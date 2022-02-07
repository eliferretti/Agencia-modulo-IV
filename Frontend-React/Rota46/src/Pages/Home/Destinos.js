import CardDestino from '../../componentes/CardDestino';
const Destinos = () => {
    return(
        <div className="container">
        <h1 className="titulo-paginas text-center">Conheça nossos destinos</h1>
            <div className="row">
                <main className="d-flex flex-wrap justify-content-start col-sm-12">  
                    <CardDestino titulo="Arraial do cabo" descricao="Conheça destino bla bla bla" preco="499,99"/>
                    <CardDestino titulo="Angra dos reis" descricao="Conheça Angra dos reis" preco="599,90"/> 
                    <CardDestino titulo="Petropolis" descricao="Carnaval para 2 pessoas" preco="1.459,99"/> 
                    <CardDestino titulo="Granja Comari" descricao="Carnaval para 2 pessoas" preco="759,99"/> 
                    <CardDestino titulo="Paraty" descricao="Carnaval para 2 pessoas" preco="959,99"/> 
                    <CardDestino titulo="Ilha grande" descricao="Carnaval para 2 pessoas" preco="559,99"/> 
                    <CardDestino titulo="Ilha cataguas" descricao="Carnaval para 2 pessoas" preco="359,99"/>             
                    <CardDestino titulo="Copacabana" descricao="Carnaval para 2 pessoas" preco="2.299,90"/> 
                </main>
            </div>       
        <br />
        <br />
        <br />        
        </div>    
    );
}
export default Destinos;