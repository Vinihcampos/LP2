
public class Professor extends Pessoa{
	
	protected Integer siape;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	
	public Professor(String nome, Integer siape) {
		super(nome);
		this.siape = siape;
	}

	public Integer getSiape() {
		return siape;
	}

	public void setSiape(Integer siape) {
		this.siape = siape;
	}
	
	
}
