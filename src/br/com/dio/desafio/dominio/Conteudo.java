package br.com.dio.desafio.dominio;

public abstract class Conteudo {

   protected static double XP_PADRAO = 10d;
   private String titulo;
   private String descricao;

    public double calcularxp() {
        return 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
