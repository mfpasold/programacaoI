package aula1311;

public class Publicacao {
    
    private String nome, editora;

    public Publicacao() {
    }

    
    public Publicacao(String nome, String editora) {
        this.nome = nome;
        this.editora = editora;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", editora: " + getEditora();
    }
    
    
}
