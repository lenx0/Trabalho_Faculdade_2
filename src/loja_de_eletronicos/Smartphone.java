package loja_de_eletronicos;

public class Smartphone extends Equipamento{
	protected int qtdChipsOperadora;

	public Smartphone(String nome, String marca, int tamanhoTela, int qtdChipsOperadora) {
		super(nome, marca, tamanhoTela);
		this.modelo = "Smartphone";
		this.qtdChipsOperadora = qtdChipsOperadora;
	}
}
