package copa1;

public class Jogador {

	private String nome;
	private int idjogador;

	public String getNomeJogador() {
		return nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdjogador() {
		return idjogador;
	}

	public void setIdjogador(int idjogador) {
		this.idjogador = idjogador;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", idjogador=" + idjogador + "]";
	}

}
