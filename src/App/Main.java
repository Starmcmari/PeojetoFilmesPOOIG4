package app;

import model.Ator;
import model.Diretor;
import model.Filme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Cadastro de ator
            System.out.println("Cadastro de Ator:");
            Ator ator = cadastrarAtor(scanner);

            // Cadastro de diretor
            System.out.println("\nCadastro de Diretor:");
            Diretor diretor = cadastrarDiretor(scanner);

            // Cadastro de filme
            System.out.println("\nCadastro de Filme:");
            Filme filme = cadastrarFilme(scanner, diretor.getNome());

            // Imprimindo informações do ator
            imprimirInformacoesAtor(ator);

            // Imprimindo informações do diretor
            imprimirInformacoesDiretor(diretor);

            // Imprimindo informações do filme
            imprimirInformacoesFilme(filme);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    private static Ator cadastrarAtor(Scanner scanner) {
        System.out.print("ID do Ator: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Nome do Ator: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome do Ator: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Idade do Ator: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Sexo do Ator: ");
        String sexo = scanner.nextLine();

        System.out.print("Quantidade de Filmes do Ator: ");
        int quantidadeDeFilmes = scanner.nextInt();

        System.out.print("Quantidade de Prêmios do Ator: ");
        int quantidadeDePremios = scanner.nextInt();

        return new Ator(id, nome, sobrenome, idade, sexo, quantidadeDeFilmes, quantidadeDePremios);
    }

    private static Diretor cadastrarDiretor(Scanner scanner) {
        System.out.print("ID do Diretor: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Nome do Diretor: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome do Diretor: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Idade do Diretor: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Sexo do Diretor: ");
        String sexo = scanner.nextLine();

        System.out.print("Quantidade de Filmes do Diretor: ");
        int quantidadeDeFilmes = scanner.nextInt();

        System.out.print("Quantidade de Prêmios do Diretor: ");
        int quantidadeDePremios = scanner.nextInt();

        return new Diretor(id, nome, sobrenome, idade, sexo, quantidadeDeFilmes, quantidadeDePremios);
    }

    private static Filme cadastrarFilme(Scanner scanner, String diretor) {
        System.out.print("ID do Filme: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Nome do Filme: ");
        String nome = scanner.nextLine();

        return new Filme(id, nome, diretor);
    }

    private static void imprimirInformacoesAtor(Ator ator) {
        System.out.println("\nInformações do Ator:");
        System.out.println("Nome: " + ator.getNome() + " " + ator.getSobrenome());
        System.out.println("Idade: " + ator.getIdade());
        System.out.println("Sexo: " + ator.getSexo());
        System.out.println("Quantidade de Filmes: " + ator.getQuantidadeDeFilmes());
        System.out.println("Quantidade de Prêmios: " + ator.getQuantidadeDePremios());
    }

    private static void imprimirInformacoesDiretor(Diretor diretor) {
        System.out.println("\nInformações do Diretor:");
        System.out.println("Nome: " + diretor.getNome() + " " + diretor.getSobrenome());
        System.out.println("Idade: " + diretor.getIdade());
        System.out.println("Sexo: " + diretor.getSexo());
        System.out.println("Quantidade de Filmes: " + diretor.getQuantidadeDeFilmes());
        System.out.println("Quantidade de Prêmios: " + diretor.getQuantidadeDePremios());
    }

    private static void imprimirInformacoesFilme(Filme filme) {
        System.out.println("\nInformações do Filme:");
        System.out.println("Nome: " + filme.getNome());
        System.out.println("Diretor: " + filme.getDiretor());
    }
}
