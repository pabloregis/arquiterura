package iterator;


import java.util.Arrays;
import java.util.Iterator;

public class Vetor<T> implements IVetor<T> {
	private final short tamVetor=10;
	private T[] elementos;
	private int contElementos;
	private int tamInicial;
	private int tamRedimensionar;
	
	private Iterator<T> myIterator = new Iterator<T>() {
		
		int posAtual = -1;
		
		@Override
		public boolean hasNext() {
			if (elementos[posAtual+1] != null)
				return true;
			return false;
		}

		@Override
		public T next() {
			posAtual++;
			return elementos[posAtual];
		}

		@Override
		public void remove() throws IllegalStateException {
			if (posAtual<0)
				throw new IllegalStateException();
			else
			{
				for (int i=posAtual; i< contElementos; i++){
					elementos[i]=elementos[i+1];
					elementos[i+1]=null;
				}
				contElementos--;
			}
		}
	};
	
	public Vetor()
	{
		this.elementos = (T[])new Object[this.tamVetor];
		this.tamRedimensionar=5;
	}
	
	public Vetor(int tamVetor)
	{
		this.elementos = (T[])new Object[tamVetor];
		this.tamRedimensionar=5;
	}
	
	public Vetor(int tamVetor, int incremento)
	{
		this.elementos = (T[])new Object[tamVetor];
		this.tamRedimensionar=incremento;
	}
	
	public void Inserir(int pos, T[] lista) throws ArrayIndexOutOfBoundsException {
		if (pos >= this.contElementos)
			throw new ArrayIndexOutOfBoundsException();
		else
		{
			int tamLista = lista.length;
			
			for (int i=tamLista-1; i> 0; i--){
				this.Adicionar(pos, lista[i]);
			}
		}
	}
	
	public void VerificarEspaco() {
		if (this.contElementos == this.elementos.length)
		{
			T[] vetorAux = (T[])new Object[this.elementos.length+this.tamRedimensionar];
			System.arraycopy(elementos, 0, vetorAux, 0, this.elementos.length);
			this.elementos=vetorAux;
		}
	}
	
	@Override
	public void Adicionar(T elemento) {
		VerificarEspaco();
		this.elementos[contElementos] = elemento;
		this.contElementos++;
	}

	@Override
	public void Adicionar(int posicao, T elemento)
			throws ArrayIndexOutOfBoundsException {
		if (posicao > this.contElementos)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			VerificarEspaco();
			for (int i=contElementos; i >= posicao; i--){
				if (elementos[i] != null)
				{
					this.elementos[i+1]=this.elementos[i];
				}
			}
			this.elementos[posicao]=elemento;
			this.contElementos++;
		}
	}

	@Override
	public void AdicionarInicio(T elemento) {
//		Não está errado mas está usando o arraycopy
//		T[] vetorAux = (T[]) new Object[this.elementos.length+this.tamRedimensionar];
//		System.arraycopy(elemento, 0, vetorAux, 1, elementos.length);
//		elementos = vetorAux;
//		elementos[0] = (T) elemento;
		
		this.Adicionar(0, elemento);
	}

	@Override
	public void Remover(int posicao) throws ArrayIndexOutOfBoundsException {
		if (posicao >= this.contElementos)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			for (int i=posicao; i< contElementos-1; i++){
				this.elementos[i]=this.elementos[i+1];
			}
			this.elementos[contElementos-1]=null;
			this.contElementos--;
		}
	}

	@Override
	public void Remover(T elemento) {
		for (int i=0; i< this.contElementos; i++){
			if (elemento.equals(this.elementos[i]))
				this.Remover(i);
		}
	}

	@Override
	public void RemoverInicio() {
		this.Remover(0);
	}

	@Override
	public void RemoverFim() {
		this.Remover(contElementos-1);
	}

	@Override
	public int Tamanho() {
		return this.contElementos;
	}

	@Override
	public void Limpar() {
		this.contElementos=0;
		for (int i = 0; i < elementos.length; i++) {
			elementos[i]=null;
		}
	}

	@Override
	public boolean contem(T elemento) {
		for (int i=0; i< this.contElementos; i++){
			if (elementos[i].equals(elemento))
				return true;
		}
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return myIterator;
	}
	
	@Override
	public String toString() {
		boolean contemElementos=false;
		for (int i=0; i< this.contElementos; i++){
			if (this.elementos[i] != null)
				{
					contemElementos = true;
					break;
				}
			break;
		}
		
		if (contemElementos)
		{
			String vetorS="";
			vetorS="[";
			for (int i=0; i< contElementos-1; i++){
				vetorS += elementos[i]+", ";
			}
			vetorS += elementos[contElementos-1] + "]";
			return vetorS;
		}
		return "[]";
	}
}