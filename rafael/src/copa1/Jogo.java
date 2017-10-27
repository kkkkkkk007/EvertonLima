package copa1;

public class Jogo {

	private String time_1;
	private String time_2;
	private int idjogo;

	public String getNomeJogo() {
		return time_1;
	}

	public String getTime_1() {
		return time_1;
	}

	public void setTime_1(String time_1) {
		this.time_1 = time_1;
	}

	public String getTime_2() {
		return time_2;
	}

	public void setTime_2(String time_2) {
		this.time_2 = time_2;
	}

	public int getIdjogo() {
		return idjogo;
	}

	public void setIdjogo(int idjogo) {
		this.idjogo = idjogo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idjogo;
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
		Jogo other = (Jogo) obj;
		if (idjogo != other.idjogo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Jogo [time_1=" + time_1 + ", time_2=" + time_2 + ", idjogo=" + idjogo + "]";
	}

}