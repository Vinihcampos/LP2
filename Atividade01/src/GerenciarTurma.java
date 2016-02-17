import java.util.Scanner;

public class GerenciarTurma {
	
	private static Scanner s;

	public static void main(String[] args) {
		Turma turma = new Turma();
		Coordenador coordenador = new Coordenador();
		ComponenteCurricular componenteCurricular = new ComponenteCurricular();
		s = new Scanner(System.in);
		
		System.out.println(">> Digite o codigo do componente curricular: ");
		componenteCurricular.setCodigoComponente(s.nextLine());
		
		System.out.println(">> Digite o nome do componente curricular: ");
		componenteCurricular.setNomeDisciplina(s.nextLine());
		
		System.out.println(">> Digite o nome do coordernador: ");
		coordenador.setNome(s.nextLine());
				
		System.out.println(">> Digite o setor do coordernador: ");
		coordenador.setSetor(s.nextLine());
		
		System.out.println(">> Digite o siape do coordernador: ");
		coordenador.setSiape(s.nextInt());
		
		turma.setComponenteCurricular(componenteCurricular);
		turma.setCoordenador(coordenador);
		
		int opcoes = 1;
		
		while(opcoes != 0){
			System.out.println("Digite: ");
			System.out.println("1 - Adicionar um aluno");
			System.out.println("2 - Remover um aluno");
			System.out.println("3 - Adicionar um professor");
			System.out.println("4 - Remover um professor");
			System.out.println("5 - Imprimir informações");
			System.out.println("0 - Sair");

			opcoes = s.nextInt();
			
			switch(opcoes){
				case 1:
					Aluno a = new Aluno();
					s.nextLine();
					System.out.println(">>Digite o nome do aluno: ");
					a.setNome(s.nextLine());
					System.out.println(">>Digite a matrícula do aluno: ");
					a.setMatricula(s.nextInt());
					
					turma.getAlunos().add(a);					
					break;
				case 2:
					System.out.println(">>Digite a matrícula do aluno: ");
					int matricula = s.nextInt();
					
					for(int i = 0; i < turma.getAlunos().size(); ++i){
						if(turma.getAlunos().get(i).getMatricula() == matricula){
							turma.getAlunos().remove(i);
							System.out.println("Aluno removido com sucesso!");
							break;
						}
					}
					break;
				case 3:					
					Professor p = new Professor();
					s.nextLine();
					System.out.println(">>Digite o nome do professor: ");
					p.setNome(s.nextLine());
					System.out.println(">>Digite o siape do professor: ");
					p.setSiape(s.nextInt());
					
					turma.getProfessores().add(p);					
					break;
				case 4:
					System.out.println(">>Digite o siape do professor: ");
					int siape = s.nextInt();
					
					for(int i = 0; i < turma.getProfessores().size(); ++i){
						if(turma.getProfessores().get(i).getSiape() == siape){
							turma.getProfessores().remove(i);
							System.out.println("Professor removido com sucesso!");
							break;
						}
					}
					break;
				case 5:
					System.out.println(turma.toString());
				break;
				case 0:
					System.out.println("Programa encerrado!");
					break;
				default:
					System.out.println("Código inválido");
					break;
			}
		}
		
	}
}
