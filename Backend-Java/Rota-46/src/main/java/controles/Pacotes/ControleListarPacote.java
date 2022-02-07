package controles.Pacotes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.pacote.Pacote;
import modelo.pacote.PacoteJoin;
import modelo.persistencia.DAOPacote;

/**
 * Servlet implementation class ControleListarPacote
 */
@WebServlet("/pacote/listarpacote")
public class ControleListarPacote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleListarPacote() {
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
		//List<Pacote> pacotes = new ArrayList<Pacote>();
		//pacotes = dao.ListarPacotes();
		List<PacoteJoin> pacotesJoin = new ArrayList<PacoteJoin>();
		pacotesJoin = dao.ListarPacotes();
		request.setAttribute("pac", pacotesJoin);

		
		despacho = request.getRequestDispatcher("index.jsp");
		
		}catch (Exception e) {
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
