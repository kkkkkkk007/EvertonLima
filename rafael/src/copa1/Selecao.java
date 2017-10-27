package copa1;

import java.util.ArrayList;

public class Selecao {

	private String nome;
	private String sigla;
	private int idselecao;
	private ArrayList<Jogador> jogador;

	public String getNomeSelecao() {
		return nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getIdselecao() {
		return idselecao;
	}

	public void setIdselecao(int idselecao) {
		this.idselecao = idselecao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idselecao;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Selecao other = (Selecao) obj;
		if (idselecao != other.idselecao)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Selecao [nome=" + nome + ", sigla=" + sigla + ", idselecao=" + idselecao + ", jogador=" + jogador + "]";
	}

}