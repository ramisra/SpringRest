package com.boilerplate.domains;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by ratikesh on 31/7/16.
 */
@Table(name = "productSKU")
public class ProductSKU {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id" , unique = true, nullable = false)
    private  Long id;
    @Column(nullable = false,name = "productSKUName")
    private String productSKUName;
    @Column(name="productSKUDescription")
    private  String productSKUDescription;
    @Column(nullable = false, unique = true ,name="productSKUId")
    private String productSKUId;
    @Column(name="productSKUPrice")
    private Double productSKUPrice;
    @Column(name="productSKUStandardUnit")
    private Integer productSKUStandardUnit;

    @ManyToOne(fetch = FetchType.EAGER)
    private Product product;

    @OneToMany(targetEntity = ProductSKURules.class)
    private List productSKURulesList;


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

    public String getProductSKUName() {
        return productSKUName;
    }

    public void setProductSKUName(String productSKUName) {
        this.productSKUName = productSKUName;
    }

    public String getProductSKUDescription() {
        return productSKUDescription;
    }

    public void setProductSKUDescription(String productSKUDescription) {
        this.productSKUDescription = productSKUDescription;
    }

    public String getProductSKUId() {
        return productSKUId;
    }

    public void setProductSKUId(String productSKUId) {
        this.productSKUId = productSKUId;
    }

    public Double getProductSKUPrice() {
        return productSKUPrice;
    }

    public void setProductSKUPrice(Double productSKUPrice) {
        this.productSKUPrice = productSKUPrice;
    }

    public Integer getProductSKUStandardUnit() {
        return productSKUStandardUnit;
    }

    public void setProductSKUStandardUnit(Integer productSKUStandardUnit) {
        this.productSKUStandardUnit = productSKUStandardUnit;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List getProductSKURulesList() {
        return productSKURulesList;
    }

    public void setProductSKURulesList(List productSKURulesList) {
        this.productSKURulesList = productSKURulesList;
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
