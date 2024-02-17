package repository;

import java.util.List;
import java.util.function.Predicate;

public interface DiretorAcoes<T> {

    public T inserir(T entry);

    public T atualizar(T entry);

    public List<T> pesquisar(Predicate<T> predicate);

    public void excluir(T entry);

    public List<T> todos();

}
