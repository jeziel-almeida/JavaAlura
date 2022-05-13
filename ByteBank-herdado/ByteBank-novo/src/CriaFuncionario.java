public class CriaFuncionario {
    public static void main(String[] args) {
		
		Gerente jezielGerente = new Gerente();
		Administrador jezielAdm = new Administrador();

		// jezielAdm.setSenha(2221);
		// jezielGerente.setSenha(2222);

		jezielGerente.setSalario(2200);

		System.out.println();
	
		SistemaInterno sisInterno = new SistemaInterno();
		// sisInterno.autentica(jezielGerente);
		// sisInterno.autentica(jezielAdm);

		System.out.println();
	}
}