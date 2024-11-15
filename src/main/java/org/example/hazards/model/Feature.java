package org.example.hazards.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "properties",
        "geometry",
        "id"
})
@Generated("jsonschema2pojo")
public class Feature {

    @JsonProperty("type")
    public String type;
    @JsonProperty("properties")
    public Properties properties;
    @JsonProperty("geometry")
    public Geometry geometry;
    @JsonProperty("id")
    public String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}