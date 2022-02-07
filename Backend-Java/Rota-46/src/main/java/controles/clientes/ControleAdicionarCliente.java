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
 * Servlet implementation class ControleAdicionarCliente
 */
@WebServlet("/cliente/controlerincluir")
public class ControleAdicionarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleAdicionarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher despacho = null;
		
		try {

			DAOCliente daoCliente = new DAOCliente();
			Cliente cliente = new Cliente();
					
			cliente.setNome(request.getParameter("txtNome"));
			cliente.setEndereco(request.getParameter("txtEndereco"));
			cliente.setTelefone(request.getParameter("txtTelefone"));
			cliente.setCpf(request.getParameter("txtCPF"));
			cliente.setSexo(request.getParameter("slcSexo"));
			cliente.setIdade(Integer.parseInt(request.getParameter("txtIdade"))); 
			
			System.out.println(request.getParameter("txtNome"));
			System.out.println(request.getParameter("txtEndereco"));
			System.out.println(request.getParameter("txtNome"));
			System.out.println(request.getParameter("txtTelefone"));
			System.out.println(request.getParameter("slcSexo"));
			System.out.println(request.getParameter("txtIdade"));
			
			daoCliente.incluir(cliente);
			request.setAttribute("msg", "Cliente cadastrado com sucesso!");
			despacho = request.getRequestDispatcher("sucesso.jsp");
		
		}catch (Exception exception) {
			request.setAttribute("msg", "Erro ao tentar cadastrar cliente!");
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
