package br.com.screenmatch.principal;

import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.calculos.CalculadoraTemporal;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O Poderoso Chefão", "Crime, Drama", 1995, 180, true);

        filme1.avaliar(5);
        filme1.avaliar(2);
        filme1.avaliar(3);
        filme1.exibirFichaTecnica();

        IO.println();

        Filme filme2 = new Filme("Avatar", "Ação, Aventura", 2024, 200, false);

        filme2.avaliar(6);
        filme2.avaliar(5);
        filme2.avaliar(7);
        filme2.exibirFichaTecnica();

        IO.println();

        Serie serie1 = new Serie("Breaking Bad", "Crime, Drama", 2010, 60, 13, 5, true);

        serie1.avaliar(7);
        serie1.avaliar(10);
        serie1.avaliar(10);
        serie1.exibirFichaTecnica();

        IO.println();

        CalculadoraTemporal calculadora = new CalculadoraTemporal();

        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        IO.println("Tempo total assistido na plataforma: " + calculadora.getTempoTotal() + "min");

        IO.println();

        Episodio episodio1 = new Episodio(1, serie1, "Pilot", "Walter White, um professor de química do ensino médio, descobre que tem câncer de pulmão e decide produzir e vender metanfetamina para garantir o futuro financeiro de sua família. Ele se une a um ex-aluno, Jesse Pinkman, e juntos entram no perigoso mundo do tráfico de drogas, enfrentando desafios e consequências inesperadas.");

        episodio1.setVisualizacoes(5000);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);
        filtro.filtra(filme2);
        filtro.filtra(episodio1);

        IO.println();

        Filme filme3 = new Filme("Maze Runner", "Ação, Suspense", 2016, 120, true);

        filme3.avaliar(8.5);
        filme3.avaliar(9.5);
        filme3.avaliar(10);
        filme3.exibirFichaTecnica();

        IO.println();

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);

        IO.println("A lista possui " + listaDeFilmes.size() + " filmes no momento...");
        IO.println("O primeiro filme da lista é " + listaDeFilmes.getFirst().getNome());
        IO.println(listaDeFilmes);

    }
}
