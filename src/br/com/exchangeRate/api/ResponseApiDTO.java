package br.com.exchangeRate.api;

import com.google.gson.annotations.SerializedName;

public record ResponseApiDTO(
        @SerializedName("base_code")
        String base,
        @SerializedName("target_code")
        String target,
        @SerializedName("conversion_result")
        double conversionResult

) {
}
