package hierarquia_empresa;

public class Autenticacao {

	// Atributos
	private String login;
	private int senha;

	// Métodos
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autenticar(String login, int senha) {
		if ((this.login == login) && (this.senha == senha)) {
			return true;
		} else {
			return false;
		}
	}
	
}
