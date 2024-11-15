package org.example.hazards.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.example.hazards.client.RestClient;
import org.example.hazards.model.Hazards;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HazardService {

    private static Logger logger = LoggerFactory.getLogger(HazardService.class);

    RestClient restClient;

    public HazardService(RestClient restClient) {
        this.restClient = restClient;
    }

    public Hazards getHazards() {

        Hazards hazards = restClient.getData();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            String json = objectMapper.writeValueAsString(hazards);
            json = "\n" + json;
            logger.info(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return hazards;
    }

    public double getAverageMagnitude() {
        Hazards hazards = restClient.getData();
        double sum = 0;
        for (int i = 0; i < hazards.features.size(); i++) {
            sum += hazards.features.get(i).properties.mag;
        }
        return sum / hazards.features.size();
    }

    public double getMaxMagnitude() {
        Hazards hazards = restClient.getData();
        double max = 0;
        for (int i = 0; i < hazards.features.size(); i++) {
            if (hazards.features.get(i).properties.mag > max) {
                max = hazards.features.get(i).properties.mag;
            }
        }
        return max;
    }
}
