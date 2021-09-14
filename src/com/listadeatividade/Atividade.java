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

            System.out.printf("\nDigite sua opçao: ");
            int opcao = sc.nextInt();

            if (opcao == 0){
                System.out.println("Feito por Clecio Jose (202004116) e Deyvid Santos (202001277)");
                sc.close();
                break;
            }

            switch(opcao){
                case 1:
                    //Primeira pessoa
                    sc.nextLine();
                    System.out.println("Dados da primeira pessoa:");
                    System.out.println("Nome: ");
                    String nome1 = sc.nextLine();
                    System.out.println("Idade: ");
                    int idade1 = sc.nextInt();

                    sc.nextLine();

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
                    System.out.println("Q2 Sucess");
                    break;

                case 3:
                    System.out.println("Q3 Sucess");
                    break;

                case 4:
                    System.out.println("Q4 Sucess");
                    break;

                case 5:
                    System.out.println("Q5 Sucess");
                    break;
            }
        }
    }
}
