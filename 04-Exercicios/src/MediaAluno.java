 import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
	//instanciar o objeto para ler o teclado
		Scanner S = new Scanner(System.in);
	//instanciar um aluno
	Aluno aluno = new Aluno();
	
	System.out.println("Digite o nome do aluno: ");
	aluno.nome = S.next();
	
	//ler nota e rm
	System.out.println("Digite o rm do aluno: ");
	aluno.rm= S.next();
	
	System.out.println("Digite a primeira nota do CP: ");
	aluno.cp1= S.nextDouble();
	
	System.out.println("Digite a primeira nota do CP2: ");
	aluno.cp2= S.nextDouble();
	
	System.out.println("Digite a primeira nota do CP3: ");
	aluno.cp3= S.nextDouble();
	
	System.out.println("Digite a primeira nota do Challenge: ");
	aluno.challenge= S.nextDouble();
	
	System.out.println("Digite a primeira nota do GS: ");
	aluno.global= S.nextDouble();
	
	//Exibir nome e a media

	double j =aluno.calcMediaCheckpoint();
	double i = aluno.calcularMediaSemestre();

	System.out.println("A média final do aluno " + aluno.nome + " é " + i );
	
	}
}
