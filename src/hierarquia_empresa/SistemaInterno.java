package hierarquia_empresa;

public class SistemaInterno {
	
	private String login = "login";
	private int senha = 2222;
	
	public void autenticar(Autenticavel aut) {
		
		boolean autenticou = aut.autenticar(this.login, this.senha);
		
		if (autenticou) {
			System.out.println("Logado com sucesso!");
		} else {
			System.out.println("Login ou Senha estão incorretos!");
		}
		
	}
}
