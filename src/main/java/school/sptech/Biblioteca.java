package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros = new ArrayList<>();

    public Biblioteca() {
    }

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
            if (livro != null && livro.getTitulo() != null && livro.getAutor() != null &&
                    livro.getDataPublicacao() != null && !livro.getTitulo().isBlank() && !livro.getAutor().isBlank()){
                livros.add(livro);
            }
    }

    public void removerLivroPorTitulo(String titulo){
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)){
                livros.remove(i);
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo){
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)){
                return livros.get(i);
            }
        }
        return null;
    }

    public Integer contarLivros(){
        return livros.size();
    }

    public List<Livro> obterLivrosAteAno(Integer ano){
        List<Livro> livrosAno = new ArrayList<>();
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getDataPublicacao().getYear() <= ano){
                livrosAno.add(livros.get(i));
            }
        }
        return livrosAno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
