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
 * Servlet implementation class ControleEditarPaacote
 */
@WebServlet("/pacote/controleralterar")
public class ControleEditarPacote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleEditarPacote() {
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
			p.setIdCliente(Integer.parseInt(request.getParameter("txtIdCliente")));
			p.setIdDestino(Integer.parseInt(request.getParameter("txtIdDestino")));
			p.setDataCompra(request.getParameter("txtDataCompra"));
			p.setDataViagem(request.getParameter("txtDataViagem"));
			p.setPreco(Float.parseFloat(request.getParameter("txtPreco")));
			
			System.out.println("controle alterar");
			System.out.println("id....: "+request.getParameter("txtId"));
			System.out.println("id cli: "+request.getParameter("txtIdCliente"));
			System.out.println("id pac: "+request.getParameter("txtIdDestino"));
			System.out.println("dc....: "+request.getParameter("txtDataCompra"));
			System.out.println("dv....: "+request.getParameter("txtDataViagem"));
			System.out.println("preco.: "+request.getParameter("txtPreco"));
			
			
			dao.Alterar(p);
			
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
