package br.com.generation.interfaces;

public class TestaInterfaceAnimal {

	public static void main(String[] args) {

		Cachorro cr = new Cachorro();
		cr.nome();
		cr.especie();
		cr.som();
		
		System.out.println();
		
		Cavalo cv = new Cavalo();
		cv.nome();
		cv.especie();
		cv.som();
		
		System.out.println();
		
		Preguica pr = new Preguica();
		pr.nome();
		pr.especie();
		pr.som();
	}
}
