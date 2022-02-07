// Geral
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Nav from './componentes/Nav';
import Footer from './componentes/Footer';

// Home
import Contato from './Pages/Home/Contato';
import Home from './Pages/Home/Home';
import Destinos from './Pages/Home/Destinos';
import Promo from './Pages/Home/Promo';

// Cliente
import ClienteLista from './Pages/Cliente/Lista';
import ClienteAdicionar from './Pages/Cliente/Adicionar';
import ClienteEditar from './Pages/Cliente/Editar';
import ClienteExcluir from './Pages/Cliente/Excluir';
import ClienteConsultar from './Pages/Cliente/Consultar';

// Destino
import DestinoLista from './Pages/Destino/Lista';
import DestinoAdicionar from './Pages/Destino/Adicionar';
import DestinoEditar from './Pages/Destino/Editar';
import DestinoExcluir from './Pages/Destino/Excluir';
import DestinoConsultar from './Pages/Destino/Consultar';

// Pacote
import PacoteLista from './Pages/Pacote/Lista';
import PacoteAdicionar from './Pages/Pacote/Adicionar';
import PacoteEditar from './Pages/Pacote/Editar';
import PacoteExcluir from './Pages/Pacote/Excluir';
import PacoteConsultar from './Pages/Pacote/Consultar';


function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Nav />
            <Routes>
                {/* Home */}
                <Route path="/" element={<Home />} />
                <Route path="/destinos" element={<Destinos />} />
                <Route path="/promo" element={<Promo />} /> 
                <Route path="/contato" element={<Contato />} />

                {/* Cliente */}
                <Route path="/cliente"          element={<ClienteLista />} />
                <Route path="/clienteadicionar" element={<ClienteAdicionar />} />
                <Route path="/clienteeditar"    element={<ClienteEditar />} />
                <Route path="/clienteexcluir"   element={<ClienteExcluir />} />
                <Route path="/clienteconsultar" element={<ClienteConsultar />} />

                {/* Destino */}
                <Route path="/destino" element={<DestinoLista />} />
                <Route path="/destinoadicionar" element={<DestinoAdicionar />} />
                <Route path="/destinoeditar" element={<DestinoEditar />} />
                <Route path="/destinoexcluir" element={<DestinoExcluir />} />
                <Route path="/destinoconsultar" element={<DestinoConsultar />} />

                {/* Pacote */}
                <Route path="/pacote" element={<PacoteLista />} />
                <Route path="/pacoteadicionar" element={<PacoteAdicionar />} />
                <Route path="/pacoteeditar" element={<PacoteEditar />} />
                <Route path="/pacoteexcluir" element={<PacoteExcluir />} />
                <Route path="/pacoteconsultar" element={<PacoteConsultar />} />

            </Routes>
        </BrowserRouter>
      <Footer />
    </div>
  );
}

export default App;
