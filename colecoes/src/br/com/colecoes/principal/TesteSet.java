package br.com.colecoes.principal;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<String>();
		
		lista.add("DBA");
		lista.add("DESENVOLVEDOR");
		lista.add("GERENTE DE PROJETOS");
		lista.add("DBA");
		
		System.out.println(lista);
		
		/*
		for (int contador=0; contador < lista.size(); contador++) {
			System.out.println("Cargo: "+lista.get(contador));
		}
		*/
		for (String cargo : lista) {
			System.out.println("Cargo: "+cargo);
		}
		
	}

}
