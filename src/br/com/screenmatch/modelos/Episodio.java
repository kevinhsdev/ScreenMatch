package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classificacao;

public class Episodio implements Classificacao {
    private String titulo;
    private String descricao;
    private Serie serie;
    private int numero;
    private int visualizacoes;

    public Episodio(int numero, Serie serie, String titulo, String descricao) {
        this.numero = numero;
        this.serie = serie;
        this.titulo = titulo;
        this.descricao = descricao;
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

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (visualizacoes > 100) {
            return 5;
        } else {
            return 3;
        }
    }

}
