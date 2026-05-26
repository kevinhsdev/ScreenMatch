package br.com.screenmatch.principal;
import br.com.screenmatch.modelos.Titulo;
import br.com.screenmatch.modelos.TituloOMDb;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.util.Scanner;

public class Busca {
    public static void main(String[] args) throws IOException, InterruptedException {
    Scanner sc = new Scanner(System.in);

    IO.println("Digite o nome do filme ou série que deseja buscar: ");
    var midiaPesquisada = sc.nextLine();

    String endereco = "https://www.omdbapi.com/?t=" + midiaPesquisada + "&apikey=e125cb18";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(endereco))
        .build();
    HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json =  response.body();
        IO.println(json);

        Gson gson = new Gson();
        TituloOMDb titulo = gson.fromJson(json, TituloOMDb.class);
        IO.println(titulo);

    }
}
