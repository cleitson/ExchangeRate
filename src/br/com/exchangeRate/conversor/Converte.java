package br.com.exchangeRate.conversor;

import br.com.exchangeRate.api.RequestApi;
import br.com.exchangeRate.api.ResponseApiDTO;
import com.google.gson.Gson;

public class Converte {
    private final RequestApi api;
    private final Gson gson;

    public Converte() {
        this.api = new RequestApi();
        this.gson = new Gson();
    }

    private Moeda parseJsonToMoeda(String json) {

        ResponseApiDTO apiResponse = gson.fromJson(json, ResponseApiDTO.class);

        if (apiResponse == null) {
            throw new RuntimeException("Falha ao processar resposta da API.");
        }

        Moeda moeda = new Moeda();
        moeda.setBase(apiResponse.base());
        moeda.setTarget(apiResponse.target());
        moeda.setConversionRate(apiResponse.conversionResult());
        return moeda;
    }

    public Moeda converterMoeda(String base, String target, double amount) {
        verificarMoeda(base);
        verificarMoeda(target);
        try {
            String json = api.convertCurrency(base, target, amount);
            return parseJsonToMoeda(json);
        } catch (RuntimeException e) {
            throw new RuntimeException("Erro ao obter conversão de BRL para USD: " + e.getMessage(), e);
        }
    }

    private void verificarMoeda(String moeda){
        if (moeda.isEmpty() | moeda.length() >=4) throw new RuntimeException("Moeda invalida");
    }
}
