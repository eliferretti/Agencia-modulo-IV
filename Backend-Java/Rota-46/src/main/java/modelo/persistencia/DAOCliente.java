package modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import modelo.cliente.Cliente;

public class DAOCliente {
	
	private Connection conexao = null;
	private PreparedStatement preparedStatement = null;
	
	public DAOCliente() throws Exception {
		conexao = BancoDados.getConexao();
	}
	
	public void incluir(Cliente cliente) throws Exception {
		final String instrucao_sql = "INSERT INTO Clientes (Nome, Endereco, Telefone, CPF, Sexo, Idade) VALUES(?,?,?,?,?,?)";	
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		preparedStatement.setString(1, cliente.getNome());
		preparedStatement.setString(2, cliente.getEndereco());
		preparedStatement.setString(3, cliente.getTelefone());
		preparedStatement.setString(4, cliente.getCpf());
		preparedStatement.setString(5, cliente.getSexo());
		preparedStatement.setInt(6, cliente.getIdade());
		preparedStatement.executeUpdate();	
	}

	public List<Cliente> consultar() throws SQLException{

        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
	        String sql = "SELECT * FROM Clientes";
	        Statement stmt = conexao.createStatement();
	        ResultSet result = stmt.executeQuery(sql);
	
	        while(result.next()) {
	        	Cliente cli = new Cliente();
	        	cli.setId(result.getInt("Id"));
	        	cli.setNome(result.getString("Nome"));
	        	cli.setEndereco(result.getString("Endereco"));
	        	cli.setTelefone(result.getString("Telefone"));
	        	cli.setCpf(result.getString("CPF"));
	        	cli.setSexo(result.getString("Sexo"));
	        	cli.setIdade(result.getInt("Idade"));
	  	
	            clientes.add(cli);
	        }
	    } catch(SQLException e) {
	        e.printStackTrace();
	    }
	    return clientes;
	}
	
	public void excluir(Cliente cliente) throws Exception{
		
		final String instrucao_sql = "DELETE FROM Clientes WHERE Id = ?";
		
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setInt(1, cliente.getId());
			preparedStatement.executeUpdate();	
	}
	
	public void alterar(Cliente cliente) throws Exception{
		
		final String instrucao_sql = "UPDATE Clientes set  nome = ?,  Endereco = ?, Telefone = ?, CPF = ?, Sexo = ?, Idade = ? WHERE Id = ?";

			preparedStatement = conexao.prepareStatement(instrucao_sql);
			
			preparedStatement.setString(1, cliente.getNome());
			preparedStatement.setString(2, cliente.getEndereco());
			preparedStatement.setString(3, cliente.getTelefone());
			preparedStatement.setString(4, cliente.getCpf());
			preparedStatement.setString(5, cliente.getSexo());
			preparedStatement.setInt(6, cliente.getIdade());
			preparedStatement.setInt(7, cliente.getId());
			
			preparedStatement.executeUpdate();		
	}
	
	
	public Cliente consultarcliente(int id) throws Exception{
		//System.out.println("id:"+id);
		final String instrucao_sql = "SELECT * FROM Clientes WHERE Id = ?";
			Cliente cliente = new Cliente();
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				cliente.setId(resultSet.getInt("Id"));
				cliente.setNome(resultSet.getString("Nome"));
				cliente.setEndereco(resultSet.getString("Endereco"));
				cliente.setTelefone(resultSet.getString("Telefone"));
				cliente.setCpf(resultSet.getString("CPF"));
				cliente.setSexo(resultSet.getString("Sexo"));
	        	cliente.setIdade(resultSet.getInt("Idade"));				
			}
		
		return cliente;
		
	}
	public Cliente consultarCPF(String CPF) throws Exception{
		//System.out.println("id:"+id);
		final String instrucao_sql = "SELECT * FROM Clientes WHERE CPF = ?";
		
		Cliente cliente = new Cliente();
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		
		preparedStatement.setString(1, CPF);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			cliente.setId(resultSet.getInt("Id"));
			cliente.setNome(resultSet.getString("Nome"));
			cliente.setEndereco(resultSet.getString("Endereco"));
			cliente.setTelefone(resultSet.getString("Telefone"));
			cliente.setCpf(resultSet.getString("CPF"));
			cliente.setSexo(resultSet.getString("Sexo"));
        	cliente.setIdade(resultSet.getInt("Idade"));				
		}
		return cliente;
	}
}

