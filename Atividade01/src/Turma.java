import java.util.ArrayList;
import java.util.List;

public class Turma {
	private int id;
	private ComponenteCurricular componenteCurricular;
	private List<Aluno> alunos;
	private List<Professor> professores;
	private Coordenador coordenador;
	
	public Turma(){
		alunos = new ArrayList<Aluno>();
		professores = new ArrayList<Professor>();		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public ComponenteCurricular getComponenteCurricular() {
		return componenteCurricular;
	}
	
	public void setComponenteCurricular(ComponenteCurricular componenteCurricular) {
		this.componenteCurricular = componenteCurricular;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}
	
	@Override
	public String toString() {
		String impressao = "";
		impressao += "/----- Turma -----/";
		impressao += "\nId: " + getId();
		impressao += "\n/----- Componente Curricular -----/";
		impressao += "\nCodigo: " + componenteCurricular.getCodigoComponente();
		impressao += "\nNome: " + componenteCurricular.getNomeDisciplina();
		impressao += "\n/----- Coordenador -----/";
		impressao += "\nNome: " + coordenador.getNome();
		impressao += "\nSiape: " + coordenador.getSiape();
		impressao += "\nSetor: " + coordenador.getSetor();
		impressao += "\n/----- Professor(es) -----/";
		
		for(Professor p : getProfessores()){
			impressao += "\nNome: " + p.getNome();
			impressao += "\nSiape: " + p.getSiape();
			impressao += "\n*************************";
		}
		
		impressao += "\n/----- Aluno(s) -----/";
		
		for(Aluno a : getAlunos()){
			impressao += "\nNome: " + a.getNome();
			impressao += "\nSiape: " + a.getMatricula();
			impressao += "\n*************************";
		}		
		
		return impressao;
	}
}
