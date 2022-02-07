package controles.Pacotes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.pacote.Pacote;
import modelo.persistencia.DAOPacote;

/**
 * Servlet implementation class ControleExcluirPacote
 */
@WebServlet("/pacote/excluirpacote")
public class ControleExcluirPacote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleExcluirPacote() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher despacho = null;
		
		try {
			
			DAOPacote dao = new DAOPacote();
			
			Pacote p = new Pacote();
			p.setId(Integer.parseInt(request.getParameter("txtId")));

			dao.Excluir(p);
			
			request.setAttribute("msg", "Pacote excluido com sucesso!");
			despacho = request.getRequestDispatcher("sucesso.jsp");
			
		}catch (Exception e) {
			request.setAttribute("msg", "Erro ao tentar excluir pacote!");
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
