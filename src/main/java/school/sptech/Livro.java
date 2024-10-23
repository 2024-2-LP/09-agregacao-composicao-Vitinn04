package school.sptech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private LocalDate dataPublicacao;
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    public Livro() {
    }

    public Livro(String titulo, String autor, LocalDate dataPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    public void adicionarAvaliacao(String descricao, Double qtdEstrelas){
        Avaliacao avaliacao = new Avaliacao(descricao, qtdEstrelas);
        if (descricao != null && qtdEstrelas != null && !descricao.isBlank() && qtdEstrelas >= 0.0 && qtdEstrelas <=5.0){
            avaliacoes.add(avaliacao);
        }
    }

    public Double calcularMediaAvaliacoes(){
        Double media = 0.0;
        int i;
        if (avaliacoes.isEmpty()){
            return 0.0;
        }

        for (i = 0; i < avaliacoes.size(); i++) {
            media += avaliacoes.get(i).getQtdEstrelas();
        }

        return media / i;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                ", avaliacoes=" + avaliacoes +
                '}';
    }
}
