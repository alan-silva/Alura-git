
public class Gerente extends Funcionario{ // Gerente herda da classe funcionario 
	
	
	private int senha;
	
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do Gerente");
		return super.getBonificacao() + super.getSalario();
		
	}
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public boolean autentica(int senha) {
		if (this.senha == senha ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	

	
	
	
	

}
