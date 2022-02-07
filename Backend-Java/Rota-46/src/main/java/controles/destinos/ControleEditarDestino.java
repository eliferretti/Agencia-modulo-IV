package controles.destinos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.destino.Destino;
import modelo.persistencia.DAODestino;

/**
 * Servlet implementation class ControleEditarDestino
 */
@WebServlet("/destino/controlereditar")
public class ControleEditarDestino extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleEditarDestino() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher despacho = null;
		
		try {
		
			DAODestino dao = new DAODestino();
			Destino d = new Destino();
			
			d.setId(Integer.parseInt(request.getParameter("txtId")));
			d.setTitulo(request.getParameter("txtTitulo"));
			d.setDescricao(request.getParameter("txtDescricao"));
			d.setTipo(request.getParameter("slcTipo"));
			d.setPromo(request.getParameter("slcPromo"));
			d.setPreco(Float.parseFloat(request.getParameter("txtPreco")));
			
			dao.Alterar(d);
			
			request.setAttribute("msg", "Dados alterados com sucesso!");
			
			despacho = request.getRequestDispatcher("sucesso.jsp");
		
		}catch (Exception e) {
			request.setAttribute("msg", "Erro ao tentar alterar o registro!");
			despacho = request.getRequestDispatcher("erro.jsp");
		}
		finally {
			despacho.forward(request, response);
		}				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
