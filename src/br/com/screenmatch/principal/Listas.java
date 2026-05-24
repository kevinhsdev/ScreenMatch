package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Listas {
    public static void main(String[] args) {

        Filme filme1 = new Filme("O Poderoso Chefão", "Crime, Drama", 1995, 180, true);
        Filme filme2 = new Filme("Avatar", "Ação, Aventura", 2024, 200, false);
        Filme filme3 = new Filme("Maze Runner", "Ação, Suspense", 2016, 120, true);
        Serie serie1 = new Serie("Breaking Bad", "Crime, Drama", 2010, 60, 13, 5, true);

        filme1.avaliar(6);
        filme2.avaliar(8);
        filme3.avaliar(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme3);
        lista.add(filme1);
        lista.add(filme2);
        lista.add(serie1);

        Collections.sort(lista);
        IO.println("Em ordem alfabética: ");

        for (Titulo item : lista) {
            if (item instanceof Filme filme && filme.getClassificacao() >= 2) {
                IO.println("Filme: " + filme.getNome() + " - Classificação: " + filme.getClassificacao());
            }
            else if (item instanceof Serie serie) {
                IO.println("Serie: " + serie.getNome());
            }
        }
        
        IO.println();
        IO.println("Ordenado por ano: ");
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        IO.println(lista);

    }
}
