package modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.destino.Destino;

public class DAODestino {
	
	private Connection conexao = null;
	private PreparedStatement preparedStatement = null;
	
	public DAODestino() throws Exception {
		conexao = BancoDados.getConexao();
	}
	
	// cria lista com todos os destinos
	public List<Destino> Listardestinos() throws SQLException{

        List<Destino> destinos = new ArrayList<Destino>();
        try {
	        String sql = "SELECT * FROM Destinos";
	        Statement stmt = conexao.createStatement();
	        ResultSet result = stmt.executeQuery(sql);
	
	        while(result.next()) {
	        	Destino d = new Destino();
	        	d.setId(result.getInt("Id"));
	        	d.setTitulo(result.getString("Titulo"));
	        	d.setDescricao(result.getString("Descricao"));
	        	d.setTipo(result.getString("Tipo"));
	        	d.setPromo(result.getString("Promo"));
	        	d.setPreco(result.getFloat("Preco"));
	        	destinos.add(d);
	        }
	    } catch(SQLException e) {
	        e.printStackTrace();
	    }
	    return destinos;
	}	

	//cria lista promocoes
	public List<Destino> ListarPromo() throws SQLException{

        List<Destino> destinos = new ArrayList<Destino>();
        try {
	        String sql = "SELECT * FROM Destinos WHERE Promo = 'Sim'";
	        Statement stmt = conexao.createStatement();
	        ResultSet result = stmt.executeQuery(sql);
	
	        while(result.next()) {
	        	Destino d = new Destino();
	        	d.setId(result.getInt("Id"));
	        	d.setTitulo(result.getString("Titulo"));
	        	d.setDescricao(result.getString("Descricao"));
	        	d.setTipo(result.getString("Tipo"));
	        	d.setPromo(result.getString("Promo"));
	        	d.setPreco(result.getFloat("Preco"));
	        	destinos.add(d);
	        }
	    } catch(SQLException e) {
	        e.printStackTrace();
	    }
	    return destinos;
	}	
	
	
	
	public void incluir(Destino d) throws Exception {
		final String sql = "INSERT INTO Destinos (Titulo, Descricao, Tipo, Promo, Preco) VALUES(?,?,?,?,?)";	
		preparedStatement = conexao.prepareStatement(sql);
		preparedStatement.setString(1, d.getTitulo());
		preparedStatement.setString(2, d.getDescricao());
		preparedStatement.setString(3, d.getTipo());
		preparedStatement.setString(4, d.getPromo());
		preparedStatement.setFloat(5, d.getPreco());
		preparedStatement.executeUpdate();	
	}
	
	public Destino ConsultarId(int id) throws Exception{
	//System.out.println("id:"+id);
	final String sql = "SELECT * FROM Destinos WHERE Id = ?";
		Destino d = new Destino();
		preparedStatement = conexao.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			
			d.setId(resultSet.getInt("Id"));
			d.setTitulo(resultSet.getString("Titulo"));
			d.setDescricao(resultSet.getString("Descricao"));
			d.setTipo(resultSet.getString("Tipo"));
			d.setPromo(resultSet.getString("Promo"));
			d.setPreco(resultSet.getFloat("Preco"));							
		}
		
		return d;
	}	
	
	public void Alterar(Destino d) throws Exception{
		
		final String sql = "UPDATE Destinos set  Titulo = ?,  Descricao = ?, Tipo = ?, Promo = ?, Preco = ? WHERE Id = ?";

		preparedStatement = conexao.prepareStatement(sql);
		
		preparedStatement.setString(1, d.getTitulo());
		preparedStatement.setString(2, d.getDescricao());
		preparedStatement.setString(3, d.getTipo());
		preparedStatement.setString(4, d.getPromo());
		preparedStatement.setFloat(5, d.getPreco());
		preparedStatement.setInt(6, d.getId());
		
		preparedStatement.executeUpdate();		
	}

	public void Excluir(Destino d) throws Exception{
		
		final String sql = "DELETE FROM Destinos WHERE Id = ?";
		
			preparedStatement = conexao.prepareStatement(sql);
			preparedStatement.setInt(1, d.getId());
			preparedStatement.executeUpdate();	
	}
	
	public List<Destino> ConsultarDestinos(String titulo) throws SQLException{

        List<Destino> destinos = new ArrayList<Destino>();
  
    	String sql = "SELECT * FROM Destinos WHERE Titulo LIKE ? "; // Usei o LIKE aqui, achei que caberia bem.
  
		preparedStatement = conexao.prepareStatement(sql);
		preparedStatement.setString(1, titulo+"%");
		ResultSet result = preparedStatement.executeQuery();
        while(result.next()) {
        	Destino d = new Destino();
        	d.setId(result.getInt("Id"));
        	d.setTitulo(result.getString("Titulo"));
        	d.setDescricao(result.getString("Descricao"));
        	d.setTipo(result.getString("Tipo"));
        	d.setPromo(result.getString("Promo"));
        	d.setPreco(result.getFloat("Preco"));
        	destinos.add(d);
        }

	    return destinos;	    
	}
}
