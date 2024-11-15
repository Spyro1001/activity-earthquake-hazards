package org.example.hazards.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "mag",
        "place",
        "time",
        "updated",
        "tz",
        "url",
        "detail",
        "felt",
        "cdi",
        "mmi",
        "alert",
        "status",
        "tsunami",
        "sig",
        "net",
        "code",
        "ids",
        "sources",
        "types",
        "nst",
        "dmin",
        "rms",
        "gap",
        "magType",
        "type",
        "title"
})
@Generated("jsonschema2pojo")
public class Properties {

    @JsonProperty("mag")
    public Double mag;
    @JsonProperty("place")
    public String place;
    @JsonProperty("time")
    public Long time;
    @JsonProperty("updated")
    public Long updated;
    @JsonProperty("tz")
    public Object tz;
    @JsonProperty("url")
    public String url;
    @JsonProperty("detail")
    public String detail;
    @JsonProperty("felt")
    public Integer felt;
    @JsonProperty("cdi")
    public Double cdi;
    @JsonProperty("mmi")
    public Object mmi;
    @JsonProperty("alert")
    public Object alert;
    @JsonProperty("status")
    public String status;
    @JsonProperty("tsunami")
    public Integer tsunami;
    @JsonProperty("sig")
    public Integer sig;
    @JsonProperty("net")
    public String net;
    @JsonProperty("code")
    public String code;
    @JsonProperty("ids")
    public String ids;
    @JsonProperty("sources")
    public String sources;
    @JsonProperty("types")
    public String types;
    @JsonProperty("nst")
    public Integer nst;
    @JsonProperty("dmin")
    public Double dmin;
    @JsonProperty("rms")
    public Double rms;
    @JsonProperty("gap")
    public Integer gap;
    @JsonProperty("magType")
    public String magType;
    @JsonProperty("type")
    public String type;
    @JsonProperty("title")
    public String title;
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