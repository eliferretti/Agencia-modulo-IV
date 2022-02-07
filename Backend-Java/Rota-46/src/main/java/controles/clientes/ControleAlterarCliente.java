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
 * Servlet implementation class ControleAlterarCliente
 */
@WebServlet("/cliente/alterarcliente")
public class ControleAlterarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleAlterarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher despacho = null;
	
		try {
		
			DAOCliente dao = new DAOCliente();
			Cliente c = new Cliente();
			c.setId(Integer.parseInt(request.getParameter("txtId")));
			c.setNome(request.getParameter("txtNome")); 
			c.setEndereco(request.getParameter("txtEndereco"));
			c.setTelefone(request.getParameter("txtTelefone"));
			c.setCpf(request.getParameter("txtCPF"));
			c.setSexo(request.getParameter("slcSexo"));
			c.setIdade(Integer.parseInt(request.getParameter("txtIdade")));
					
			dao.alterar(c);
			
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
