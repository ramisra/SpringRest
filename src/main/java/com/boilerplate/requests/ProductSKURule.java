package com.boilerplate.requests;

/**
 * Created by ratikesh on 26/7/16.
 */

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "maxUnit",
        "minUnit",
        "priceFactor"
})
public class ProductSKURule {

    @JsonProperty("maxUnit")
    private Integer maxUnit;
    @JsonProperty("minUnit")
    private Integer minUnit;
    @JsonProperty("priceFactor")
    private Double priceFactor;

    /**
     *
     * @return
     *     The maxUnit
     */
    @JsonProperty("maxUnit")
    public Integer getMaxUnit() {
        return maxUnit;
    }

    /**
     *
     * @param maxUnit
     *     The maxUnit
     */
    @JsonProperty("maxUnit")
    public void setMaxUnit(Integer maxUnit) {
        this.maxUnit = maxUnit;
    }

    /**
     *
     * @return
     *     The minUnit
     */
    @JsonProperty("minUnit")
    public Integer getMinUnit() {
        return minUnit;
    }

    /**
     *
     * @param minUnit
     *     The minUnit
     */
    @JsonProperty("minUnit")
    public void setMinUnit(Integer minUnit) {
        this.minUnit = minUnit;
    }

    /**
     *
     * @return
     *     The priceFactor
     */
    @JsonProperty("priceFactor")
    public Double getPriceFactor() {
        return priceFactor;
    }

    /**
     *
     * @param priceFactor
     *     The priceFactor
     */
    @JsonProperty("priceFactor")
    public void setPriceFactor(Double priceFactor) {
        this.priceFactor = priceFactor;
    }


}
