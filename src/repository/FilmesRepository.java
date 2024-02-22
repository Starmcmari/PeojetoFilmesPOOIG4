package repository;

import model.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilmesRepository implements FilmeAcoes {
    private static List<Filme> filmes = new ArrayList<>();

    private FilmesRepository(){

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