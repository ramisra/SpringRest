package com.boilerplate.requests;

/**
 * Created by ratikesh on 26/7/16.
 */

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "productId",
        "productName",
        "productType",
        "isAddon",
        "productDescription",
        "brandOutletId",
        "sourceId",
        "productSKUs"
})
public class Product {
    @NotNull(message = "Product Id cannot be ")
    @JsonProperty("productId")
    private String productId;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("productType")
    private Integer productType;
    @JsonProperty("isAddon")
    private Boolean isAddon;
    @JsonProperty("productDescription")
    private String productDescription;
    @JsonProperty("brandOutletId")
    private String brandOutletId;
    @JsonProperty("sourceId")
    private String sourceId;
    @JsonProperty("productSKUs")
    private List<ProductSKU> productSKUs = new ArrayList<ProductSKU>();
    /**
     *
     * @return
     *     The productId
     */
    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    /**
     *
     * @param productId
     *     The productId
     */
    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     *
     * @return
     *     The productName
     */
    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }

    /**
     *
     * @param productName
     *     The productName
     */
    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     *
     * @return
     *     The productType
     */
    @JsonProperty("productType")
    public Integer getProductType() {
        return productType;
    }

    /**
     *
     * @param productType
     *     The productType
     */
    @JsonProperty("productType")
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     *
     * @return
     *     The isAddon
     */
    @JsonProperty("isAddon")
    public Boolean getIsAddon() {
        return isAddon;
    }

    /**
     *
     * @param isAddon
     *     The isAddon
     */
    @JsonProperty("isAddon")
    public void setIsAddon(Boolean isAddon) {
        this.isAddon = isAddon;
    }

    /**
     *
     * @return
     *     The productDescription
     */
    @JsonProperty("productDescription")
    public String getProductDescription() {
        return productDescription;
    }

    /**
     *
     * @param productDescription
     *     The productDescription
     */
    @JsonProperty("productDescription")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     *
     * @return
     *     The brandOutletId
     */
    @JsonProperty("brandOutletId")
    public String getBrandOutletId() {
        return brandOutletId;
    }

    /**
     *
     * @param brandOutletId
     *     The brandOutletId
     */
    @JsonProperty("brandOutletId")
    public void setBrandOutletId(String brandOutletId) {
        this.brandOutletId = brandOutletId;
    }

    /**
     *
     * @return
     *     The sourceId
     */
    @JsonProperty("sourceId")
    public String getSourceId() {
        return sourceId;
    }

    /**
     *
     * @param sourceId
     *     The sourceId
     */
    @JsonProperty("sourceId")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     *
     * @return
     *     The productSKUs
     */
    @JsonProperty("productSKUs")
    public List<ProductSKU> getProductSKUs() {
        return productSKUs;
    }

    /**
     *
     * @param productSKUs
     *     The productSKUs
     */
    @JsonProperty("productSKUs")
    public void setProductSKUs(List<ProductSKU> productSKUs) {
        this.productSKUs = productSKUs;
    }



}
