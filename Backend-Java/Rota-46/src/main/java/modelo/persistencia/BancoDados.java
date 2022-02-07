package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;



public class BancoDados {


	private static Connection conexao = null;
	
	//Implementando Singleton
	
	
	private BancoDados() {
		
	}

	private static void inicializarBanco() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	 conexao = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-VV6TL78;integratedSecurity=true;databaseName=CRUDMVC");
		System.out.println(conexao+"\nConexao realizada.");
	}
	
	public static Connection getConexao() throws Exception {
		
		if(conexao==null)
			inicializarBanco();
			return conexao;
	}
	
	


	
}
