package com.boilerplate.services;

import com.boilerplate.dao.BaseDao;
import com.boilerplate.domains.Product;
import com.boilerplate.domains.ProductSKU;
import com.boilerplate.domains.ProductSKURules;
import com.boilerplate.requests.ProductSKURule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ratikesh on 29/7/16.
 */
@Service
public class ProductService {

    @Autowired
    BaseDao baseDao;
    @Transactional
    public Product saveProducts(Product productRequest){

        Product product = new Product();
        product.setProductName(productRequest.getProductName());
        product.setProductId(productRequest.getProductId());
        product.setProductDescription(productRequest.getProductDescription());
        product.setAddon(productRequest.isAddon());
        product.setProductType(productRequest.getProductType());
        product.setBrandOutletId(productRequest.getBrandOutletId());
        product.setSourceId(productRequest.getSourceId());
        List<com.boilerplate.requests.ProductSKU>productSKURequest=new ArrayList<com.boilerplate.requests.ProductSKU>();
        List<ProductSKU> productSKUList= productRequest.getProductSKUList();
        for (com.boilerplate.requests.ProductSKU SKU:productSKURequest) {
            ProductSKU productSKU = new ProductSKU();
            productSKU.setProductSKUDescription(SKU.getProductSKUDescription());
            productSKU.setProductSKUName(SKU.getProductSKUName());
            productSKU.setProductSKUId(SKU.getProductSKUId());
            productSKU.setProductSKUPrice(SKU.getProductSKUPrice());
            productSKU.setProductSKUStandardUnit(SKU.getProductSKUStandardUnit());
            productSKU.setProduct(product);
            List<ProductSKURules> productSKURulesList = new ArrayList<ProductSKURules>();
            List<ProductSKURule> productSKURuleRequest = productSKU.getProductSKURulesList();
            for (ProductSKURule SKURule : productSKURuleRequest) {
                ProductSKURules productSKURules = new ProductSKURules();
                productSKURules.setProductSKU(productSKU);
                productSKURules.setPriceFactor(SKURule.getPriceFactor());
                productSKURules.setSkuMaxUnit(SKURule.getMaxUnit());
                productSKURules.setSkuMinUnit(SKURule.getMinUnit());
                productSKURulesList.add(productSKURules);
            }
            productSKU.setProductSKURulesList(productSKURulesList);
            productSKUList.add(productSKU);
        }
        product.setProductSKUList(productSKUList);
        baseDao.save(product);
        return productRequest;
    }

}
