
public class Aluno {
	//atributos
	String nome;
	String rm;
	double cp1, cp2, cp3, challenge, global;
	double media;

		
	//metodos
	public double calcMediaCheckpoint() {
		double mediaCP = (cp1 + cp2 + cp3)/3;
		return mediaCP;
	}
	
	double calcularMediaSemestre() {
		//cp 20% Challenge 20% Global 60%
		double m = calcMediaCheckpoint();
		double mediaFinal = challenge*0.2 + m *0.2 + global * 0.6;
		return mediaFinal;
	}
	
}
