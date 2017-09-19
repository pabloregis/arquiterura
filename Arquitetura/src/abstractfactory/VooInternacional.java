package abstractfactory;
import javax.swing.JOptionPane;

public class VooInternacional extends Voo{

	private int executiva;
	private int primeiraClasse;
	private int economica;
	
	public VooInternacional() {
		super();
	}
	
	public int getExecutiva() {
		return executiva;
	}



	public void setExecutiva(int executiva) {
		this.executiva = executiva;
	}



	public int getPrimeiraClasse() {
		return primeiraClasse;
	}



	public void setPrimeiraClasse(int primeiraClasse) {
		this.primeiraClasse = primeiraClasse;
	}



	public int getEconomica() {
		return economica;
	}



	public void setEconomica(int economica) {
		this.economica = economica;
	}



	public VooInternacional(String codigoVoo, int qtdAssentos, String origem, String destino,
			int executiva, int primeiraClasse, int economica) {
		super(codigoVoo, qtdAssentos, origem, destino);
		setExecutiva(executiva);
		setPrimeiraClasse(primeiraClasse);
		setEconomica(economica);
	}
	public void lerVoo(){
		super.lerVoo();
		setExecutiva(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de assentos na Executiva: ")));
		setPrimeiraClasse(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de assentos na Primeira Classe: ")));
		setEconomica(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de assentos na Economica: ")));
	}
}
