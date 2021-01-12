package br.com.colecoes.principal;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

	public static void main(String[] args) {
		
		//map <chave-set, valores-list>
		Map<Integer,Cargo> lista = new HashMap<Integer, Cargo>();
		lista.put(1, new Cargo ("DBA", "JR", 5000));
		lista.put(1, new Cargo ("DBA", "PL", 9000));
		lista.put(1, new Cargo ("DBA", "SR", 15000));
		System.out.println(lista);
		
		for (Cargo c : lista.values() ) {
			System.out.println(c.getNome());
			System.out.println(c.getSalario());
		}
		
		
	}

}
