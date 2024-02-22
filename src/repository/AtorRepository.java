package repository;

import model.Ator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AtorRepository implements AtorAcoes {
    private static List<Ator> atores = new ArrayList<>();

    private AtorRepository(){

    }

    @Override
    public Ator inserir(Ator entry) {
        atores.add(entry);

        return entry;
    }

    @Override
    public Ator atualizar(Ator entry) {

        if (atores.contains((entry))){

            atores.set(atores.indexOf(entry), entry);

            return entry;
        }
        return null;
    }

    @Override
    public List<Ator> pesquisar(Predicate<Ator> predicate) {

        List<Ator> resultado = new ArrayList<>();

        for (Ator ator : atores) {

            if (predicate.test(ator)){
                resultado.add(ator);
            }
        }
        return resultado;
    }

    @Override
    public List<Ator> todos() {

        return atores;
    }

    @Override
    public void excluir(Ator entry) {

        atores.remove(entry);
    }
}
