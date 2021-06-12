package loja_de_eletronicos;

public class Smartphone extends Equipamento{
	protected int qtd_chips_operadora;

	public Smartphone(String nome, String marca, String modelo, int tamanho_tela, int qtd_chips_operadora) {
		super(nome, marca, modelo, tamanho_tela);
		this.qtd_chips_operadora = qtd_chips_operadora;
	}
}
