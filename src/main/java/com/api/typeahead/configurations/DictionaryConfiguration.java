package com.api.typeahead.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class DictionaryConfiguration {

    private Map<String, List<String>> dict = new HashMap<>();

    public Map<String, List<String>> getDict() {
            return dict;
    }

}
