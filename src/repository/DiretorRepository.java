package repository;

import model.Diretor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DiretorRepository implements DiretorAcoes {
    private static List<Diretor> diretores = new ArrayList<>();

    private DiretorRepository(){

    }

    @Override
    public Diretor inserir(Diretor entry) {
        diretores.add(entry);

        return entry;
    }

    @Override
    public Diretor atualizar(Diretor entry) {

        if (diretores.contains((entry))){

            diretores.set(diretores.indexOf(entry), entry);

            return entry;
        }
        return null;
    }

    @Override
    public List<Diretor> pesquisar(Predicate<Diretor> predicate) {

        List<Diretor> resultado = new ArrayList<>();

        for (Diretor diretor : diretores) {

            if (predicate.test(diretor)){
                resultado.add(diretor);
            }
        }
        return resultado;
    }

    @Override
    public List<Diretor> todos() {

        return diretores;
    }

    @Override
    public void excluir(Diretor entry) {

        diretores.remove(entry);
    }
}
