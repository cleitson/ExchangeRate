package br.com.exchangeRate.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestApi {
    private String API_KEY = System.getenv("API_KEY");
    private String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY;
    private HttpClient client = HttpClient.newHttpClient();

    public RequestApi() {
        if (API_KEY == null || API_KEY.isEmpty()) {
            throw new IllegalStateException("API_KEY não está definida nas variáveis de ambiente.");
        }
    }

    public String convertCurrency(String base, String target, double amount) {

        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(BASE_URL + "/pair/" + base + "/" + target + "/" + amount)).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response == null || response.body().contains("\"result\":\"error\"")) {
                throw new RuntimeException("Erro na API: resposta inválida ou moeda não suportada.");
            }
            return response.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "Erro ao obter taxas de câmbio." + e;
        }
    }

}
