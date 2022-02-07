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
 * Servlet implementation class ControleConsultarCliente
 */
@WebServlet("/cliente/consultarcpf")
public class ControleConsultarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleConsultarCliente() {
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
			c.setCpf(request.getParameter("txtCPF"));
			c = dao.consultarCPF(c.getCpf()); 
			request.setAttribute("cli", c);
			if(c.getNome()==null) 
			{
				request.setAttribute("msg", "Erro ao consultar!");
				despacho = request.getRequestDispatcher("erro.jsp");
			}else 
			{
				despacho = request.getRequestDispatcher("consulta.jsp");
			}
			
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
