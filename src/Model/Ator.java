package Model;

public class Ator {
    private int id;
    private String nome;
    private String sobrenome;
    private int idade;
    private String sexo;
    private int quantidadeDeFilmes;
    private int quantidadeDePremios;

    public Ator(int id, String nome, String sobrenome, int idade, String sexo, int quantidadeDeFilmes, int quantidadeDePremios) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
        this.quantidadeDeFilmes = quantidadeDeFilmes;
        this.quantidadeDePremios = quantidadeDePremios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getQuantidadeDeFilmes() {
        return quantidadeDeFilmes;
    }

    public void setQuantidadeDeFilmes(int quantidadeDeFilmes) {
        this.quantidadeDeFilmes = quantidadeDeFilmes;
    }

    public int getQuantidadeDePremios() {
        return quantidadeDePremios;
    }

    public void setQuantidadeDePremios(int quantidadeDePremios) {
        this.quantidadeDePremios = quantidadeDePremios;
    }

}
