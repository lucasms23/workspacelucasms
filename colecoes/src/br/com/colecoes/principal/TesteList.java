package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	/*Colletion Framework
	 * Vantagens:
	 * - tamanho dinamico
	 * - nao precisar de um recurso para controlar posição dentro da lista
	 * - lista pode ser heterogenea em relacao ao tipo de dado
	*/
	
	public static void main(String[] args) {
		
		int numeros[] = new int[5];
		
		numeros[0]=1520;
		
		List<String> lista = new ArrayList<String>();
		lista.add("DBA");
		lista.add("DESENVOLVEDOR");
		lista.add("GERENTE DE PROJETOS");
		lista.add("DBA");
		
		System.out.println(lista);
		System.out.println("Elemento 1: "+lista.get(0));;
		lista.remove(0);
		System.out.println("Novo Elemento 1: "+lista.get(0));;
		//Collections.sort(lista);
		//lista2 = Collections.sort(lista);
		System.out.println("Lista Ordenada: "+lista);
		
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
