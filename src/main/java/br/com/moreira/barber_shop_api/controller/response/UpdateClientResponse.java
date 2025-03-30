package br.com.moreira.barber_shop_api.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UpdateClientResponse(
        @JsonProperty("id")
        Long id,
        @JsonProperty("name")
        String name,
        @JsonProperty("email")
        String email,
        @JsonProperty("phone")
        String phone
) {}