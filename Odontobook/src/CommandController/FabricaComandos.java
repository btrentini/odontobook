package CommandController;


/**
 * Fábrica de comandos
 *
 */
public class FabricaComandos {

	/**
	 * Retorna o comando associado a ação
	 * 
	 * @param acao ação desejada
	 * @return comando associado
	 */	
	public static Comando obterComando(String acao) {

		Comando cmd = null;


		if(acao.equals("newUser")) {
			cmd = new ComandoCriar();
		} else if(acao.equals("login"))
		{
			cmd = new ComandoLogar();
		}	
		else if(acao.equals("editarPerfil")){
			cmd = new ComandoEditarPerfil();
		}	
		else if(acao.equals("PaginaEditarPerfil")){
			cmd = new ComandoPaginaEditarPerfil();
		}
		else if(acao.equals("solicitarPermissao")){
			cmd = new ComandoSolicitarPermissao();
		}	
		else if(acao.equals("buscarDentistas")){
			cmd = new ComandoBuscarDentistas();
		}	
		else if(acao.equals("buscarPacientes")){
			cmd = new ComandoBuscarPacientes();
		}

		else if(acao.equals("exibirEndodontia")){
			cmd = new ComandoExibirEndodontia();
		}
		else if(acao.equals("solicitacoesPendentes")){
			cmd = new ComandoSolicitacoes();
		}
		else if(acao.equals("alterarAnamneseGeral"))
		{
			cmd = new ComandoAlterarAnamneseGeral();
		}else if(acao.equals("recuperarAnamnese"))
		{
			cmd = new ComandoRecuperarAnamnese();
		}else if(acao.equals("dadosDente"))
		{
			cmd = new ComandoDadosDente();
		}else if(acao.equals("visualizarAnamneseDoCara"))
		{
			cmd = new ComandoVisualizarAnamneseDoCara();
		}else if(acao.equals("exibirPrognostico"))
		{
			cmd = new ComandoExibirPrognostico();
		}else if(acao.equals("gravarDadosDente"))
		{
			cmd = new ComandoGravarDadosDente();

		}else if(acao.equals("alterarPrognostico"))
		{
			cmd = new ComandoAlterarPrognostico();
		}else if(acao.equals("pegaDent"))
		{
			cmd = new ComandoPegaDent();
		}
		else if(acao.equals("gravarTratamento"))
		{
			cmd = new ComandoGravarTratamento();
		}
		
		else if(acao.equals("logoff"))
		{
			cmd = new ComandoLogoff();
		}
		else
			throw new IllegalArgumentException("Ação " + acao + 
			" inesperada");

		return cmd;
	}

}
