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
 * Servlet implementation class ControleExcluirDestino
 */
@WebServlet("/destino/excluirdestino")
public class ControleExcluirDestino extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleExcluirDestino() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher despacho = null;
		System.out.println("ControleExcluir Id=" + request.getParameter("txtId"));
		
		try {
			
			DAODestino dao = new DAODestino();
			
			Destino d = new Destino();
			d.setId(Integer.parseInt(request.getParameter("txtId")));

			dao.Excluir(d);
			
			request.setAttribute("msg", "Destino excluido com sucesso!");
			despacho = request.getRequestDispatcher("sucesso.jsp");
			
		}catch (Exception e) {
			request.setAttribute("msg", "Erro ao tentar excluir destino!");
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
