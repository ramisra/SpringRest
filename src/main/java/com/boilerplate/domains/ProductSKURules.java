package com.boilerplate.domains;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ratikesh on 1/8/16.
 */
public class ProductSKURules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id" , unique = true, nullable = false)
    private  Long id;
    @Column(name = "skuMinUnit")
    private Integer skuMinUnit;
    @Column(name="skuMaxUnit")
    private  Integer skuMaxUnit;
    @Column(name = "priceFactor")
    private Double priceFactor;
    @ManyToOne(fetch = FetchType.EAGER)
    private ProductSKU productSKU;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createdAt")
    private Date createdAt=new Date();
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updatedAt")
    private Date updatedAt=new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSkuMinUnit() {
        return skuMinUnit;
    }

    public void setSkuMinUnit(int skuMinUnit) {
        this.skuMinUnit = skuMinUnit;
    }

    public int getSkuMaxUnit() {
        return skuMaxUnit;
    }

    public void setSkuMaxUnit(int skuMaxUnit) {
        this.skuMaxUnit = skuMaxUnit;
    }

    public Double getPriceFactor() {
        return priceFactor;
    }

    public void setPriceFactor(Double priceFactor) {
        this.priceFactor = priceFactor;
    }

    public ProductSKU getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(ProductSKU productSKU) {
        this.productSKU = productSKU;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
