package repository;

import Model.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilmeRepository implements CrudRepository<Filme> {
    private List<Filme> filmes;

    public FilmeRepository() {
        this.filmes = new ArrayList<>();
    }

    @Override
    public Filme inserir(Filme filme) {
        this.filmes.add(filme);
        return filme;
    }

    @Override
    public Filme atualizar(Filme filme) {
        for (int i = 0; i < filmes.size(); i++) {
            if (filmes.get(i).getId() == filme.getId()) {
                filmes.set(i, filme);
                return filme;
            }
        }
        return null;
    }

    @Override
    public List<Filme> pesquisar(Predicate<Filme> predicate) {
        List<Filme> resultados = new ArrayList<>();
        for (Filme filme : filmes) {
            if (predicate.test(filme)) {
                resultados.add(filme);
            }
        }
        return resultados;
    }

    @Override
    public List<Filme> todos() {
        return filmes;
    }

    @Override
    public void excluir(Filme filme) {
        filmes.remove(filme);
    }
}
