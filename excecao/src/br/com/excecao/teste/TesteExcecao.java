package br.com.excecao.teste;

public class TesteExcecao {

	public static void main(String[] args) {

		try {		
			int numero = Integer.parseInt("aa");
			System.out.println("Variavel: "+numero);

			String palavra = "";
			if (palavra.length()==0) {
				throw new RuntimeException ("eu derrubei a aplicação");
			}
			System.out.println("Qtde letras: "+palavra.length());

		}catch (NullPointerException e) {
			System.out.println("Objeto nulo encontrado");
			
		}
		catch (NumberFormatException e) {
			System.out.println("Numero invalido");
			
		}
		catch (Exception e) {
		System.out.println("Deu ruim");
		e.printStackTrace();
		}






}

}
