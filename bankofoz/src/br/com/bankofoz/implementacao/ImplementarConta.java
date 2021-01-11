package br.com.bankofoz.implementacao;

import javax.swing.JOptionPane;

import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Magica;
import br.com.bankofoz.beans.Poupanca;

public class ImplementarConta {

	public static void main(String[] args) {
		
		
		Conta conta = null;
		
		char resp = JOptionPane.showInputDialog("Cadastrar: \n<A> Conta Corrente\n<B> Conta Poupança").charAt(0);
			
		if (resp == 'A') {
			conta = new Corrente(
					(short) Magica.i ("Numero"),
					(byte)  Magica.i ("Digito"),
					(short) Magica.i ("Agencia"),
					0,
					new Cliente (
							Magica.i("Codigo do cliente"),
							Magica.s("nome do cliente"),
							Magica.s("CPF"),
							Magica.s("Tel")
							),
					Magica.f("limite"),
					Magica.f("Taxa")
					);	
			
		}else if (resp == 'B') {
			conta = new Poupanca(
			(short) Magica.i ("Numero"),
			(byte)  Magica.i ("Digito"),
			(short) Magica.i ("Agencia"),
			0,
			new Cliente (
					Magica.i("Codigo do cliente"),
					Magica.s("nome do cliente"),
					Magica.s("CPF"),
					Magica.s("Tel")
					),
			Magica.f("rendimento")
			);	
				
		}
		
		System.out.println(conta.depositar(Magica.f("valor depositado")));
		System.out.println(conta.toString());
		//System.out.println(conta.
		//System.out.println(conta.
		

	}

}
