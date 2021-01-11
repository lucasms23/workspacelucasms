package br.com.banco.util;

import javax.swing.JOptionPane;

public class Magica {
	
	// Métodos estáticos nao exigem a instancia do objeto
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int i (String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static float f (String msg) {
		return Float.parseFloat(s(msg));
	}
	
}
