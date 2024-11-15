package org.example.hazards.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "generated",
        "url",
        "title",
        "status",
        "api",
        "count"
})
@Generated("jsonschema2pojo")
public class Metadata {

    @JsonProperty("generated")
    public Long generated;
    @JsonProperty("url")
    public String url;
    @JsonProperty("title")
    public String title;
    @JsonProperty("status")
    public Integer status;
    @JsonProperty("api")
    public String api;
    @JsonProperty("count")
    public Integer count;
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