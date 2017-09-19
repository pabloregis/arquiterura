package iterator;

import java.util.Iterator;


public class AppVetor {
	public static void main(String[] args) {
		Vetor<Integer> vetor = new Vetor<Integer>(10);
		
		vetor.Adicionar(1);
		vetor.Adicionar(2);
		vetor.Adicionar(3);
		vetor.Remover(0);
		vetor.AdicionarInicio(0);
		System.out.println(vetor);
		
		Iterator<Integer> it = vetor.iterator();
		int teste= -1;
		while (it.hasNext()){
			teste = it.next();
			System.out.println(teste);
		}
		System.out.println(vetor);
		System.out.println("---");
		
		
		it.remove();
		Iterator<Integer> it2 = vetor.iterator();
		while (it2.hasNext()){
			teste = it2.next();
			System.out.println(teste);
		}
		teste= -1;
		Vetor<Integer> vetor2 = vetor;
		Iterator<Integer> it3 = vetor2.iterator();
		while (it3.hasNext()){
			teste=it3.next();
			System.out.println(teste);
		}
		System.out.println(vetor2);
	}

}
