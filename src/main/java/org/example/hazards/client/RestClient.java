package org.example.hazards.client;


import org.example.hazards.model.Hazards;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {

    private RestTemplate restTemplate;

    public RestClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Hazards getData() {

        final String uri = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/significant_month.geojson";

        Hazards result = restTemplate.getForObject(uri, Hazards.class);

        return result;
    }

}
