package repository;

import model.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilmesRepository implements FilmeAcoes {
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



    @Override
    public Filme inserir(Filme entry) {
        filmes.add(entry);

        return entry;
    }

    @Override
    public Filme atualizar(Filme entry) {

        if (filmes.contains((entry))){

            filmes.set(filmes.indexOf(entry), entry);

            return entry;
        }
        return null;
    }

    @Override
    public List<Filme> pesquisar(Predicate<Filme> predicate) {

        List<Filme> resultado = new ArrayList<>();

        for (Filme filme : filmes) {

            if (predicate.test(filme)){
                resultado.add(filme);
            }
        }
        return resultado;
    }

    @Override
    public List<Filme> todos() {

        return filmes;
    }

    @Override
    public void excluir(Filme entry) {

        filmes.remove(entry);
    }
}