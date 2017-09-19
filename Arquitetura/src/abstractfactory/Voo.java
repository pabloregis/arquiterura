package abstractfactory;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public abstract class Voo {
	
	private String codigoVoo;
	private int qtdAssentos;
	private String origem;
	private String destino;
	private List<Passageiro> listaPassageiro;
	private List<Passageiro> listaEspera;
	
	
	public String getCodigoVoo() {
		return codigoVoo;
	}

	public void setCodigoVoo(String codigoVoo) {
		this.codigoVoo = codigoVoo;
	}

	public int getQtdAssentos() {
		return qtdAssentos;
	}

	public void setQtdAssentos(int qtdAssentos) {
		this.qtdAssentos = qtdAssentos;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public List<Passageiro> getListaPassageiro() {
		return listaPassageiro;
	}

	public void setListaPassageiro(List<Passageiro> listaPassageiro) {
		this.listaPassageiro = listaPassageiro;
	}

	public List<Passageiro> getListaEspera() {
		return listaEspera;
	}

	public void setListaEspera(List<Passageiro> listaEspera) {
		this.listaEspera = listaEspera;
	}

	public Voo(String codigoVoo, int qtdAssentos, String origem, String destino) {
		this.codigoVoo = codigoVoo;
		this.destino = destino;
		this.origem = origem;
		this.qtdAssentos = qtdAssentos;
		
		this.listaEspera = new LinkedList<>();
		this.listaPassageiro = new LinkedList<>();
		
		
	}
	
	public Voo() {
		// TODO Auto-generated constructor stub
	}
	
	public void lerVoo(){
		setCodigoVoo(JOptionPane.showInputDialog("Digite o codigo do Voo: "));
		setQtdAssentos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Assentos: ")));
		setOrigem(JOptionPane.showInputDialog("Digite a Origem: "));
		setDestino(JOptionPane.showInputDialog("Digite o Destino: "));
	}
}
