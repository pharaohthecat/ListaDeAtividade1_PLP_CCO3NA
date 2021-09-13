package com.listadeatividade;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) { //Main
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
                    System.out.println("Q1 Sucess");
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
