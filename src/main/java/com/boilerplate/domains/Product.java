package com.boilerplate.domains;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by ratikesh on 31/7/16.
 */

@Entity
@Table(name = "outletProducts")

public class Product implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id" , unique = true, nullable = false)
    private  Long id;
    @Column(nullable = false,name = "productName")
    private String productName;
    @Column(name="productType")
    private  Integer productType;
    @Column(name="isAddon")
    private Boolean isAddon;
    @Column(name="productDescription")
    private String productDescription;
    @Column(nullable = false, unique = true ,name="productId")
    private String productId;
    @Column(nullable = false, name="brandOutletId")
    private Long brandOutletId;
    @Column(nullable = false ,name="sourceId")
    private String sourceId;
    @OneToMany(targetEntity = ProductSKU.class)
    private List productSKUList;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public boolean isAddon() {
        return isAddon;
    }

    public void setAddon(boolean addon) {
        isAddon = addon;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Long getBrandOutletId() {
        return brandOutletId;
    }

    public void setBrandOutletId(Long brandOutletId) {
        this.brandOutletId = brandOutletId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
    public List getProductSKUList() {
        return productSKUList;
    }

    public void setProductSKUList(List productSKUList) {
        this.productSKUList = productSKUList;
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
