import br.com.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("O Poderoso Chefão");
        filme.setGenero("Crime, Drama");
        filme.setAnoLancamento(2019);
        filme.setDuracaoEmMinutos(180);
        filme.setIncluidoNoPlano(true);

        filme.avaliar(8);
        filme.avaliar(10);
        filme.avaliar(9);
        IO.println(filme.getSomaDasAvaliacoes());
        IO.println(filme.getTotalDeAvaliacoes());
        IO.println(filme.mediaDasAvaliacoes());
        filme.exibirFichaTecnica();

    }
}
