package hierarquia_empresa;

public class Secretaria extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("SECRETÁRIA");
		return 100;
	}

}
