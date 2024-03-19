package hierarquia_empresa;

public class Cliente implements Autenticavel {
	
	// Atributos
	private Autenticacao autenticador;
	
	// Construtor
	public Cliente() {
		this.autenticador = new Autenticacao();
	}
	
	// Metodos
	
	// Assinatura e implementação do contrato com Autenticavel
	@Override
	public void setLogin(String login) {
		this.autenticador.setLogin(login);
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autenticar(String login, int senha) {
		return this.autenticador.autenticar(login,senha);
	}

}
