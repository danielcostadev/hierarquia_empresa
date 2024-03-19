package hierarquia_empresa;

// Contrato Autenticavel
// Quem assina o contrato precisa implementar:
// os metodos setSenha e autenticar

public abstract interface Autenticavel {

	// Getters e Setters
	public abstract void setLogin(String login);
	
	public abstract void setSenha(int senha);

	// Métodos

	public abstract boolean autenticar(String login, int senha);
}