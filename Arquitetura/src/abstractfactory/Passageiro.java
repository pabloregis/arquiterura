package abstractfactory;
import javax.swing.JOptionPane;

public class Passageiro {
	
	private String nome;
	private String CPF;
	
	public Passageiro(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}
	
	public Passageiro() {
		
	}
	
	public static  Passageiro lerPassageiro(){
		Passageiro passageiro = new Passageiro(JOptionPane.showInputDialog("Digite o nome: "),
				JOptionPane.showInputDialog("Digite o CPF: "));
		return passageiro;
	}
	
}
