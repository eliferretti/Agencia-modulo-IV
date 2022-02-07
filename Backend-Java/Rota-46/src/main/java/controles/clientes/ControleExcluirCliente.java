package controles.clientes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.cliente.Cliente;
import modelo.persistencia.DAOCliente;


/**
 * Servlet implementation class ControleExcluirCliente
 */
@WebServlet("/cliente/excluircliente")
public class ControleExcluirCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleExcluirCliente() {
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
			
			DAOCliente dao = new DAOCliente();
			
			Cliente cliente = new Cliente();
			cliente.setId(Integer.parseInt(request.getParameter("txtId")));

			dao.excluir(cliente);
			
			request.setAttribute("msg", "Cliente excluido com sucesso!");
			despacho = request.getRequestDispatcher("sucesso.jsp");
			
			}catch (Exception e) {
				request.setAttribute("msg", "Erro ao tentar excluir cliente!");
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
