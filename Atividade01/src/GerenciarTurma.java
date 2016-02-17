import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarTurma {
	
	public static void main(String[] args) {
		Turma turma = new Turma();
		Coordenador coordenador = new Coordenador();
		ComponenteCurricular componenteCurricular = new ComponenteCurricular();
		Scanner s = new Scanner(System.in);
		
		System.out.println(">> Digite o codigo do componente curricular: ");
		componenteCurricular.setCodigoComponente(s.nextLine());
		
		System.out.println(">> Digite o nome do componente curricular: ");
		componenteCurricular.setNomeDisciplina(s.nextLine());
		
		System.out.println(">> Digite o nome do coordernador: ");
		coordenador.setNome(s.nextLine());
		
		System.out.println(">> Digite o siape do coordernador: ");
		coordenador.setSiape(s.nextInt());
		
		System.out.println(">> Digite o setor do coordernador: ");
		coordenador.setSetor(s.nextLine());
		
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

			opcoes = s.nextInt();
			
			switch(s.nextInt()){
				case 1:
				break;
				case 2:
				break;
				case 3:
				break;
				case 4:
				break;
				case 5:
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
