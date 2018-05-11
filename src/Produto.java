
public class Produto {
	
	private int id;
	private static int cont = 0;
	private String descricao;
	private float preco;
	private int quant;
	
	public static final String DESCRICAO_PADRAO = "Shulambs";
	public static final int MAX_ESTOQUE = 1000;
	
	public static int getCont() {
		return cont;
	}
	public int getId() {
		return id;
	}
	public boolean emEstoque() {
		return (quant > 0);
	}
	
	public Produto(){
		descricao = DESCRICAO_PADRAO;
		preco = 0.01F;
		quant =0;
		
		id = ++cont;
	}
	public Produto(String descricao, float preco, int quant){
		setDescricao(descricao);
		setPreco(preco);
		setQuant(quant);
		
		id = ++cont;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao.length() >= 3)		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if(preco > 0)		this.preco = preco;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		if(quant >= 0)		this.quant = quant;
	}
		
}
