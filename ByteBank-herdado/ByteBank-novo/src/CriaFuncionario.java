public class CriaFuncionario {
    public static void main(String[] args) {
		
		Gerente jezielGerente = new Gerente();

		jezielGerente.setSenha(321);
		jezielGerente.setNome("Jeziel Almeida");
		jezielGerente.setCpf("222-22");
		jezielGerente.setSalario(2200);

		boolean entrou = jezielGerente.autentica(321);

		System.out.println();

		System.out.println("Nome: "+jezielGerente.getNome());
		System.out.println("CPF: "+jezielGerente.getCpf());
		System.out.println("Salário: "+jezielGerente.getSalario());
		System.out.println("Bonificação: "+jezielGerente.getBonificacao());
		System.out.println("Entrou: "+entrou);

		System.out.println();
	}
}