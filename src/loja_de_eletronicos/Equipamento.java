package loja_de_eletronicos;

public abstract class Equipamento {
		protected String nome;
		protected String marca;
		protected String modelo;
		protected int tamanho_tela;
		
		public Equipamento(String nome, String marca, String modelo, int tamanho_tela) {
			this.nome = nome;
			this.marca = marca;
			this.modelo = modelo;
			this.tamanho_tela = tamanho_tela;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getTamanho_tela() {
			return tamanho_tela;
		}

		public void setTamanho_tela(int tamanho_tela) {
			this.tamanho_tela = tamanho_tela;
		}
}
