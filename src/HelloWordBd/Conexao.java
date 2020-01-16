package HelloWordBd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
// as variaveis sao declaradas dentro da classe antes do metodo
	 
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet result = null;
	
	public Conexao() {
		String servidor = "jdbc:mysql://localhost/testedatabase";
		String user = "root";
		String password = "glaucia1@";
		String driver = "com.mysql.jdbc.Driver";
		try
		{
			Class.forName(driver);
			System.out.print(" Fala serio Conexao ok");

		}
		catch (Exception e){
			System.out.print("Erro " + e.getMessage());
			
		}
	}

	public static void main(String[] args) {
		Conexao conexao = new Conexao() ; 
	}

}
