public class Gerente extends Funcionario {
    
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) return true;
		return false;
	}

	public boolean autentica(String login, int senha) {
		//código omitido
		return true;
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}

    //
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
}
