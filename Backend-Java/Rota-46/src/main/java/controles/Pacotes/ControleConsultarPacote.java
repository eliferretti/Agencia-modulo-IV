package controles.Pacotes;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.pacote.Pacote;
import modelo.pacote.PacoteJoin;
//import modelo.pacote.PacoteJoin;
import modelo.persistencia.DAOPacote;

/**
 * Servlet implementation class ControleConsultarPacote
 */
@WebServlet("/pacote/consultarpacote")
public class ControleConsultarPacote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleConsultarPacote() {
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
			
			PacoteJoin pJoin = new PacoteJoin(); 
			pJoin.setId(Integer.parseInt(request.getParameter("txtId")));
			pJoin = dao.ConsultarIdJoin(pJoin.getId());
			
			/*
			Pacote p = new Pacote();
			
			p.setId(Integer.parseInt(request.getParameter("txtId")));
			p = dao.ConsultarId(p.getId());
			*/ 
			request.setAttribute("pac", pJoin);
			//despacho = request.getRequestDispatcher("consulta.jsp");
			
			if( (pJoin.getId()%1!=0) || (pJoin.getId()==0) ) // gambiarra pra verificar se é inteiro
			{
				request.setAttribute("msg", "Não foi possível encontrar!");
				despacho = request.getRequestDispatcher("erro.jsp");
			}else 
			{
				despacho = request.getRequestDispatcher("consulta.jsp");
			}
			
		}catch (Exception e) {
			request.setAttribute("msg", "Erro ao tentar consultar!");
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
