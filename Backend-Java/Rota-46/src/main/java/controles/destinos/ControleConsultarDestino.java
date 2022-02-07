package controles.destinos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.destino.Destino;
import modelo.persistencia.DAODestino;

/**
 * Servlet implementation class ControleConsultarDestino
 */
@WebServlet("/destino/consultardestino")
public class ControleConsultarDestino extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleConsultarDestino() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher despacho = null;	
		String titulo = request.getParameter("txtTitulo");
		System.out.println("titulo: "+ titulo);
		try {
		
		DAODestino dao = new DAODestino();
		List<Destino> destinos = new ArrayList<Destino>();
		destinos = dao.ConsultarDestinos(titulo);
	
		request.setAttribute("dest", destinos);
		
		despacho = request.getRequestDispatcher("consulta.jsp");
		
		}catch (Exception e) {
			request.setAttribute("msg", "Erro ao consultar!");
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
