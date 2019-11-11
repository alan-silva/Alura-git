
public class TesteGerente {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setCpf("444.555.555.88");
		g1.setNome("Frank Teste");
		g1.setSalario(5000);
		g1.setSenha(2224);
		
		
		System.out.println(g1.autentica(2224));
		
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		
		
		
		
		
		
	}
	
	

}
