package com.listadeatividade;

import java.io.IOException;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) throws IOException { //Main
        Scanner sc = new Scanner(System.in); //Funcao Leia
        //Enquanto verdadeiro faça
        while (true) {
            System.out.println("## Atividade PLP CCO3NA - Clecio e Deyvid ##");
            System.out.println("1 - Primeira Questao");
            System.out.println("2 - Segunda Questao");
            System.out.println("3 - Terceira Questao");
            System.out.println("4 - Quarta Questao");
            System.out.println("5 - Quinta Questao");
            System.out.println("0 - Encerrar");

            System.out.printf("\nDigite sua opcao: ");
            int opcao = sc.nextInt();

            if (opcao == 0){
                System.out.println("Feito por Clecio Jose (202004116) e Deyvid Santos (202001277)");
                sc.close();
                break;
            }

            switch(opcao){
                case 1:
                    sc.nextLine(); //Limpar o buffer

                    //Primeira pessoa
                    System.out.println("Dados da primeira pessoa:");
                    System.out.println("Nome: ");
                    String nome1 = sc.nextLine();
                    System.out.println("Idade: ");
                    int idade1 = sc.nextInt();

                    sc.nextLine(); //Limpar o buffer

                    //Segunda pessoa
                    System.out.println("Dados da segunda pessoa:");
                    System.out.println("Nome: ");
                    String nome2 = sc.nextLine();
                    System.out.println("Idade: ");
                    int idade2 = sc.nextInt();

                    if (idade1 > idade2){
                        System.out.println("Pessoa mais velha: "+nome1);
                    }
                    else if (idade1 == idade2){
                        System.out.println("Mesma idade...");
                    }
                    else{
                        System.out.println("Pessoa mais velha: "+nome2);
                    }
                    System.out.println("Pressione Qualquer Tecla...");
                    System.in.read(); //Pause
                    break;

                case 2:
                    //Primeiro Funcionário
                    sc.nextLine(); //Limpar o buffer
                    System.out.println("Dados do primeiro funcionário:");
                    System.out.println("Nome:");
                    String nomeF1 = sc.nextLine();
                    System.out.println("Salario:");
                    double salarioF1 = sc.nextDouble();

                    //Segundo Funcionário
                    sc.nextLine(); //Limpar o buffer
                    System.out.println("Dados do segundo funcionário:");
                    System.out.println("Nome:");
                    String nomeF2 = sc.nextLine();
                    System.out.println("Salario:");
                    double salarioF2 = sc.nextDouble();

                    //Media
                    double mediaSalario = (salarioF1+salarioF2)/2 ;

                    System.out.printf("Salário médio = %.2f \n", mediaSalario);
                    System.out.println("Pressione Qualquer Tecla...");
                    System.in.read(); //Pause
                    break;

                case 3:
                    sc.nextLine(); //Limpar o buffer
                    System.out.println("Entre a largura e a altura do retangulo:");
                    double largura = sc.nextDouble();
                    double altura = sc.nextDouble();

                    double area = largura*altura;
                    double perimetro = 2*(largura+altura);
                    double diagonal = Math.sqrt((largura*largura)+(altura*altura));

                    System.out.printf("AREA = %.2f \n", area);
                    System.out.printf("PERIMETRO = %.2f \n", perimetro);
                    System.out.printf("DIAGONAL = %.2f \n", diagonal);

                    System.out.println("Pressione Qualquer Tecla...");
                    System.in.read(); //Pause
                    break;

                case 4:
                    sc.nextLine(); //Limpar o buffer
                    System.out.println("Nome:");
                    String nome = sc.nextLine();
                    System.out.println("Salario Bruto:");
                    double salarioBruto = sc.nextDouble();
                    System.out.println("Imposto:");
                    double imposto = sc.nextDouble();

                    double salarioLiquido = salarioBruto - imposto;

                    System.out.printf("Funcionario: %s, R$ %.2f",nome,salarioLiquido);
                    System.out.println("\nDigite a porcetagem para aumentar o salario:");
                    int porcetagem = sc.nextInt();

                    double salarioFinal = salarioLiquido + (salarioLiquido * porcetagem / 100.0);

                    System.out.printf("Dados atualizados: %s, R$ %.2f \n", nome, salarioFinal);

                    System.out.println("Pressione Qualquer Tecla...");
                    System.in.read(); //Pause
                    break;


                case 5:
                    sc.nextLine(); //Limpar o buffer
                    System.out.println("Nome do aluno:");
                    String nomeAluno = sc.nextLine();
                    System.out.println("Digite as tres notas do aluno:");
                    double nota1 = sc.nextDouble();
                    double nota2 = sc.nextDouble();
                    double nota3 = sc.nextDouble();

                    double notaFinal = nota1+nota2+nota3;
                    System.out.printf("NOTA FINAL = %.2f \n", notaFinal);

                    if(notaFinal >= 60){
                        System.out.println("APROVADO!");
                    }

                    else{
                        System.out.println("REPROVADO!");
                        System.out.println("FALTARAM "+(60-notaFinal)+" PONTOS");
                    }

                    System.out.println("Pressione Qualquer Tecla...");
                    System.in.read(); //Pause
                    break;
            }
        }
    }
}
