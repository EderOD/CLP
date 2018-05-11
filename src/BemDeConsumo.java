import java.time.LocalDate;
import java.time.LocalDateTime;

public class BemDeConsumo extends Produto {
	private LocalDateTime dataFabricacao = LocalDateTime.now();
	private LocalDate dataValidade;
	public LocalDate getDataValidade() { return dataValidade; }
	public void setDataValidade(LocalDate dataValidade) {
		if (getDataFabricacao().isBefore(dataValidade.atStartOfDay()))
			this.dataValidade = dataValidade;
	}
	public LocalDateTime getDataFabricacao() { return dataFabricacao; }
	public BemDeConsumo() {
		super();
		dataValidade = LocalDate.now().plusMonths(6);
	}
	public BemDeConsumo(String descricao, float preco, int quant, LocalDate validade) {
		super(descricao, preco, quant);
		setDataValidade(validade);
	}
}
