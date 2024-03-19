package hierarquia_empresa;

//Gerente é um Funcionario herda Funcioario, e assina um Contrato com Autenticável

public class Administrador extends Funcionario implements Autenticavel {
	
	// Atributos
	private Autenticacao autenticador;
	
	// Construtor
	public Administrador() {
		this.autenticador = new Autenticacao();
	}
	
	// Metodos
	@Override
	public double getBonificacao() {
		return 50;
	}

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
