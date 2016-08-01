package com.boilerplate.requests;

/**
 * Created by ratikesh on 26/7/16.
 */
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "productSKUName",
        "productSKUDescription",
        "productSKUId",
        "productSKUPrice",
        "productSKUStandardUnit",
        "productAssets",
        "priceSKURules"
})
public class ProductSKU {

    @JsonProperty("productSKUName")
    private String productSKUName;
    @JsonProperty("productSKUDescription")
    private String productSKUDescription;
    @JsonProperty("productSKUId")
    private String productSKUId;
    @JsonProperty("productSKUPrice")
    private Double productSKUPrice;
    @JsonProperty("productSKUStandardUnit")
    private Integer productSKUStandardUnit;
    @JsonProperty("productAssets")
    private List<ProductAssets> productAssets = new ArrayList<ProductAssets>();
    @JsonProperty("priceSKURules")
    private List<ProductSKURule> priceSKURules = new ArrayList<ProductSKURule>();
    /**
     *
     * @return
     *     The productSKUName
     */
    @JsonProperty("productSKUName")
    public String getProductSKUName() {
        return productSKUName;
    }

    /**
     *
     * @param productSKUName
     *     The productSKUName
     */
    @JsonProperty("productSKUName")
    public void setProductSKUName(String productSKUName) {
        this.productSKUName = productSKUName;
    }

    /**
     *
     * @return
     *     The productSKUDescription
     */
    @JsonProperty("productSKUDescription")
    public String getProductSKUDescription() {
        return productSKUDescription;
    }

    /**
     *
     * @param productSKUDescription
     *     The productSKUDescription
     */
    @JsonProperty("productSKUDescription")
    public void setProductSKUDescription(String productSKUDescription) {
        this.productSKUDescription = productSKUDescription;
    }

    /**
     *
     * @return
     *     The productSKUId
     */
    @JsonProperty("productSKUId")
    public String getProductSKUId() {
        return productSKUId;
    }

    /**
     *
     * @param productSKUId
     *     The productSKUId
     */
    @JsonProperty("productSKUId")
    public void setProductSKUId(String productSKUId) {
        this.productSKUId = productSKUId;
    }

    /**
     *
     * @return
     *     The productSKUPrice
     */
    @JsonProperty("productSKUPrice")
    public Double getProductSKUPrice() {
        return productSKUPrice;
    }

    /**
     *
     * @param productSKUPrice
     *     The productSKUPrice
     */
    @JsonProperty("productSKUPrice")
    public void setProductSKUPrice(Double productSKUPrice) {
        this.productSKUPrice = productSKUPrice;
    }

    /**
     *
     * @return
     *     The productSKUStandardUnit
     */
    @JsonProperty("productSKUStandardUnit")
    public Integer getProductSKUStandardUnit() {
        return productSKUStandardUnit;
    }

    /**
     *
     * @param productSKUStandardUnit
     *     The productSKUStandardUnit
     */
    @JsonProperty("productSKUStandardUnit")
    public void setProductSKUStandardUnit(Integer productSKUStandardUnit) {
        this.productSKUStandardUnit = productSKUStandardUnit;
    }

    /**
     *
     * @return
     *     The productAssets
     */
    @JsonProperty("productAssets")
    public List<ProductAssets> getProductAssets() {
        return productAssets;
    }

    /**
     *
     * @param productAssets
     *     The productAssets
     */
    @JsonProperty("productAssets")
    public void setProductAssets(List<ProductAssets> productAssets) {
        this.productAssets = productAssets;
    }

    /**
     *
     * @return
     *     The priceSKURules
     */
    @JsonProperty("priceSKURules")
    public List<ProductSKURule> getPriceSKURules() {
        return priceSKURules;
    }

    /**
     *
     * @param priceSKURules
     *     The priceSKURules
     */
    @JsonProperty("priceSKURules")
    public void setPriceSKURules(List<ProductSKURule> priceSKURules) {
        this.priceSKURules = priceSKURules;
    }

}
