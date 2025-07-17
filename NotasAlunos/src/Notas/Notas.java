package Notas;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        // Criação do objeto Scanner para entrada de dados via teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do aluno e armazena na variável 'nome'
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Exibe mensagem de boas-vindas personalizada
        System.out.println("Olá, " + nome + "! Seja bem vindo(a) ao portal de notas");

        // Coleta as notas dos 10 semestres e armazena cada uma em uma variável
        System.out.println("Digite a nota do 1° semestre: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota do 2° semestre: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota do 3° semestre: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a nota do 4° semestre: ");
        double nota4 = scanner.nextDouble();

        System.out.println("Digite a nota do 5° semestre: ");
        double nota5 = scanner.nextDouble();

        System.out.println("Digite a nota do 6° semestre: ");
        double nota6 = scanner.nextDouble();

        System.out.println("Digite a nota do 7° semestre: ");
        double nota7 = scanner.nextDouble();

        System.out.println("Digite a nota do 8° semestre: ");
        double nota8 = scanner.nextDouble();

        System.out.println("Digite a nota do 9° semestre: ");
        double nota9 = scanner.nextDouble();

        System.out.println("Digite a nota do 10° semestre: ");
        double nota10 = scanner.nextDouble();

        // Calcula a soma total das notas
        double soma = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8 + nota9 + nota10);

        // Calcula a média das notas
        double media = soma / 10;

        // Exibe a soma e a média das notas do aluno
        System.out.println(nome + " a soma total das suas notas é: " + soma + "\n" + " e a média é " + media);

        // Verifica se a média é suficiente para aprovação (média >= 6)
        if (media >= 6) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }

    }
}