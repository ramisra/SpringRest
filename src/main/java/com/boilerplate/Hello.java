package com.boilerplate;

import com.boilerplate.requests.Product;
import com.boilerplate.services.ProductService;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.validation.Valid;

/**
 * Created by ratikesh on 20/7/16.
 */

@RestController
public class Hello extends HandlerInterceptorAdapter{

   // public static  LogBuilder log=new LogBuilder();
    @Autowired
    ProductService productService;
    @RequestMapping(value = "api/products",
            method = RequestMethod.POST,
            consumes = "application/json",
            produces = "application/json")
    @JsonSerialize
    public ResponseEntity postProduct(@Valid @RequestBody Product products, Errors error) {
       // log.getLogging().info("Request Recieved for Product Creation");

        if(error.hasErrors()){
          //log.getLogging().error("Error occured in product request object");
            return ResponseEntity.badRequest().body(ErrorBuilder.fromBindingErrors(error));
        }else{
            try{
                productService.saveProducts(products);
            }catch (Exception e){

            }
        }

        return ResponseEntity.ok(products);
    }


}

