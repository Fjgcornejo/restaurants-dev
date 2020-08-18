
package com.minsait.onesait.microservice.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "building",
    "coord",
    "street",
    "zipcode"
})
public class Address {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("building")
    private String building;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("coord")
    private List<Object> coord = new ArrayList<Object>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("street")
    private String street;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("building")
    public String getBuilding() {
        return building;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("building")
    public void setBuilding(String building) {
        this.building = building;
    }

    public Address withBuilding(String building) {
        this.building = building;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("coord")
    public List<Object> getCoord() {
        return coord;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("coord")
    public void setCoord(List<Object> coord) {
        this.coord = coord;
    }

    public Address withCoord(List<Object> coord) {
        this.coord = coord;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    public Address withStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zipcode")
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Address withZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Address withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
