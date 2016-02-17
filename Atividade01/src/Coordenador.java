
public class Coordenador extends Professor{
	private String setor;
	
	public Coordenador() {
		// TODO Auto-generated constructor stub
	}
	
	public Coordenador(String nome, Integer siape, String setor) {
		super(nome, siape);
		this.setor = setor;
	}
	
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
}
