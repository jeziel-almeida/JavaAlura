public class CriaFuncionario {
    public static void main(String[] args) {
		
		Gerente jezielGerente = new Gerente();

		jezielGerente.setSenha(2222);
		jezielGerente.setNome("Jeziel Almeida");
		jezielGerente.setCpf("222-22");
		jezielGerente.setSalario(2200);

		System.out.println();
	
		SistemaInterno sisInterno = new SistemaInterno();
		sisInterno.autentica(jezielGerente);



		System.out.println("Nome: "+jezielGerente.getNome());
		System.out.println("CPF: "+jezielGerente.getCpf());
		System.out.println("Salário: "+jezielGerente.getSalario());
		System.out.println("Bonificação: "+jezielGerente.getBonificacao());

		System.out.println();
	}
}