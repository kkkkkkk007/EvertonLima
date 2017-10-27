package copa1;

import java.util.ArrayList;
import java.util.Date;

public class Copa {
	private String pais;
	private Date ano;
	private int idcopa;
	private ArrayList<Selecao> selecao;

	public String getNomeCopa() {
		return pais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public int getIdcopa() {
		return idcopa;
	}

	public void setIdcopa(int idcopa) {
		this.idcopa = idcopa;
	}

	public ArrayList<Selecao> getSelecao() {
		return selecao;
	}

	public void setSelecao(ArrayList<Selecao> selecao) {
		this.selecao = selecao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idcopa;
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
		Copa other = (Copa) obj;
		if (idcopa != other.idcopa)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Copa [pais=" + pais + ", ano=" + ano + ", idcopa=" + idcopa + ", selecao=" + selecao + "]";
	}

}