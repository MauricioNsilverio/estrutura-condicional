package br.com.satc.atividades;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        /* Fazer um programa para calcular a média de 3 notas,
        perguntar qual a nota mínima para a aprovação e se tem direito a 
        recuperação. Se tiver, perguntar a nota da recuperação e refazer a média.
        Mostrar média e situação do aluno final.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota 1: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Nota 2: ");
        float nota2 = entrada.nextFloat();
        System.out.println("Nota 3: ");
        float nota3 = entrada.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Nota mínima para a aprovação: ");
        float notaMinima = entrada.nextFloat();
        if (notaMinima <= media){
            System.out.println("Você foi aprovado!\n Tchau");
        }else{
              System.out.println("");
  

        }

    }

}
