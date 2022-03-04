package com.pichincha.domain.dto.coin.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
public class Criptos {
    @JsonProperty("Precio")
    String Precio;
    @JsonProperty("Nombre")
    String Nombre;
    @JsonProperty("Id")
    String Id;
}
