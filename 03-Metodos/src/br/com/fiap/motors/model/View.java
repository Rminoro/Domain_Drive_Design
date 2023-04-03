package br.com.fiap.motors.model;

public class View {
	public static void main(String[] args) {
	//main -> ctrl + espaço
	
	
	//Exibir a idade
	//Instanciar o carro
	Carro gol = new Carro();
	//Colocar informações nos atributos
	gol.ano = 1999;
	
	gol.modelo= "gol bola";
	
	gol.valor = 15000;
	//Calcular a idade do carro
	//calcular idade
	int idade = gol.calcularIdade(2023);
	//exibir a idade
	System.out.println("idade do carro: "+ idade);
		
	
	}
}
