package hierarquia_empresa;

public class TestarSistemaInterno {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		Administrador adm = new Administrador();
		Cliente cliente = new Cliente();
		
		g1.setNome("Daniel");
		g1.setLogin("login");
		g1.setSenha(2222);
		
		adm.setNome("João Pedro");
		adm.setLogin("login");
		adm.setSenha(2222);
		
		cliente.setLogin("login");
		cliente.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		
		System.out.print(g1.getNome()+ " ");
		si.autenticar(g1);
		
		System.out.print(adm.getNome()+ " ");
		si.autenticar(adm);
		
		System.out.print("Cliente ");
		si.autenticar(cliente);
	}

}
