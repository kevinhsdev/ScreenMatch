package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;

    public Filme(String nome, String genero, int anoLancamento){
        super(nome, genero, anoLancamento);
    }

    public Filme(String nome,String genero, int anoLancamento, int duracaoEmMinutos, boolean inclusoNoPlano) {
        super(nome, genero, anoLancamento);
        this.setDuracaoEmMinutos(duracaoEmMinutos);
        this.setInclusoNoPlano(inclusoNoPlano);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaDasAvaliacoes() / 2;
    }

}


