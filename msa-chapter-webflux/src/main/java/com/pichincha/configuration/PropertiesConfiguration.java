package com.pichincha.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties
public class PropertiesConfiguration {

    Pokemon pokemon;

    @Getter
    @Setter
    public static class Pokemon {
        String basePath;
    }
}
