package util;

public class ErrorMessage {

	private static String msg;
	
	public ErrorMessage(){
		msg = null;
	}
	
	@SuppressWarnings("unused")
	public static String autenticarUsuario(Exception e)
	{
		msg = "<table><tr><td><b><font color='red'> Erro ao criar o usu�rio. </font></b></td></tr>" +
		"<tr><td><br> Erro:" + e.toString() +"</td></tr></table>";
		
		return msg;
	}
	public static String editarUsuario()
	{
		msg = "<table><tr><td><b><font color='red'> Erro ao salvar informa��es do usu�rio. </font></b></td></tr>";
		
		return msg;
	}

}
