package com.boilerplate.services;

import com.boilerplate.requests.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.transform.Result;

/**
 * Created by ratikesh on 29/7/16.
 */
@Service
public class ProductService {

    @Transactional
    public Product saveProducts(Product product){



        return product;
    }

}
