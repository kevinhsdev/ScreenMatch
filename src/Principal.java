import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.calculos.CalculadoraTemporal;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.setNome("O Poderoso Chefão");
        filme1.setGenero("Crime, Drama");
        filme1.setAnoLancamento(2019);
        filme1.setDuracaoEmMinutos(180);
        filme1.setIncluidoNoPlano(true);

        filme1.avaliar(8);
        filme1.avaliar(10);
        filme1.avaliar(9);
        filme1.exibirFichaTecnica();

        IO.println();

        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
        filme2.setGenero("Ação, Aventura");
        filme2.setAnoLancamento(2019);
        filme2.setDuracaoEmMinutos(200);
        filme2.setIncluidoNoPlano(false);

        filme2.avaliar(8);
        filme2.avaliar(10);
        filme2.avaliar(9);
        filme2.exibirFichaTecnica();

        IO.println();

        Serie serie1 = new Serie();
        serie1.setNome("Breaking Bad");
        serie1.setGenero("Crime, Drama");
        serie1.setAnoLancamento(2019);
        serie1.setMinutosPorEpisodio(60);
        serie1.setEpisodiosPorTemporada(13);
        serie1.setTemporadas(5);
        serie1.setIncluidoNoPlano(true);

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

    }
}
