package Model;

public class Filme {
    private int id;
    private String nome;
    private String diretor;

    public Filme(int id, String nome, String diretor) {
        this.id = id;
        this.nome = nome;
        this.diretor = diretor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme{" + "id= " + id +
                ", nome= '" + nome + '\'' + '}';
    }

}
