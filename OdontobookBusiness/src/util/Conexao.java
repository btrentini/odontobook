package util;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.Properties;


public class Conexao {

	private static final String ARQUIVO_CONF = "resources/conexao.properties";
	
	private static  Properties configuracoes;

	public static Connection obterConexao() {
			
		

		
		try {
			configuracoes = lerConfiguracoes();
			
			String origem  = configuracoes.getProperty("jdbc.origem");
			
			String driver = configuracoes.getProperty(
								origem+".jdbc.driver");
			String url = configuracoes.getProperty(
								origem+".jdbc.url");
			String usuario = configuracoes.getProperty(
								origem+".jdbc.usuario");
			String senha = configuracoes.getProperty(
								origem+".jdbc.senha");
			
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url,usuario,senha);
			
			return con;
			
		} catch (Exception e) {
			
			System.out.println(e);
			throw new RuntimeException("Erro ao obter conexão",e);
		}

	}

	/**
	 * Fecha uma conexão.
	 * @param con conexão.
	 */
	public static void fecharConexao(Connection con) {

		try {
			if(con != null && !con.isClosed())
				con.close();
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao fechar conexão",e);
		}
		
	}

	private static Properties lerConfiguracoes() throws IOException {
		InputStream is =
				Conexao.class.getClassLoader()  
        			.getResourceAsStream("META-INF/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(is);
		return prop;
	}
}
