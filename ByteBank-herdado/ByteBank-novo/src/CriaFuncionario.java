public class CriaFuncionario {
    public static void main(String[] args) {
		Funcionario jezi = new Funcionario();
		jezi.setNome("Jeziel");
		jezi.setSalario(1000);
		System.out.println(jezi.getNome() +" tem a bonificação de "+ jezi.getBonificacao());
		
		Gerente boni = new Gerente();
		boni.setNome("Boni");
		boni.setSalario(1000);
		System.out.println(boni.getNome() +" tem a bonificação de "+ boni.getBonificacao());
	}
}
