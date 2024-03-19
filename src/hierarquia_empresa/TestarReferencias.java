package hierarquia_empresa;

public class TestarReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		Secretaria s1 = new Secretaria();
		
		g1.setNome("Daniel");
		g1.setSalario(5000.0);		
		s1.setNome("Maria");
		s1.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(s1);
		
		System.out.println(controle.getSoma());
	}

}
