package com.pichincha.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PokemonCoin {
String name;
String url;
String coin;
int price;
}
