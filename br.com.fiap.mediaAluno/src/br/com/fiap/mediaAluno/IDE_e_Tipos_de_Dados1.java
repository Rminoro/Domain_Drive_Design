package br.com.fiap.mediaAluno;

import java.util.Scanner;

public class IDE_e_Tipos_de_Dados1 {
	
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
  
        // Criar programa java capaz de receber nome do aluno
        System.out.println("Informe o seu nome: ");
        String nome_do_aluno = S.next();

        // 3 notas de checkpoint-Nota do challenge-Nota global solution
        //calcular media checkpoint
        System.out.println("Informe a nota do primeiro checkpoint: ");
        float cp1 =  S.nextFloat();
        
        System.out.println("Informe a nota do segundo checkpoint:");
        float cp2 = S.nextFloat();
        
        System.out.println("Informe a nota do terceiro checkpoint:");
        float cp3 = S.nextFloat();
        
        System.out.println("Informe a nota do Challenge: ");
        float challenge = S.nextFloat();
        
        System.out.println("Informe a nota do Global Solution: ");
        float global = S.nextFloat();
        
        float media_check = (cp1+ cp2 + cp3 )/3;

        // calcular a média final exibir o nome e a média do aluno
        double media = media_check*0.2 + challenge*0.2 + global*0.6 / 3;

        // Calcule a média
        System.out.println(nome_do_aluno + " a sua média é " + media);
    }
}