package variaveis;
import javax.swing.JOptionPane;

public class Carrinho {

	public static void main(String[] args) {

	String nome_prod = JOptionPane.showInputDialog("Digite o nome");
	String cate_prod = JOptionPane.showInputDialog("Digite categoria produto");
	double valor_prod = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
	double qtidade_prod = Double.parseDouble(JOptionPane.showInputDialog("Digite a Quantidade do Produto"));
	double imposto_prod = Double.parseDouble(JOptionPane.showInputDialog("Digite o Imposto"));
	

	double total_semimp = valor_prod*qtidade_prod;
	double total_ci = total_semimp + (total_semimp * (imposto_prod/100)) ;
	double valor_imp = total_ci - total_semimp;
	double total_cid = total_ci - (total_ci * 0.10) ;
	
	System.out.println("Nome: "+ nome_prod);
	System.out.println("Categoria: "+ cate_prod);
	System.out.println("Valor: "+ valor_prod);
	System.out.println("Quantidade: "+ qtidade_prod);
	System.out.println("Imposto: "+ imposto_prod);
	
	System.out.println("Total sem Imposto: "+ total_semimp);
	System.out.println("Total com Imposto: "+ total_ci);
	System.out.println("Valor Imposto: "+ valor_imp);
	System.out.println("Total com Imposto + 10% Desconto: "+ total_cid);
	
	}
	
}
