
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
    "address",
    "borough",
    "cuisine",
    "grades",
    "name",
    "restaurant_id"
})
public class Restaurant {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    private Address address;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("borough")
    private String borough;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cuisine")
    private String cuisine;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grades")
    private List<Object> grades = new ArrayList<Object>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("restaurant_id")
    private String restaurantId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Restaurant withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("borough")
    public String getBorough() {
        return borough;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("borough")
    public void setBorough(String borough) {
        this.borough = borough;
    }

    public Restaurant withBorough(String borough) {
        this.borough = borough;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cuisine")
    public String getCuisine() {
        return cuisine;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cuisine")
    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public Restaurant withCuisine(String cuisine) {
        this.cuisine = cuisine;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grades")
    public List<Object> getGrades() {
        return grades;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grades")
    public void setGrades(List<Object> grades) {
        this.grades = grades;
    }

    public Restaurant withGrades(List<Object> grades) {
        this.grades = grades;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Restaurant withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("restaurant_id")
    public String getRestaurantId() {
        return restaurantId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("restaurant_id")
    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Restaurant withRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
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

    public Restaurant withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
