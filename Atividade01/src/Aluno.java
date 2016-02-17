
public class Aluno extends Pessoa{
	private Integer matricula;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String nome, Integer matricula) {
		super(nome);
		this.matricula = matricula;
	}
	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	
}
