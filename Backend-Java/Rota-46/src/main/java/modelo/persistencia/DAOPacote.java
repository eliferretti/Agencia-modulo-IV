package modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import modelo.pacote.Pacote;
import modelo.pacote.PacoteJoin;

public class DAOPacote {

	private Connection conexao = null;
	private PreparedStatement preparedStatement = null;
	
	public DAOPacote() throws Exception {
		conexao = BancoDados.getConexao();
	}

	// cria lista com todos os pacotes
	public List<PacoteJoin> ListarPacotes() throws SQLException{

        List<PacoteJoin> pacotesJoin = new ArrayList<PacoteJoin>();
        try {
	    //    String sql = "SELECT * FROM Pacotes";
		    final String sql = ("SELECT Pacotes.Id AS 'Id', Pacotes.DataCompra AS 'DataCompra', Pacotes.DataViagem AS 'DataViagem', Pacotes.Preco AS 'Preco', Clientes.Nome AS 'cNome', Destinos.Titulo AS 'dTitulo' FROM Pacotes INNER JOIN Clientes ON Pacotes.Id_cliente = Clientes.Id INNER JOIN Destinos ON Pacotes.Id_destino = Destinos.Id "); 
	        Statement stmt = conexao.createStatement();
	        ResultSet result = stmt.executeQuery(sql);
	
	        while(result.next()) {
	        	PacoteJoin p = new PacoteJoin();
	 
	        	p.setId(result.getInt("Id"));
	        	p.setNomeCliente(result.getString("cNome"));
	        	p.setTituloDestino(result.getString("dTitulo"));	
	        	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	        	String dataFormatada = formatador.format(result.getDate("DataCompra")); //formata data dd/mm/yyyy
	        	p.setDataCompra(dataFormatada);
	        	dataFormatada = formatador.format(result.getDate("DataViagem"));
	        	p.setDataViagem(dataFormatada);
	        	p.setPreco(result.getFloat("Preco"));
	        	
	        	pacotesJoin.add(p);
	        }
	    } catch(SQLException e) {
	        e.printStackTrace();
	    }
	    return pacotesJoin;
	}
	
	
	/*
	 	public List<Pacote> ListarPacotes() throws SQLException{

        List<Pacote> pacotes = new ArrayList<Pacote>();
        try {
	        String sql = "SELECT * FROM Pacotes";
	        Statement stmt = conexao.createStatement();
	        ResultSet result = stmt.executeQuery(sql);
	
	        while(result.next()) {
	        	Pacote p = new Pacote();
	 
	        	p.setId(result.getInt("Id"));
	        	p.setIdCliente(result.getInt("Id_cliente"));
	        	p.setIdDestino(result.getInt("Id_destino"));	
	        	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	        	String dataFormatada = formatador.format(result.getDate("DataCompra")); //formata data dd/mm/yyyy
	        	p.setDataCompra(dataFormatada);
	        	dataFormatada = formatador.format(result.getDate("DataViagem"));
	        	p.setDataViagem(dataFormatada);
	        	p.setPreco(result.getFloat("Preco"));
	        	
	          	pacotes.add(p);
	        }
	    } catch(SQLException e) {
	        e.printStackTrace();
	    }
	    return pacotes;
	}
	 */
	
	
	public void incluir(Pacote p) throws Exception {
		final String sql = "INSERT INTO Pacotes (Id_cliente, Id_destino, DataCompra, DataViagem, Preco) VALUES(?,?,?,?,?)";	
		preparedStatement = conexao.prepareStatement(sql);
		
		preparedStatement.setInt(1, p.getIdCliente());
		preparedStatement.setInt(2, p.getIdDestino());
		preparedStatement.setString(3, p.getDataCompra());
		preparedStatement.setString(4, p.getDataViagem());
		preparedStatement.setFloat(5, p.getPreco());


		preparedStatement.executeUpdate();	
	}	
	
	
	public PacoteJoin ConsultarIdJoin(int id) throws Exception{
		
		    final String sql = ("SELECT Pacotes.Id AS 'Id', Pacotes.DataCompra AS 'DataCompra', Pacotes.DataViagem AS 'DataViagem', Pacotes.Preco AS 'Preco', Clientes.Nome AS 'cNome', Destinos.Titulo AS 'dTitulo' FROM Pacotes INNER JOIN Clientes ON Pacotes.Id_cliente = Clientes.Id INNER JOIN Destinos ON Pacotes.Id_destino = Destinos.Id WHERE Pacotes.Id = ?"); 
			PacoteJoin p = new PacoteJoin();
			preparedStatement = conexao.prepareStatement(sql);
			preparedStatement.setInt(1, id);		
			ResultSet resultSet = preparedStatement.executeQuery();	
			
			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			String dataFormatada;
			
			while(resultSet.next()) {		
				p.setId(resultSet.getInt("Id"));
				dataFormatada = formatador.format(resultSet.getDate("DataCompra"));
				p.setDataCompra(dataFormatada);
				dataFormatada = formatador.format(resultSet.getDate("DataViagem"));
				p.setDataViagem(dataFormatada);
				p.setPreco(resultSet.getFloat("Preco"));
				p.setNomeCliente(resultSet.getString("cNome"));
				p.setTituloDestino(resultSet.getString("dTitulo"));
				System.out.println("Titulo: "+ p.getTituloDestino());
			}
			return p;
		}	
	
	
	public Pacote ConsultarId(int id) throws Exception{
	
	final String sql = "SELECT * FROM Pacotes WHERE Id = ?";
		Pacote p = new Pacote();
		preparedStatement = conexao.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			
			p.setId(resultSet.getInt("Id"));
			p.setIdCliente(resultSet.getInt("Id_cliente"));
			p.setIdDestino(resultSet.getInt("Id_destino"));
			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        	String dataFormatada = formatador.format(resultSet.getDate("DataCompra")); //formata data dd/mm/yyyy
        	p.setDataCompra(dataFormatada);
        	dataFormatada = formatador.format(resultSet.getDate("DataViagem"));
        	p.setDataViagem(dataFormatada);
			p.setPreco(resultSet.getFloat("Preco"));
										
		}	
		return p;
	}	
	
	
	public void Alterar(Pacote p) throws Exception{
		
		final String sql = "UPDATE Pacotes SET  Id_cliente = ?,  Id_destino = ?, DataCompra = ?, DataViagem = ?, Preco = ? WHERE Id = ?";

		preparedStatement = conexao.prepareStatement(sql);
		
		preparedStatement.setInt(1, p.getIdCliente());
		preparedStatement.setInt(2, p.getIdDestino());
		preparedStatement.setString(3, p.getDataCompra());
		preparedStatement.setString(4, p.getDataViagem());
		preparedStatement.setFloat(5, p.getPreco());
		preparedStatement.setInt(6, p.getId());
		
		System.out.println("dao editar");
		System.out.println(p.getIdCliente());
		System.out.println(p.getIdDestino());
		System.out.println(p.getDataCompra());
		System.out.println(p.getDataViagem());
		System.out.println(p.getPreco());
		
		preparedStatement.executeUpdate();		
	}


	
	public void Excluir(Pacote p) throws Exception{
		
		final String sql = "DELETE FROM Pacotes WHERE Id = ?";
		
			preparedStatement = conexao.prepareStatement(sql);
			preparedStatement.setInt(1, p.getId());
			preparedStatement.executeUpdate();	
	}
	
	
	public List<Pacote> ConsultarPacotes(int id) throws SQLException{
		System.out.println("dao pac id: "+ id);
        List<Pacote> pacotes = new ArrayList<Pacote>();
  
    	String sql = "SELECT * FROM Pacotes WHERE Id = ?"; 
  
		preparedStatement = conexao.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet result = preparedStatement.executeQuery();
        while(result.next()) {
        	Pacote p = new Pacote();
        	System.out.println(p);
        	
        	p.setId(result.getInt("Id"));
        	p.setIdCliente(result.getInt("Id_cliente"));
        	p.setIdDestino(result.getInt("Id_pacote"));
        	p.setDataCompra(result.getDate("DataCompra").toString());
        	p.setDataViagem(result.getDate("DataViagem").toString());
        	p.setPreco(result.getFloat("Preco"));
        	
        	System.out.println("Preco: " + result.getFloat("Preco"));
        	pacotes.add(p);
        	
        }

	    return pacotes;	    
	} 	
}
