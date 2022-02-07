import CardDestino from "../../componentes/CardDestino";
const Promo = () => {
    return(
        <div className="container">
        <h1 className="titulo-paginas text-center">Conheça nossas promoções</h1>
            <div className="row">
                <main className="d-flex flex-wrap justify-content-start col-sm-12">              
                    <CardDestino titulo="Petropolis" descricao="Carnaval para 2 pessoas" preco="1.459,99"/> 
                    <CardDestino titulo="Granja Comari" descricao="Carnaval para 2 pessoas" preco="759,99"/> 
                    <CardDestino titulo="Paraty" descricao="Carnaval para 2 pessoas" preco="959,99"/> 
                    <CardDestino titulo="Ilha grande" descricao="Carnaval para 2 pessoas" preco="559,99"/> 
                </main>
            </div>       
        <br />
        <br />
        <br />        
        </div>    
    );
}
export default Promo;