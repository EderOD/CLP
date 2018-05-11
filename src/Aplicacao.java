import javax.swing.JOptionPane;

public class Aplicacao {

	public static void main(String[] args) {
		
		System.out.println("\nCont. prods: " + Produto.getCont());
		
		Produto p1 = new Produto();
		System.out.println("\nCont. prods: " + Produto.getCont());
		
		Produto p2 = new Produto("Shulambs", 1.99F, 600);
		System.out.println("\nCont. prods: " + Produto.getCont());
		
		p1.setDescricao("Cool Shulambs");
		p1.setPreco(2.49F);
		p1.setQuant(10);
		
		System.out.println("Produto Id: " + p1.getId());
		System.out.println("Descricao: " + p1.getDescricao());
		System.out.println("Preço: " + p1.getPreco());
		System.out.println("Estoque: " + p1.getQuant());
		
		System.out.println("Produto Id: " + p2.getId());
		System.out.println("Produto: " + p2.getDescricao());
		System.out.println("Preço: " + p2.getPreco());
		System.out.println("Estoque: " + p2.getQuant());
		
		int novosProdutos = Integer.parseInt(JOptionPane.showInputDialog(null, 
				"Digite quantos produtos deseja adicionar ao estoque:", 
				"Controle de estoque", 
				JOptionPane.OK_CANCEL_OPTION));
		if ((p2.getQuant() + novosProdutos) > Produto.MAX_ESTOQUE) {
			JOptionPane.showMessageDialog(null, 
					"Estourou o limite máximo do estoque", 
					"Erro alterando estoque", 
					JOptionPane.ERROR_MESSAGE);
		} else {
			p2.setQuant(p2.getQuant() + novosProdutos);
		}
		
		System.out.println("Produto Id: " + p2.getId());
		System.out.println("Produto: " + p2.getDescricao());
		System.out.println("Preço: " + p2.getPreco());
		System.out.println("Estoque: " + p2.getQuant());
	}

}
