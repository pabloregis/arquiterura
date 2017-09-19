package abstractfactory;
import javax.swing.JOptionPane;

public class VooNacional extends Voo{
	
	private int qtdAssentosConfortaveis;
	public VooNacional() {
		super();
	}
	public int getQtdAssentosConfortaveis() {
		return qtdAssentosConfortaveis;
	}

	public void setQtdAssentosConfortaveis(int qtdAssentosConfortaveis) {
		this.qtdAssentosConfortaveis = qtdAssentosConfortaveis;
	}

	public VooNacional(String codigoVoo, int qtdAssentos, String origem, String destino, int qtdAssentosConfortaveis) {
		super(codigoVoo, qtdAssentos, origem, destino);
		setQtdAssentosConfortaveis(qtdAssentosConfortaveis);
	}
	
	public void lerVoo(){
		super.lerVoo();
		setQtdAssentosConfortaveis(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Assentos Confortaveis: ")));
	}	
}
