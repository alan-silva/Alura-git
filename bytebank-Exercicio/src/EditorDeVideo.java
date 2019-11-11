
public class EditorDeVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando Bonificação Editor De video ");
		return super.getBonificacao() + 100;
	}
	
	
}
