package repository;

import Model.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilmesRepository {

    private static List<Filme> filmes = new ArrayList<>();

    private FilmesRepository(){

    }

    static private int contador = 0;

    public static Filme insere(Filme filme){
        filme.id = ++contador;
        filmes.add(filme);
        return filme;
    }

    public static Filme alteraNome(int id, String nome){
        Filme filme = filmes.stream().filter(f -> f.id == id).findFirst().get();
        filme.nome=nome;
        return filme;
    }

    public static void deleta(Filme filme){

    }

    public static List<Filme> obterTodos(){
        return null;
    }

    public static List<Filme> pesquisarPorNome(String nome){
        List<Filme> filmes1= filmes.stream().filter(f -> f.nome.contains(nome)).collect(Collectors.toList());
        return filmes1;
    }

}
