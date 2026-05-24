package br.com.screenmatch.principal;
import java.io.IOException;
import java.net.URI;
import java.net.http.*;

public class Busca {
    public static void main(String[] args) throws IOException, InterruptedException {

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.omdbapi.com/?t=Harry_Potter&apikey=e125cb18"))
        .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        IO.println(response.body());
    }
}
